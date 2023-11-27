import java.sql.SQLOutput;

public class Functii {
    //functie (metoda) = logica delimitata care poate fi refolosita
    //nu putem fol spatii in nume
    //nu putem def o fctie in alta fct (nu pot instala firefox in chrome
    //functia putem sa o vedem ca o micuta app

    //o f simpla care ne printeaza ceva pe ecran si
    // nu returneaza/nu ne da nimic (nu are return)
    //nu are parametri
    //void = inseamna ca nu ne da nicun rasp
    public static void printGreeting(){ //ne aduce aici cand dam ctrl+click
        System.out.println("Buna ziua!");
    }

    //o f simpla care saluta clientul in f de numele lui
    // nu returneaza/nu ne da nimic (nu are return)
    //are nevoie parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua! " + nume +" " + prenume);
    }

    //o f care calc media a 3 nr
    // ne da un rasp (are return)
    //ce tip de date va avea raspunsul? 3+5 = 8
    //are nevoie parametri
    public static double mediaNr(double a, double b, double c){ //mediaNr e functia
        double media = (a + b+ c )/3;
        return media;  // asa da f un raspuns
    }

    //o f care ne da val lui pi
    // ne da un rasp (are return)
    //rasp va fi double
    //are nevoie parametri? nu, deoarece val lui pi este aceeasi la orice rulare
    public static double piValue(){
        //constanta - variabila care nu poate fi suprascrisa, se scrie cu uppercase
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) { //desktopul nostru: ce vedem, shortcut ul 
        //intra clientul unu
        printGreeting(); //se apeleaza f

        //intra clientul 2
        printGreeting(); //ctrl+click pe f => ne duce la corpul ei

        //apelam o fctie cu parametrii oferind argumente
        printGreetingByName("Brisc", "Gabi");
        printGreetingByName("Brisc", "Iulian");
        printGreetingByName("Kiss", "Stefan");

        System.out.println(mediaNr(3 , 3 , 3 ));
        double media1 = mediaNr(35666 , 36545 , 34);
        double media2 = mediaNr(356 , 369 , 34);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(piValue());
        System.out.println(piValue());

        //tema: aria unui dreptunghi
        //aria cercului
        //suma a 2 nr
        //o f care returneaza cate caractere are numele + prenumele hint: String nume = "Gabi"; soutprintln(nume.length()) -o sa fie dinamica
        //identif probleme de logica

    }
}
