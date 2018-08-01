package a1.sintaxejava;

/*
operacao = raw_input()
valor1 = int(raw_input())
valor2 = int(raw_input())

while valor1 != 0 and valor2 != 0:
	if operacao == "+":
	    print(valor1+valor2)
	elif operacao == "-":
	    print(valor1-valor2)
	elif operacao == "*":
	    print(valor1*valor2)
	elif operacao == "/":
	    print(float(valor1)/valor2)
	else:
	    print("comando invalido")
	valor1 = int(raw_input())
	valor2 = int(raw_input())
	operacao = raw_input()
 */

import java.util.Scanner;

public class E8Calculadora {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String operacao = input.nextLine();
        int valor01 = input.nextInt();
        int valor02 = input.nextInt();
        input.nextLine();

        while (valor01 != 0 && valor02 != 0) {

            switch (operacao) {
                case "+":
                    System.out.println(valor01 + valor02);
                case "-":
                    System.out.println(valor01 - valor02);
                case "*":
                    System.out.println(valor01 * valor02);
                case "/":
                    System.out.println(valor01 / valor02);
                default:
                    System.out.println("comando invalido");
            }

            operacao = input.nextLine();
            valor01 = input.nextInt();
            valor02 = input.nextInt();
            input.nextLine();

        }

    }

}