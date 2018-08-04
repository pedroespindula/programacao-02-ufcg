package a1.sintaxejava;

/*
# Código Python:
minha_altura = 1.83
meu_peso = 76.5
bmi = meu_peso / (minha_altura ** 2)
print(bmi)
 */

public class E2OperacoesAritmeticas {

    public static void main (String[] args) {

        double minhaAltura = 1.83;
        double meuPeso = 76.5;

        double bmi = meuPeso / (Math.pow(minhaAltura, 2));

        System.out.println(bmi);

    }

}
