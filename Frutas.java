import java.util.ArrayList;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Morango");

        System.out.println("Frutas:");
        for (String fruta : frutas) {
            System.out.printf("%s%n", fruta);
        }
    }
}