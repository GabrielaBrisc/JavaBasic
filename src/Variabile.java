import org.w3c.dom.ls.LSOutput;

public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        //strongly typed - trebuie sa specif tipul de date al var cu care lucram
        //string = sir de caractere

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        //suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Gabi";
        nume = "Brisc";
        int varsta = 27;
        //concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta);
    }

}

