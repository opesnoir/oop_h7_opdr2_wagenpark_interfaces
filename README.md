# oop_h7_opdracht3_wagenpark_interfaces-

LET OP:
public class Vestiging {
String plaats;
String manager;
ArrayList<Auto> autos;

public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        autos = new ArrayList<>(); // deze moet je toevoegen, anders werkt de onderstaande methode niet!
    }

System.out.println("methode 2 niet gelijk aan antwoord model");
//maak auto aan
Auto[] auto = new Auto[3];
auto[0] = new Auto("Tesla", "model s 100D", LocalDate.of(2019, 5, 5), 12646, "TR-264-X");
auto[1] = new Auto("Dacia", "model Logan MPV", LocalDate.of(2017, 8, 16), 46367, "KS-567-W");
auto[2] = new Auto("Toyota", "model Prius", LocalDate.of(2015, 3, 2), 63234, "GG-111-K");

//test het printen van Auto klasse
        System.out.println(auto[0]);

//maak vestiging aan
        Vestiging vestigingGoumere = new Vestiging("Goumere", "Albert Mol");
//voeg de autos toe aan de vestiging
        vestigingGoumere.voegAutoToe(auto[0]);
        vestigingGoumere.voegAutoToe(auto[1]);
        vestigingGoumere.voegAutoToe(auto[2]);
        System.out.println(vestigingGoumere);

//print autos na datum
        ArrayList<Auto> autosNaDatum = vestigingGoumere.geeftAutosNaDatum(LocalDate.of(2016, 12, 31));
        System.out.println("De auto’s van de vestiging met een datum na 31 december 2016.");
        for (Auto autoInstantie : autosNaDatum) {
            System.out.println(autoInstantie);
        }