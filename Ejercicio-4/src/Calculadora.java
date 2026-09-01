public class Calculadora {
    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double dividir(double dividendo, double divisor) {
        if (divisor == 0.0) {
            System.out.println("Advertencia: no es posible dividir por cero.");
            return 0.0;
        }

        return dividendo / divisor;
    }
}
