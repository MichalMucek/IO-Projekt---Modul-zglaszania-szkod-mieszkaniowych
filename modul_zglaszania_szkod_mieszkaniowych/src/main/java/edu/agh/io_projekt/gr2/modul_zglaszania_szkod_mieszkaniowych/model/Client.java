package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.net.HttpURLConnection;
import java.net.URL;

public class Client {
    Integer number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Client(int number) {
        this.number = number;
    }

    void sendDamageReport(DamageReport formularz) {

    }

    void fillDamageReport(DamageReport formularz) {

    }

    public boolean verifyNumber() {
        boolean numberExists = false;

        try {
            URL baseUrl = new URL("https://localhost:4040/");
            URL url = new URL(baseUrl, number.toString());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");

            Integer status = httpURLConnection.getResponseCode();

            switch (status) {
            case 200: // OK
                numberExists = true;
                break;
            case 300: // Client with given ID does not exist
                // TODO: Exception() z kodem i wiadomością
                numberExists = false;
                break;
            default:
                // TODO: Obsługa kodów odpowiedzi 302, 303, 400, 500
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numberExists;
    }
}
