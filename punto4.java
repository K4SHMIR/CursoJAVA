import java.util.Scanner;

public class CategoriaFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría familiar (a, b o c): ");
        char categoria = scanner.nextLine().charAt(0);

        String mensaje;

        switch (categoria) {
            case 'a':
                mensaje = "hijo";
                break;
            case 'b':
                mensaje = "padres";
                break;
            case 'c':
                mensaje = "abuelos";
                break;
            default:
                mensaje = "Categoría no válida";
                break;
        }

        System.out.println("La categoría corresponde a: " + mensaje);
    }
}
