package a1.sintaxejava;

/*
idade = int(raw_input())
soma = 0
qntd = 0
while idade != 0:
    soma += idade
    qntd += 1
    print("media atual: " + str(float(soma)/qntd))
    idade = int(raw_input())
 */

import java.util.Scanner;

public class E5LoopIndefinido {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int idade = input.nextInt();
        double soma = 0;
        int qntd = 0;

        while (idade != 0) {

            soma += idade;
            qntd += 1;

            System.out.println("media atual: " + (soma / qntd));

            idade = input.nextInt();
        }


    }

}