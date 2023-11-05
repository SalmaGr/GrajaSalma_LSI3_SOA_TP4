package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/calculatrice";
        CalculatriceWS calculatrice = new CalculatriceWS();

        // Publiez le service à l'URL spécifiée
        Endpoint.publish(url, calculatrice);

        System.out.println("Service web CalculatriceWS publié à l'adresse : " + url);
    }
}
