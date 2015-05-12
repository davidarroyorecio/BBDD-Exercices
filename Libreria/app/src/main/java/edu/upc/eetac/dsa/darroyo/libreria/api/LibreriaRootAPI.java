package edu.upc.eetac.dsa.darroyo.libreria.api;

/**
 * Created by David W8.1 on 12/05/2015.
 */
import java.util.HashMap;
import java.util.Map;

public class LibreriaRootAPI {

    private Map<String, Link> links;

    public LibreriaRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}