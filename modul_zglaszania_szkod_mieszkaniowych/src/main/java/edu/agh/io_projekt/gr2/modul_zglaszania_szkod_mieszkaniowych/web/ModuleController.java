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
        @RequestParam(value = "clientNumber") int clientNumber,
        @RequestParam(value = "damageDescription") String damageDescription) {

        Client klient = new Client(clientNumber);

        if (klient.verifyNumber()) {
            DamageReport newDamageReport = new DamageReport(damageDescription, klient);
            DamageReport.damageReportDataStore.add(newDamageReport);

            return newDamageReport.getId() + " -> " + newDamageReport.getDamageDescription();
        } else
            return "Błędny numer klienta";
    }

    @RequestMapping(value = "/api/decision", method = RequestMethod.GET)
    public String getDecision(
        @RequestParam(value = "clientNumber") int clientNumber,
        @RequestParam(value = "damageReportId") int damageReportId) {

        return "";
    }
}