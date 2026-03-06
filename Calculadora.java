public class Calculadora {

    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para seleccionar la operación
    public int realizarOperacion(String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":         return suma();
            case "resta":        return resta();
            case "multiplicar":  return multiplicar();
            case "dividir":      return dividir();
            default:
                System.out.println("Operación no reconocida.");
                return 0;
        }
    }

    // Suma — rama main (Commit Inicial)
    public int suma() {
        return num1 + num2;
    }

    // Resta — rama "resta"
    public int resta() {
        return num1 - num2;
    }

    // Multiplicar — rama "multiplicar"
    public int multiplicar() {
        return num1 * num2;
    }

    // Dividir — rama "dividir" (creada desde multiplicar)
    public int dividir() {
        if (num2 == 0) {
            System.out.println("Error: división entre cero.");
            return 0;
        }
        return num1 / num2;
    }
}
