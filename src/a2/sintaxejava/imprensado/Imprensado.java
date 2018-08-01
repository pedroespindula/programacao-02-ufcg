package a2.sintaxejava.imprensado;

/*
 No jogo do imprensado, um número aleatório X é escolhido
 e o jogador deve imprensar esse número.
 
 Para isso, a cada rodada o jogador deve tentar adivinhar
 o número e o computador deve dizer se o número escolhido
 pelo jogador é maior ou menor que o número escolhido
 pelo computador.
 
 Se o jogador escolher os números X+1 e X-1, ele ganha.
 Se em algum momento o jogador escolher o número X, ele
 perde.
 
 MENU:
 1) Iniciar Partida
 2) Historico
 3) Sair
 
 Sua escolha? 1
 
 Ok, escolhi um numero entre 1 e 100.
 
 Chute? 23
 Menor
 Chute? 20
 Maior
 Chute? 21
 Voce ganhou! (22)
 
 1) Iniciar Partida
 2) Historico
 3) Sair 
 
 Sua escolha? 1
 
 Ok, escolhi um numero entre 1 e 100.
 
 Chute? 42
 Voce perdeu! (42)
 
 1) Iniciar Partida
 2) Historico
 3) Sair 
 
 Sua escolha? 2
 
 - 1 derrota
 - 1 vitoria
 
 1) Iniciar Partida
 2) Historico
 3) Sair 
 
 Sua escolha? 3
 
 Xau!
 */

import java.util.Random;
import java.util.Scanner;

public class Imprensado {

    private static int derrotasPartida = 0;
    private static int vitoriasPartida = 0;
    private static Scanner input = new Scanner(System.in);
    private static Random randomGen = new Random();

    public static void main (String[] args) {

        int modo;

        mostrarInstrucoes();

        do {
            mostrarMenu();

            System.out.print("Escolha o modo: ");
            modo = Integer.parseInt(input.nextLine());
            System.out.print("\n\r");

            switch (modo){
                case 1: iniciarPartida(); break;
                case 2: mostrarInstrucoes(); break;
                case 3: mostrarHistorico(); break;
                case 4: System.out.print("Obrigado por jogar!\n\r"); break;
                default: System.out.print("Comando invalido! Tente novamente.\n\r"); break;
            }

        } while (modo != 4);

    }

    private static void mostrarInstrucoes (){

        System.out.print("- INSTRUÇÕES:\n\r" +
                "No jogo do imprensado, um número aleatório X é escolhido\n\r" +
                "e o jogador deve imprensar esse número.\n\r" +
                "\n\r" +
                "Para isso, a cada rodada o jogador deve tentar adivinhar\n" +
                "o número e o computador deve dizer se o número escolhido\n" +
                "pelo jogador é maior ou menor que o número escolhido\n" +
                "pelo computador.\n" +
                "\n" +
                "Se o jogador escolher os números X+1 e X-1, ele ganha.\n" +
                "Se em algum momento o jogador escolher o número X, ele\n" +
                "perde.\n\r" +
                "--------------------------------------------------------\n\r");

    }

    private static void mostrarMenu () {

        System.out.print("\n\r- MENU:\n\r" +
                "1) Iniciar Partida\n\r" +
                "2) Instruções\n\r" +
                "3) Histórico\n\r" +
                "4) Sair\n\r");

    }

    private static void mostrarHistorico () {
        System.out.print("- Derrotas: " + derrotasPartida + "\n\r" +
                         "- Vitórias: " + vitoriasPartida + "\n\r");

    }

    private static void iniciarPartida() {

        int numeroEscolhido;
        int numeroGerado;
        boolean flagDireita = false;
        boolean flagEsquerda = false;

        numeroGerado = randomGen.nextInt(99) + 1;
        System.out.print("Ok, escolhi um número entre 1 e 99. Tente adivinhar qual foi!\n\r");

        do {
            System.out.print("Diga um número: ");
            numeroEscolhido = Integer.parseInt(input.nextLine());

            if (numeroEscolhido == numeroGerado + 1) {
                flagDireita = true;
            }
            if (numeroEscolhido == numeroGerado - 1) {
                flagEsquerda = true;
            }
            if (numeroEscolhido == numeroGerado) {
                System.out.print("Você perdeu! (" + numeroGerado + ")\n\r");
                derrotasPartida++;
                break;
            }

            if (numeroEscolhido < numeroGerado) {
                System.out.print("O número é maior.\n\r");
            }
            if (numeroEscolhido > numeroGerado) {
                System.out.print("O número é menor.\n\r");
            }

        } while (!(flagDireita && flagEsquerda));

        if (flagDireita && flagEsquerda) {
            System.out.print("Você ganhou (" + numeroGerado + ")\n\r");
            vitoriasPartida++;
        }

    }

}
