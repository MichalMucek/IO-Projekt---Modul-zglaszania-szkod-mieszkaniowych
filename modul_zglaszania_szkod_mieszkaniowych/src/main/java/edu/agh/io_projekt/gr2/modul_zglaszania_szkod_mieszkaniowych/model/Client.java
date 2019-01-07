package edu.agh.io_projekt.gr2.modul_zglaszania_szkod_mieszkaniowych.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {
    String number;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Client(String number) {
        this.number = number;
    }

    void sendDamageReport(DamageReport formularz) {

    }

    void fillDamageReport(DamageReport formularz) {

    }

    public static boolean verifyNumber(String number) {
        boolean numberExists = false;

        try {
            URL url = new URL("http://localhost:4040/client/" + number);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");

            Integer status = httpURLConnection.getResponseCode();

            System.out.println("Client.verifyNumber(String number): number = " + number + " | status = " + status + " | url = " + url.toString());

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

    public static String getClientInsurances(String number) {
        try {
            URL url = new URL("http://localhost:4040/client/" + number + "/insurances/HOME");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");

            System.out.println("Próba połączenia z " + url.toString());

            Integer status = httpURLConnection.getResponseCode();

            System.out.println("Status połączenia z " + url.toString() + " -> " + status);

            if (status == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuffer response = new StringBuffer();
                String inputLine;

                while((inputLine = bufferedReader.readLine()) != null)
                    response.append(inputLine);

                bufferedReader.close();
                httpURLConnection.disconnect();

                return response.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "";
    }
}
