import java.util.List;

public class Inteiros {
    public static void main(String[] args) {
        List<Integer> inteiros = List.of(10, 3, 2, 20, 30, 15, 69, 22);
        
        int maiorValor = maior(inteiros);
        System.out.println("Maior Valor da Lista: " + maiorValor);

        int menorValor = menor(inteiros);
        System.out.println("Menor Valor da Lista: " + menorValor);
    }

    public static int maior(List<Integer> valor) {
        int maiorValor = Integer.MIN_VALUE;
        for (int i = 0; i < valor.size(); i++) {
            if (maiorValor < valor.get(i)) {
                maiorValor = valor.get(i);
            }
        }
        return maiorValor;
    }

    public static int menor(List<Integer> valor) {
        int menorValor = Integer.MAX_VALUE;
        for (int i = 0; i < valor.size(); i++) {
            if (menorValor > valor.get(i)) {
                menorValor = valor.get(i);
            }
        }

        return menorValor;
    }
}
