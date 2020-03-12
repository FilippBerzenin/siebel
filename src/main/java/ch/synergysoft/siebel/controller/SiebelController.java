package ch.synergysoft.siebel.controller;

import ch.synergysoft.siebel.model.Models;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController("/")
public class SiebelController {

    @GetMapping("siebel-rest/v1.0/workspace/MyWorkspace/SIS Account List Applet")
    public ResponseEntity<String> SISAccountListApplet(){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.SISAccountListApplet);
    }

    // add WriteRecordLonger here
    @PutMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1/Control/WriteRecord")
    public ResponseEntity<String> WriteRecord(@RequestBody String jsonBody){

        // check payload for been equal to ONE OF input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.WriteRecord);
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.WriteRecord);
    }

    @PutMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1")
    public ResponseEntity<String> PutSISAccountListApplet_1(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "").body(Models.SISAccountListApplet_1);
        else
            return ResponseEntity.ok().header("Content-Type", "").body(Models.SISAccountListApplet_1);

    }

    // del Longer from path and rename class
    @PutMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1/Control/WriteRecordLonger")
    public ResponseEntity<String> WriteRecordLonger(@RequestBody String jsonBody) {
        return ResponseEntity.ok().header("Content-Type", "").body(Models.WriteRecordLonger);
    }

    @DeleteMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1")
    public ResponseEntity<Void> DelSISAccountListApplet_1(){
        return ResponseEntity.ok().header("Content-Type", "").body(null);
    }

    @GetMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<String> GetAccount884XVPD(){
        return ResponseEntity.ok().header("Content-Type", "").body(Models.GetAccount884XVPD);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<String> PutAccount884XVPD(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.PutAccount884XVPD);
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.PutAccount884XVPD);
    }

    @PostMapping("siebel-rest/v1.0/data/Account/Account")
    public ResponseEntity<String> Account(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.Account);
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.Account);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD/Contact")
    public ResponseEntity<String> Contact(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "").body(Models.Contact);
        else
            return ResponseEntity.ok().header("Content-Type", "").body(Models.Contact);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD/Contact/88-4W6YS")
    public ResponseEntity<String> Contact884W6YS(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.status(201).header("Content-Type", "").body(Models.Contact884W6YS);
        else
            return ResponseEntity.status(201).header("Content-Type", "").body(Models.Contact884W6YS);
    }

    @DeleteMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<Void> Contact884W6YS(){
        return ResponseEntity.ok().header("Content-Type", "").body(null);
    }

    @PostMapping("siebel-rest/v1.0/service/Siebel Account/ QueryByExample?PageSize=2&ViewMode=All")
    public ResponseEntity<String> QueryByExample(@RequestBody String jsonBody){

        // check payload for been equal to input body
        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.QueryByExample);
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.QueryByExample);
    }

    @PostMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/CreateUser")
    public ResponseEntity<Void> CreateUser(@RequestBody String jsonBody){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

    @PostMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/SynchronizeUser")
    public ResponseEntity<Void> SynchronizeUser(@RequestBody String jsonBody){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

    @DeleteMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/TerminateUser")
    public ResponseEntity<Void> TerminateUser(@RequestBody String jsonBody){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

}
