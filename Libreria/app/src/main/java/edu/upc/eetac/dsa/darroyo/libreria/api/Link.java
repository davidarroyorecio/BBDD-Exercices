package edu.upc.eetac.dsa.darroyo.libreria.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David W8.1 on 12/05/2015.
 */
public class Link {

    private String target;
    private Map<String, String> parameters;

    public Link() {
        parameters = new HashMap<String, String>();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
