package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.Formularz;
import edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.Klient;

@RestController
public class ModuleController {

    //
    //Jedynie dla sprawdzenia, czy dział i działa :D
    //Postman -> [POST] localhost:8080/api/damage_report?clientId=456&damageDescription=zalanie mieszkania
    @RequestMapping(value = "/api/damage_report", method = RequestMethod.POST/*, produces = "application/json"*/)
    public String postDamageReport(
    @RequestParam(value = "clientId") int clientId, 
    @RequestParam(value = "damageDescription") String damageDescription) {
        
        Klient klient = new Klient(0, clientId);
        Formularz formularz = new Formularz(0, damageDescription, klient);

        return formularz.getOpisSzkody();
    }
}