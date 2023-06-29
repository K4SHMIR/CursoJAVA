import java.util.Scanner;

public class CaracteristicasAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase del auto (a, b, c): ");
        char claseAuto = scanner.nextLine().charAt(0);

        switch (claseAuto) {
            case 'a':
                System.out.println("El auto de clase A tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("El auto de clase B tiene 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println("El auto de clase C tiene 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println("La clase del auto ingresada no es válida.");
                break;
        }
    }
}
