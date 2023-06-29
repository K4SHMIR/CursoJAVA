import java.util.Scanner;

public class EvaluacionesAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de las tres evaluaciones
        System.out.print("Ingrese la nota de la evaluación 1: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 2: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 3: ");
        double evaluacion3 = scanner.nextDouble();

        // Cálculo del promedio
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        // Verificación del estado del alumno
        if (promedio >= 7) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está reprobado.");
        }
    }
}
