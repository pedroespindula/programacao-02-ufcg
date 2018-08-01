package a1.sintaxejava;

/*
palavra = raw_input()
vogais = 0
for letra in palavra:
    if letra in 'aeiou':
        vogais += 1
print(str(vogais) + " vogais")     
 */

import java.util.Scanner;

public class E7ContaVogais {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        String palavra = input.next();
        int vogais = 0;

        for (int c = 0; c < palavra.length(); c++){

            char l = palavra.charAt(c);

            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                vogais += 1;
            }
        }

        System.out.println(vogais);

    }

}