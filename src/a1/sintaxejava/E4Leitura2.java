package a1.sintaxejava;

/*
nome, idade_str = raw_input().split()
sobrenome = raw_input()
idade = int(idade_str)
if idade == 18:
    print("\o\ |o/ \o/ /o/")
elif idade < 18:
    print(nome + " " + sobrenome + ", meu bb!")
else:
    print(nome + " " + sobrenome + ", oi tio!")
 */

import java.util.Scanner;

public class E4Leitura2 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        String[] dados = input.nextLine().split(" ");
        String sobrenome = input.next();

        String nome = dados[0];
        int idade = Integer.parseInt(dados[1]);

        if (idade == 18){
            System.out.println("\\o\\ |o/ \\o/ /o/");

        } else if (idade < 18){
            System.out.println(nome + " " + sobrenome + ", meu bb!");

        } else {
            System.out.println(nome + " " + sobrenome + ", oi tio!");

        }

        input.close();


    }

}