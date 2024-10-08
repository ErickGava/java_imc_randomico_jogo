public class calculadora {
    public static double calcular(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }
}
