package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vestiging {
    //attributen
    private String plaats;
    private String manager;
    ArrayList<Auto> autos;

    //constructor
    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        autos = new ArrayList<>();
    }

    //methode
    public void voegAutoToe(Auto auto) {
        autos.add(auto);
    }

    @Override
    public String toString() {
        Collections.sort(autos);
        StringBuilder resultStringBuilder = new StringBuilder();
        resultStringBuilder.append(String.format("Plaats: %s \nManager: %s \n", plaats, manager));
        for (Auto autoInstantie : autos) {
            resultStringBuilder.append(autoInstantie + "\n");
        }
        return resultStringBuilder.toString();
    }

    // Schrijf de methode geefAutosNaDatum(), die alle auto’s van de vestiging toont die na de opgegeven datum hun kenteken hebben gekregen. Kijk in het klassendiagram voor de juiste signature!
    public ArrayList<Auto> geeftAutosNaDatum(LocalDate datum){
        ArrayList<Auto> autoMetDatumNaLijst = new ArrayList<>();
        for (Auto autoInstantie : autos){
            if (autoInstantie.getDatumAfgifteKenteken().isAfter(datum)){
                autoMetDatumNaLijst.add(autoInstantie);
            }
        }
        return autoMetDatumNaLijst;
    }




}

