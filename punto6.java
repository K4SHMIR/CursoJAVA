import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de curso: ");
        int curso = scanner.nextInt();

        String texto;

        if (curso == 0) {
            texto = "jardín de infantes";
        } else if (curso >= 1 && curso <= 6) {
            texto = "primaria";
        } else if (curso >= 7 && curso <= 12) {
            texto = "secundaria";
        } else {
            texto = "No se encontró un curso válido";
        }

        System.out.println("El curso pertenece a: " + texto);
    }
}
