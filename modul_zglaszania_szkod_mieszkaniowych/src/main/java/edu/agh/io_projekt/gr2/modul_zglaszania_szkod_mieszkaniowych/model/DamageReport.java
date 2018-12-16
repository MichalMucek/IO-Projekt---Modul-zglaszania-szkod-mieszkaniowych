package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DamageReport {
    String id;
    String damageDescription;
    Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public DamageReport(String damageDescription, Client client) {

        //TODO: Przypisanie id po wysłaniu zgłoszenia na serwer
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
