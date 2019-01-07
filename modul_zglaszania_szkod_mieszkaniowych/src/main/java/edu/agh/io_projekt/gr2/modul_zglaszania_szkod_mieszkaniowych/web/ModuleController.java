package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model.DamageReport;
import edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model.Client;

@RestController
public class ModuleController {

    @RequestMapping(value = "/api/damage_report", method = RequestMethod.POST)
    public String postDamageReport(
        @RequestParam(value = "clientNumber") String clientNumber,
        @RequestParam(value = "damageDescription") String damageDescription) {

        if (Client.verifyNumber(clientNumber)) {
            DamageReport newDamageReport = new DamageReport(damageDescription, new Client(clientNumber));

            return newDamageReport.getId() + " -> " + newDamageReport.getDamageDescription();
        } else
            return "Błędny numer klienta";
    }

    @RequestMapping(value = "/api/decision", method = RequestMethod.GET)
    public String getDecision(
        @RequestParam(value = "clientNumber") int clientNumber, //TODO: Zamienić na String
        @RequestParam(value = "damageReportId") int damageReportId) {

        return "";
    }

    @RequestMapping(value = "/api/decision", method = RequestMethod.POST)
    public String postDecision() // TODO: Dodać parametry
        {

        return "";
    }

    @RequestMapping(value = "/api/insurances", method = RequestMethod.GET)
    public String getClientInsurances(
        @RequestParam(value = "clientNumber") String clientNumber) {

        //Pozyskanie informacji o kliencie jeszcze nie jest zaimplementowane w ClientData
        //if (Client.verifyNumber(clientNumber))
            return Client.getClientInsurances(clientNumber);

        //return "";
    }
}