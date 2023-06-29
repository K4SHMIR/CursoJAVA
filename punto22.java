import java.util.Random;

public class SueldoNeto {
    public static void main(String[] args) {
        Random random = new Random();
        
        int contador = 0;
        while (contador < 10) {
            System.out.println("Empleado " + (contador + 1));
            
            // Generar categoría al azar
            String categoria = generarCategoriaAleatoria(random);
            
            // Generar sueldo al azar
            double sueldo = generarSueldoAleatorio(random);
            
            // Verificar que los valores sean válidos
            if (esCategoriaValida(categoria) && esSueldoValido(sueldo)) {
                calcularSueldoNeto(categoria, sueldo);
                contador++;
            } else {
                System.out.println("Valores inválidos. Vuelva a intentarlo.");
            }
            
            System.out.println("-----------------------------");
        }
    }
    
    private static String generarCategoriaAleatoria(Random random) {
        String[] categorias = {"A", "B", "C"};
        int indice = random.nextInt(categorias.length);
        return categorias[indice];
    }
    
    private static double generarSueldoAleatorio(Random random) {
        double sueldoMinimo = 1000;
        double sueldoMaximo = 5000;
        return sueldoMinimo + (sueldoMaximo - sueldoMinimo) * random.nextDouble();
    }
    
    private static boolean esCategoriaValida(String categoria) {
        return categoria.equals("A") || categoria.equals("B") || categoria.equals("C");
    }
    
    private static boolean esSueldoValido(double sueldo) {
        return sueldo >= 1000 && sueldo <= 5000;
    }
    
    private static void calcularSueldoNeto(String categoria, double sueldo) {
        double sueldoNeto = sueldo;
        
        // Cálculo del sueldo neto según las reglas del ejercicio
        
        // ...
        
        System.out.println("Categoría: " + categoria);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
