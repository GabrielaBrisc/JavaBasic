import org.w3c.dom.ls.LSOutput;

/*recap:
variabile
tipuri de date: char, string, int, double(in java)/float(python), boolean

Operatori
- Aritmetici: +, - , * , / , %

- De comparare: <>, == , != , >=, <=

- Logici: &&, ||, ! (not)

- Flow control (conditionale)
if else - evalueaza conditii si bifurca codul in functie de rezultat

 */
public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare && initializare
        int b = 5;
//        a= b; //ia val lui b - suprascriere
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(12>b);
        System.out.println(a!= b); //3 diferit de 5 -> true
        System.out.println(a-1>b);
        System.out.println(a==b);
        System.out.println(7>b && 8>b); // 7>5 si 8>5 true & true - > true
        System.out.println(3>b && 8>b); // false SI true -> false
        System.out.println(7>b || 8>b); // 7>5 si 8>5 true & true - > true
        System.out.println(3>b || 8>b); // false SAU true -> True
        System.out.println(3>b || 2>b); // false SAU false -> False
        System.out.println(7>b && (8>b || 3>b)); // True SI True - > True //prima data executam paranteza
        System.out.println(7>b && (2>b || 3>b)); //True SI False - > False
        System.out.println(7>b || (2>b || 3>b)); //True Sau(or) False - > True
        System.out.println(!(7>b )); //  !(True) - > False // inverseaza raspunsul
/*
    SI: si una si cealalta e falsa -> false
        si una si cealalta e true - > true
             una falsa alta true  - > false
    SAU:sau una sau alta true -> true
        sau una sau alta false -> false
          una true alta false - > true - e nevoie doar de un statement true in sau ca sa fie true

 */

    }


}
