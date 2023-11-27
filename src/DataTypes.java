public class DataTypes {
    public static void main(String[] args) {
        //ce incepe cu litera mare sunt tipuri de date non primitive
        //cele mai folosite 4 tipuri de date

        // string = sir caractere delimitate de " "
        // doar valoarea unei variabile de tip string are "" (eg: "audi"
        String marca = "Audi";
        String model = "A3";

        //aflam dimensiunea unui string, length, toUpperCase - metode ajutatoare
        System.out.println(marca.length());

        //scriem cu litere mari
        System.out.println(marca.toUpperCase());

        //integer = numar intreg, (int)
        int an_fabricatie = 2010;


        //double = numar zecimal
        double pret = 10000.50;

        //boolean = adevarat sau fals (0 = false, 1= true)
        boolean inmatriculata = false;

        //char = un singur caracter #, $ , 2, d
        char nota = 'A';
     
    }
}
