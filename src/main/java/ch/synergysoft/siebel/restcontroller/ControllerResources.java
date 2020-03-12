package ch.synergysoft.siebel.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.synergysoft.siebel.service.SeibelService;


@RestController
public class ControllerResources {
	
	@Autowired
	private SeibelService service;
	
	private String path;

	
	@GetMapping(
			value = "/siebel-rest/v1.0/workspace/MyWorkspace/SIS Account List Applet",
			produces = MediaType.APPLICATION_JSON_VALUE)
			@ResponseStatus(HttpStatus.OK)
	public String getSiebelAllRepositoryResource() {
		path = "get_payload_resources.json";
		return service.getJSONPayload(path).toString();
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
		return service.createOtputResource (newResources, name, type).toJSONString();
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
			value = " /siebel-rest/v1.0/data/Account/Account/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	private String deleteSiebelRepositoryResource (
			@PathVariable("id") String id) {
				return "OK";
		
	}
}
