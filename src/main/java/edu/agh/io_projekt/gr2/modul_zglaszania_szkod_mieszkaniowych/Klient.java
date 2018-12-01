package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych;

public class Klient {
    int id;
    int nrKlienta;

    public void setId(int id) {
        this.id = id;
    }

    public void setNrKlienta(int nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    public int getId() {

        return id;
    }

    public int getNrKlienta() {
        return nrKlienta;
    }

    public Klient(int id, int nrKlienta) {

        this.id = id;
        this.nrKlienta = nrKlienta;
    }

    void wyslijFormularz(Formularz formularz) {

    }

    void wypelnijFormularz(Formularz formularz) {

    }
}
