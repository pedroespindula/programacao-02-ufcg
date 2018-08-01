package a1.sintaxejava;

/*
idade = int(raw_input())
if idade == 18:
    print("\o\ |o/ \o/ /o/")
elif idade < 18:
    print("meu bb!")
else:
    print("oi tio!") 
 */

import java.util.Scanner;

public class E4Leitura {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int idade = input.nextInt();

        if (idade == 18){
            System.out.println("\\o\\ |o/ \\o/ /o/");
        } else if (idade < 18) {
            System.out.println("meu bb!");
        } else {
            System.out.println("oi tio!");
        }

        input.close();

    }

}