package ch.synergysoft.siebel.restcontroller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.parser.ParseException;


@RestController
public class Controller {
	
	private String path;

	
	@GetMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/SIS Account List Applet",
			produces = MediaType.APPLICATION_JSON_VALUE)
			@ResponseStatus(HttpStatus.OK)
	public String getSiebelAllRepositoryResource() {
		path = "c:\\work\\siebel\\src\\main\\java\\ch\\synergysoft\\siebel\\example\\json\\get_payload.json";
		return getJSONPayload(path).toString();
	}
	
	@PutMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/Applet/{name}/Control/{type}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String putSiebelChildRepositoryResource(
			@PathVariable("name") String name,
			@PathVariable("type") String type,
			@RequestBody String newResources
			) {
		return validatePutObject (newResources, name, type).toJSONString();
	}
	
	
	//TODO
	// i don't understand this method?
//	@PutMapping(
//			value = " /siebel-rest/v1.0/workspace/MyWorkspace/Applet/{name}/Control/{type}",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseStatus(HttpStatus.OK)
//	public String upsertSiebelCRMChildRepositoryResource (
//			@PathVariable("name") String name,
//			@PathVariable("type") String type,
//			@RequestBody String newResources) {
//				return newResources;
//		
//	}
	
	@DeleteMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/Applet/{name}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	private String deleteSiebelRepositoryResource (
			@PathVariable("name") String name) {
				return "OK";
		
	}
	
	private JSONObject validatePutObject (String newResources, String name, String typeRecord) {
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
					return outputJson;
				} else {
					outputJson.put("Name", jSONObjectInput);
				}
		}	
		
	}
		return outputJson;
	}
	
	private Optional<JSONObject> getJSONPayloadJson (String json) {
		JSONObject data = null;
	    try {
			JSONParser parser = new JSONParser();
			data = (JSONObject) parser.parse(json);
	    } catch (org.json.simple.parser.ParseException e) {
	        e.printStackTrace();
	    }
		return Optional.of(data);
	}
	
	private Optional<JSONObject> getJSONPayload (String path) {
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
