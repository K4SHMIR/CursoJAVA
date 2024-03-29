import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible
        int minimo = Integer.MAX_VALUE; // Inicializar con el valor máximo posible

        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + numero);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
