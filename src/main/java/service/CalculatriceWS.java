package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatriceWS {
    @WebMethod(operationName = "somme")
    public double somme (@WebParam(name = "Val1") double a, @WebParam(name = "Val2")double b){
        // La méthode effectue une opération de somme simple.
        return a+b;
    }
}
/**
 * Cette classe 'CalculatriceWS' représente un service web JAX-WS qui expose la méthode 'somme' permettant de
 * réaliser une addition. Les annotations JAX-WS sont utilisées pour définir comment cette classe et sa méthode
 * doivent être exposées en tant que service web.
 * - @WebService : Cette annotation indique que cette classe est un service web.
 * - @WebMethod : Cette annotation indique que la méthode 'somme' doit être exposée en tant qu'opération web.
 * - @WebParam : Ces annotations définissent les noms des paramètres de la méthode dans le service web.
 * Par conséquent, cette classe peut être déployée en tant que service web et la méthode 'somme' peut être
 * appelée à distance via des requêtes SOAP.
 */
