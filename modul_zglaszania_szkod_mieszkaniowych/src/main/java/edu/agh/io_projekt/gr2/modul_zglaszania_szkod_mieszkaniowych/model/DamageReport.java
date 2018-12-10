package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.util.ArrayList;
import java.util.List;

public class DamageReport {
    int id;
    String damageDescription;
    Client client;

    public static List<DamageReport> damageReportDataStore = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public DamageReport(int id, String damageDescription, Client client) {

        this.id = id;
        this.damageDescription = damageDescription;
        this.client = client;
    }

    void sendDamageReport() {

    }

    void read() {

    }

    void show() {

    }
}
