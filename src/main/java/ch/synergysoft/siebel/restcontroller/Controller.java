package ch.synergysoft.siebel.restcontroller;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
import java.io.FileReader;
import java.util.Iterator;

import ch.synergysoft.siebel.model.Greeting;

@RestController
public class Controller {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private String path;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/SIS Account List Applet",
			produces = MediaType.APPLICATION_JSON_VALUE)
			@ResponseStatus(HttpStatus.OK)
	public String getSiebelResoucres() {
		path = "c:\\work\\siebel\\src\\main\\java\\ch\\synergysoft\\siebel\\example\\json\\get_payload.json";
		return getJSONPayload (path);
	}
	
	@PutMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS AccountList Applet_1/Control/WriteRecord",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String getSiebelFilipp() {
		path = "c:\\work\\siebel\\src\\main\\java\\ch\\synergysoft\\siebel\\example\\json\\put_response.json";
		return getJSONPayload (path);
	}
	
	public String getJSONPayload (String path) {
	    try {
	        JSONParser parser = new JSONParser();
	        JSONObject data = (JSONObject) parser.parse(
	              new FileReader(path));

	        String json = data.toJSONString();
	        return json;
	    } catch (IOException | org.json.simple.parser.ParseException e) {
	        e.printStackTrace();
	    }
		return "Error";
	}

}
