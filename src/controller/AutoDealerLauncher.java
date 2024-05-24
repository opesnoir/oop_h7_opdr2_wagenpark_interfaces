package controller;

import model.Auto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoDealerLauncher {
    public static void main(String[] args) {

        //maak auto aan
        Auto[] auto = new Auto[3];
        auto[0] = new Auto("Tesla", "model s 100D", LocalDate.of(2019,5,5) , 12646, "TR-264-X");
        auto[1] = new Auto("Dacia", "model Logan MPV", LocalDate.of(2017,8,16) , 46367, "KS-567-W");
        auto[2] = new Auto("Toyota", "model Prius", LocalDate.of(2015,3,2) , 63234, "GG-111-K");

        for (int i = 0; i < auto.length; i++) {
            System.out.println(auto[i].toString());
        }


    }

}
