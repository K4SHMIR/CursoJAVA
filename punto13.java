import java.util.Scanner;

public class DeterminarCantidadDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int cantidadDias;

        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
                break;
            case "febrero":
                cantidadDias = 28;
                System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
                break;
            default:
                System.out.println("El mes ingresado no es válido.");
                break;
        }
    }
}
