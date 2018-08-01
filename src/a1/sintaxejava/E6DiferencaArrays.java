package a1.sintaxejava;

/*
def diferenca_idades(idades1, idades2):
    resultado = []
    for i in range(len(idades1)):
        resultado.append(idades1[i] - idades2[i])
    return resultado

def recebe_idades(idades):  
	idades_str = raw_input().split()
	for idade_str in idades_str:
	    idades.append(int(idade_str))

idades_turma1 = []
idades_turma2 = []
recebe_idades(idades_turma1)
recebe_idades(idades_turma2)
print(diferenca_idades(idades_turma1, idades_turma2))     
 */

import java.util.Arrays;
import java.util.Scanner;

public class E6DiferencaArrays {

    private static int[] recebeIdades (){

        Scanner input = new Scanner(System.in);

        String[] idadesString = input.nextLine().split(" ");
        int[] idades = new int[idadesString.length];

        for (int c = 0; c < idadesString.length; c++){
            idades[c] = Integer.parseInt(idadesString[c]);

        }

        return idades;

    }

    private static int[] diferencaIdades (int[] idades01, int[] idades02) {

        int[] resultado = new int[idades01.length];

        for (int c = 0; c < resultado.length; c++){
            resultado[c] = idades01[c] - idades02[c];
        }

        return resultado;

    }

    public static void main (String[] args){

        int[] idades01 = recebeIdades();
        int[] idades02 = recebeIdades();

        System.out.println(Arrays.toString(diferencaIdades(idades01, idades02)));

    }

}