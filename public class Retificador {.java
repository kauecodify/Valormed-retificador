public class Retificador {
    public static void main(String[] args) {

        double amplitude = 10.0;
        double frequencia = 60.0;
        double anguloFase = 0.0;
        double periodo = 1.0 / frequencia; 

        double valorMedio = calcularValorMedioRetificador(amplitude, frequencia, anguloFase, periodo);
        
        System.out.println("O valor médio do retificador é: " + valorMedio);
    }


    public static double calcularValorMedioRetificador(double amplitude, double frequencia, double anguloFase, double periodo) {

        double valorMedioPositivo = (2 * amplitude) / Math.PI;
        double valorMedioNegativo = 0;
        double valorMedioTotal = valorMedioPositivo + valorMedioNegativo;

        return valorMedioTotal;
    }
}
