import java.util.Scanner;

public class CantidadDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine().toLowerCase();

        int cantidadDias;

        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            default:
                cantidadDias = -1; // Valor inválido para indicar que el mes ingresado no es válido
                break;
        }

        if (cantidadDias != -1) {
            System.out.println("El mes de " + nombreMes.substring(0, 1).toUpperCase() + nombreMes.substring(1) + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("El mes ingresado no es válido.");
        }
    }
}