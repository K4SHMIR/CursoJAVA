public class PromedioEvaluaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la primera evaluación:");
        int evaluacion1 = scanner.nextInt();
        
        System.out.println("Ingrese la segunda evaluación:");
        int evaluacion2 = scanner.nextInt();
        
        System.out.println("Ingrese la tercera evaluación:");
        int evaluacion3 = scanner.nextInt();
        
        int sumaPares = 0;
        int cantidadPares = 0;
        
        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
            cantidadPares++;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
            cantidadPares++;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
            cantidadPares++;
        }
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;
        
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        
        System.out.println("Suma de los valores pares: " + sumaPares);
    }
}
