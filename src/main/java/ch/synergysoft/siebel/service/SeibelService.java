package ch.synergysoft.siebel.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
public class SeibelService {
	
	public JSONObject createOtputObject (String newResources, String id) {
		JSONObject jSONObjectInput = getJSONPayloadJson (newResources).get();
		JSONObject outputJson = new JSONObject();
		if (jSONObjectInput.isEmpty()) {
			return jSONObjectInput;
		} else {
				outputJson = new JSONObject();				
				HashMap<String, String> jsonLinkIn = new HashMap<>();
					jsonLinkIn.put("rel",  "self");
					jsonLinkIn.put("href", "http://ServerName:port/siebel-rest/v1.0/data/Account/Account/"+id);
					jsonLinkIn.put("name", "Account");					
				HashMap<String, Object> jsonLink = new HashMap();
					jsonLink.put("link", jsonLinkIn);
					jsonLink.put("Name", jSONObjectInput.get("Name"));
					jsonLink.put("Id", id);
					jsonLink.put("Location", jSONObjectInput.get("Location"));
					jsonLink.put("Primary Organization Id", jSONObjectInput.get("Primary Organization Id"));
					jsonLink.put("Primary Organization", jSONObjectInput.get("Primary Organization"));
					jsonLink.put("Description", jSONObjectInput.get("Description"));
				outputJson.put("items", jsonLink);
		
		}
		return outputJson;
	}

		
	public JSONObject createOtputResource (String newResources, String name, String typeRecord) {
		JSONObject jSONObjectInput = getJSONPayloadJson (newResources).get();
		JSONObject outputJson = new JSONObject();
		if (jSONObjectInput.isEmpty()) {
			return jSONObjectInput;
		} else {
			if(typeRecord.equals("WriteRecord")) {
				outputJson = new JSONObject();
				
				HashMap<String, String> jsonLinkIn = new HashMap<>();
					jsonLinkIn.put("rel",  "self");
					jsonLinkIn.put("href", "/siebel-rest/v1.0/workspace/MyWorkspace/Applet/"+name);
					jsonLinkIn.put("name", "Applet");				
				HashMap<String, Object> jsonLink = new HashMap();
					jsonLink.put("link", jsonLinkIn);				
				outputJson.put("workspace/MyWorkspaceApplet", jsonLink);
				if (jSONObjectInput.size()==1) {
					outputJson.put("Name", name);
				} else {
					outputJson.put("Name", jSONObjectInput);
				}
		}	
		
	}
		return outputJson;
	}
	
	public Optional<JSONObject> getJSONPayloadJson (String json) {
		JSONObject data = null;
	    try {
			JSONParser parser = new JSONParser();
			data = (JSONObject) parser.parse(json);
	    } catch (org.json.simple.parser.ParseException e) {
	        e.printStackTrace();
	    }
		return Optional.of(data);
	}
	
	public Optional<JSONObject> getJSONPayload (String path) {
		JSONObject data = null;
	    try {
	        JSONParser parser = new JSONParser();
	        data = (JSONObject) parser.parse(
	              new FileReader(path));
	    } catch (IOException | ParseException e) {
	        e.printStackTrace();
	    }
		return Optional.of(data);
	}
}
