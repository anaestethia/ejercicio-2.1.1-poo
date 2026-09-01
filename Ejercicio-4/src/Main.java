public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(10.5, 4.0);
        double resta = calculadora.restar(10.5, 4.0);
        double multiplicacion = calculadora.multiplicar(10.5, 4.0);
        double division = calculadora.dividir(10.5, 4.0);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
