package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

public class InsuranceCompany {
    String companyName;
    int id;

    public InsuranceCompany(String companyName, int id) {
        this.companyName = companyName;
        this.id = id;
    }

    public String getNazwaFirmy() {
        return companyName;
    }

    public void setNazwaFirmy(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
