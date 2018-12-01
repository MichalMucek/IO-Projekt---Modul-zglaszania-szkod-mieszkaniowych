package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych;

public class Formularz {
    int id;
    String opisSzkody;
    Klient klient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpisSzkody() {
        return opisSzkody;
    }

    public void setOpisSzkody(String opisSzkody) {
        this.opisSzkody = opisSzkody;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Formularz(int id, String opisSzkody, Klient klient) {

        this.id = id;
        this.opisSzkody = opisSzkody;
        this.klient = klient;
    }

    void przeslijFormularz() {

    }

    void wczytaj() {

    }

    void wyswietl() {

    }
}
