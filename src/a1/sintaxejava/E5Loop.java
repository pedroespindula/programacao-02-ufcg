package a1.sintaxejava;

/*
idades = []
idades_str = raw_input().split()
for idade_str in idades_str:
    idades.append(int(idade_str))
media = sum(idades)/float(len(idades))
print("media: " + media)
 */

import java.util.Scanner;

public class E5Loop {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        String[] idadesString = input.nextLine().split(" ");
        double soma = 0;

        for (int c = 0; c < idadesString.length; c++){

            soma += Integer.parseInt(idadesString[c]);

        }

        double media = soma / idadesString.length;

        System.out.println("media: " + media);

        input.close();

    }

}