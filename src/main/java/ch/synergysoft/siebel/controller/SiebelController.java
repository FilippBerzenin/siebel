package ch.synergysoft.siebel.controller;

import ch.synergysoft.siebel.model.Models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController("/")
public class SiebelController {

    @Autowired
    private Models models;

    @GetMapping("siebel-rest/v1.0/workspace/MyWorkspace/SIS Account List Applet")
    public ResponseEntity<String> SISAccountListApplet(){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.SISAccountListApplet);
    }

    @PutMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1/Control/WriteRecord")
    public ResponseEntity<String> WriteRecord(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() )
            return ResponseEntity.badRequest().header("Content-Type", "").body("Invalid or empty body");
        else if ( models.isEqualsJSON(Models.bodyWriteRecord,jsonBody) )
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.WriteRecord);
        else if( models.isEqualsJSON(Models.bodyWriteRecordLonger,jsonBody) )
            // no application/json
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.WriteRecordLonger);
        else
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
    }

    @PutMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1")
    public ResponseEntity<String> PutSISAccountListApplet_1(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyPutSISAccountListApplet_1,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            // no application/json
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.SISAccountListApplet_1);

    }

    @DeleteMapping("siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet_1")
    public ResponseEntity<Void> DelSISAccountListApplet_1(){
        return ResponseEntity.ok().header("Content-Type", "").body(null);
    }

    @GetMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<String> GetAccount884XVPD(){
        // no application/json
        return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.GetAccount884XVPD);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<String> PutAccount884XVPD(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyPutAccount884XVPD,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.PutAccount884XVPD);
    }

    @PostMapping("siebel-rest/v1.0/data/Account/Account")
    public ResponseEntity<String> Account(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyAccount,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.Account);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD/Contact")
    public ResponseEntity<String> Contact(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyContact,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            // no application/json
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.Contact);
    }

    @PutMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD/Contact/88-4W6YS")
    public ResponseEntity<String> Contact884W6YS(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyContact884W6YS,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            // no application/json
            return ResponseEntity.status(201).header("Content-Type", "application/json").body(Models.Contact884W6YS);
    }

    @DeleteMapping("siebel-rest/v1.0/data/Account/Account/88-4XVPD")
    public ResponseEntity<Void> Contact884W6YS(){
        return ResponseEntity.ok().header("Content-Type", "").body(null);
    }

    //404 not found is use full path ( siebel-rest/v1.0/service/Siebel Account/ QueryByExample?PageSize=2&ViewMode=All )
    @PostMapping("siebel-rest/v1.0/service/Siebel Account/ QueryByExample")
    public ResponseEntity<String> QueryByExample(@RequestBody String jsonBody, @RequestParam String PageSize, @RequestParam String ViewMode){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyQueryByExample,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(Models.QueryByExample);
    }

    @PostMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/CreateUser")
    public ResponseEntity<String> CreateUser(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodyCreateUser,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

    @PostMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/SynchronizeUser")
    public ResponseEntity<String> SynchronizeUser(@RequestBody String jsonBody){

        if( jsonBody == null || jsonBody.isEmpty() || !(models.isEqualsJSON(Models.bodySynchronizeUser,jsonBody)) )
            return ResponseEntity.status(406).header("Content-Type", "").body("Invalid or empty body");
        else
            return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

    @DeleteMapping("siebel-rest/v1.0/service/LS Clinical User Provisioning Service/TerminateUser")
    public ResponseEntity<String> TerminateUser(){
        return ResponseEntity.ok().header("Content-Type", "application/json").body(null);
    }

}
