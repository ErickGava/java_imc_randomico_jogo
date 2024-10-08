public class imprimir {
    public static void imprima(double imc){

        String classificacao;  /* CLASSIFICAÇÃO DE PESO: ABAIXO, NORMAL OU SOBREPESO */
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
        System.out.printf("Seu IMC é: %.2f\n", imc);/* EXIBE OS RESULTADOS DA CALSSIFICACAO */
        System.out.println("Classificação: " + classificacao);
    }
}
