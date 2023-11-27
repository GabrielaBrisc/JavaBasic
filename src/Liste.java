import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        //adaugam elem in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elem
        fructe.get(0);
        System.out.println(fructe.get(0));

        //cum se afla indexul unui elem
        System.out.println(fructe.indexOf("banana"));

        //este lista noastra goala
        System.out.println(fructe.isEmpty());

        //eliminam toate elem din lista
//        fructe.clear();

        //scoatem un elem
        fructe.remove("mar");

        //listam elem
        System.out.println(fructe);

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        if (!fructe.isEmpty()){ //daca Nu este goala
            System.out.println("Avem ce manca");
        }else {
            System.out.println("Nu avem ce manca");
        }

        //declaram o lista imutabila si o initialiam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(numere);

        //declaram o lista dinamica
        String[] flowers = {"Menta", "Lalea", "Trandafir"}; //array
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers)); //parcurge florile si le transforma intr o lista
        flowerList.add("Rose"); //noua lista unde putem sa adaugam sau sa stergem
        System.out.println(flowerList);

        //aflam unde este lalea
        int lalea_index = flowerList.indexOf("Lalea");

        //stergem ce este in acea pozitie
        flowerList.remove(lalea_index);
        //scoatem in functie de valoare
        flowerList.remove("Trandafir");
//        System.out.println(Arrays.toString(flowerList.toArray()));
        System.out.println(flowerList);
//        System.out.println(flowers); // nu merge array clasic
    }
}

