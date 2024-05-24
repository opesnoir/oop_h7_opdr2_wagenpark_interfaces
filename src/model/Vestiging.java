package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vestiging {
    //attributen
    private String plaats;
    private String manager;
    List<Auto> autos;

    //constructor
    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
    }

    //methode
    public void voegAutoToe(Auto auto){

    }

    @Override
    public String toString() {
        Collections.sort(autos);
        StringBuilder resultStringBuilder = new StringBuilder();
        resultStringBuilder.append(String.format("Plaats: %s \n Manager: %s \n", plaats, manager));
        for (Auto autoInstantie : autos){
            resultStringBuilder.append(autoInstantie + "\n");
        }
        return resultStringBuilder.toString();
    }

    public void geefAutosNaDatum(LocalDate datum){
        List<Auto> autos = new ArrayList<>();
    }
}
