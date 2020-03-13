package ch.synergysoft.siebel.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.synergysoft.siebel.service.SeibelService;

@RestController
public class ControllerObject {
	
	@Autowired
	private SeibelService service;
	
	private String path;
	
	@GetMapping(
			value = "/siebel-rest/v1.0/data/Account/Account/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
			@ResponseStatus(HttpStatus.OK)
	public String getSiebelParentBusinessObject (
			@PathVariable("id") String id
			) {
		path = "get_payload_objects.json";
		return service.getJSONPayload(path).toString();
		
	}
	
	@PutMapping(
			value = "/siebel-rest/v1.0/data/Account/Account/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String putSiebelChildBusinessObject(
			@PathVariable("id") String name,
			@RequestBody String newResources
			) {
		return service.createOtputObject (newResources, name).toJSONString();
	}
	
	@PostMapping(
			value = "http://ServerName:port/siebel-rest/v1.0/data/Account/Account/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String putSiebelParentBusinessObject (
			@PathVariable("id") String name,
			@RequestBody String newResources
			) {
		return service.createOtputObject (newResources, name).toJSONString();
	}
	
//	//TODO	
//	public String putSiebelChildBusinessObject () {
//		return "ok";
//	}
//	
//	//	TODO
//	public String upsertingSiebelChildBusinessObject () {
//		return "ok";
//	}
//	
//	@DeleteMapping (
//			value  = "/siebel-rest/v1.0/data/Account/Account/88-4XVPD"
//			)
//	public String deletingSiebelBusinessObject () {
//		return "OK";
//		
//	}

}
