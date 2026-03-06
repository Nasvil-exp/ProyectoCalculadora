public class pruebaCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora(10, 5);

        System.out.println("=== Prueba de Calculadora ===");
        System.out.println("Números: 10 y 5");
        System.out.println();

        System.out.println("Suma:          " + calc.realizarOperacion("suma"));
        System.out.println("Resta:         " + calc.realizarOperacion("resta"));
        System.out.println("Multiplicar:   " + calc.realizarOperacion("multiplicar"));
        System.out.println("Dividir:       " + calc.realizarOperacion("dividir"));

        // Prueba división entre cero
        System.out.println();
        System.out.println("--- Prueba división entre cero ---");
        Calculadora calcCero = new Calculadora(10, 0);
        System.out.println("Dividir por 0: " + calcCero.realizarOperacion("dividir"));
    }
}
