package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

public class Ubezpieczyciel {
    String nazwaFirmy;
    int id;

    public Ubezpieczyciel(String nazwaFirmy, int id) {
        this.nazwaFirmy = nazwaFirmy;
        this.id = id;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
