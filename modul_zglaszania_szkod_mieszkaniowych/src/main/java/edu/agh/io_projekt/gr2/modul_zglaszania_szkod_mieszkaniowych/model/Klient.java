package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.net.HttpURLConnection;
import java.net.URL;

public class Klient {
    Integer nrKlienta;

    public void setNrKlienta(int nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    public int getNrKlienta() {
        return nrKlienta;
    }

    public Klient(int nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    void wyslijFormularz(Formularz formularz) {

    }

    void wypelnijFormularz(Formularz formularz) {

    }

    public boolean zweryfikujNumer() {
        boolean numerIstnieje = false;

        try {
            URL baseUrl = new URL("https://facebook.com/"); // TODO: Wpisać właściwy adres, gdy wszystko już będzie gotowe
            URL url = new URL(baseUrl, nrKlienta.toString());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");

            Integer status = httpURLConnection.getResponseCode();
            status = 200;

            switch (status) {
            case 200: // OK
                numerIstnieje = true;
                break;
            case 300: // Client with given ID does not exist
                // TODO: Exception() z kodem i wiadomością
                numerIstnieje = false;
                break;
            default:
                // TODO: Obsługa kodów odpowiedzi 302, 303, 400, 500
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numerIstnieje;
    }
}
