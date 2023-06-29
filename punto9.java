import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int jugador2 = scanner.nextInt();

        String resultado;

        if (jugador1 == jugador2) {
            resultado = "Empate";
        } else if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            resultado = "Jugador 1 es el ganador";
        } else if ((jugador1 == 2 && jugador2 == 0) || (jugador1 == 0 && jugador2 == 1) || (jugador1 == 1 && jugador2 == 2)) {
            resultado = "Jugador 2 es el ganador";
        } else {
            resultado = "Elecciones inválidas";
        }

        System.out.println("Resultado: " + resultado);
    }
}
