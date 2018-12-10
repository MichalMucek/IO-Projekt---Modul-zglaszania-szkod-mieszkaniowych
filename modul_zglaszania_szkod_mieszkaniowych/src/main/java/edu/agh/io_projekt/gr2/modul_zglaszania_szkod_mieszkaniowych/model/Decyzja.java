package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

public class Decyzja {
    boolean czyPrzyjeta;
    String uzasadnienie; 
    int id;

    public Decyzja(boolean czyPrzyjeta, String uzasadnienie, int id) {
        this.czyPrzyjeta = czyPrzyjeta;
        this.uzasadnienie = uzasadnienie;
        this.id = id;
    }

    public boolean isCzyPrzyjeta() {
        return czyPrzyjeta;
    }

    public void setCzyPrzyjeta(boolean czyPrzyjeta) {
        this.czyPrzyjeta = czyPrzyjeta;
    }

    public String getUzasadnienie() {
        return uzasadnienie;
    }

    public void setUzasadnienie(String uzasadnienie) {
        this.uzasadnienie = uzasadnienie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void przekazDecyzje() {

    }
}
