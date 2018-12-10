package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.util.ArrayList;
import java.util.List;

public class Decision {
    boolean isAccepted;
    String substantiation; 
    int id;

    public static List<Decision> decisionDataStore = new ArrayList<>();

    public Decision(boolean isAccepted, String substantiation, int id) {
        this.isAccepted = isAccepted;
        this.substantiation = substantiation;
        this.id = id;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public String getSubstantiation() {
        return substantiation;
    }

    public void setSubstantiation(String substantiation) {
        this.substantiation = substantiation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void sendDecision() {

    }
}
