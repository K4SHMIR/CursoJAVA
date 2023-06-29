import java.util.Scanner;

public class SueldoNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la categoría del empleado (A, B o C):");
        String categoria = scanner.nextLine();
        
        System.out.println("Ingrese la antigüedad del empleado en años:");
        int antiguedad = scanner.nextInt();
        
        System.out.println("Ingrese el sueldo del empleado:");
        double sueldo = scanner.nextDouble();
        
        double sueldoNeto = sueldo;
        
        // Determinar aumento por antigüedad
        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldo * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldo * 0.10;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldo * 0.30;
        }
        
        // Determinar plus por categoría
        switch (categoria) {
            case "A":
                sueldoNeto += 1000;
                break;
            case "B":
                sueldoNeto += 2000;
                break;
            case "C":
                sueldoNeto += 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return; // Terminar la ejecución del programa
        }
        
        System.out.println("Sueldo neto del empleado: " + sueldoNeto);
    }
}
