import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //map = reprezentare de date in sistem cheie valoare
        //eg: gigel are nota 10, costel are nota 9

        //declaram un map
        Map<String,Integer> note_elevi = new HashMap<>();

        //adaugam elem
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota" + note_elevi.get( "Ana"));

        //actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel are noua nota de" + note_elevi.get("Costel"));
        //aflam dimens
        note_elevi.size();
        System.out.println(note_elevi.size());

        //stergem val
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());


        //declaram si initializam cu valori
        //map nu este ordonat
        Map<String, Integer> luni = new HashMap<>(){{
            put("Ian", 1);
            put("Feb", 2);
            put("Mar", 3);
            put("Apr", 4);
        }};
        System.out.println(luni);
    }
}
