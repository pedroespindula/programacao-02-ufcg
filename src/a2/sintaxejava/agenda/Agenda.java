package a2.sintaxejava.agenda;

/*
operacao = ""

while operacao != "S":
	print("bem vindo a agenda. escolha uma opcao:")
	print("* (C)ADASTRAR NOME/TELEFONE")
	print("* (I)MPRIMIR NOMES/TELEFONES")
	print("* (P)ROCURAR NOME")
	print("* (A)PAGAR CADASTRO")
	print("* (S)AIR")
	# ...
 */

import java.util.Scanner;

public class Agenda {

    private static String[] nomesCadastrados = new String[1000];
    private static String[] telefonesCadastrados = new String[1000];
    private static int quantidadeCadastros = 0;

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        char operacao;
        String nomeContato;
        String telefoneContato;
        int posicao;

        System.out.println("Bem vindo a Agenda Virtual v1.1.0");

        do {System.out.println("Escolha uma opção:\n\r" +
                               "* (C)ADASTRAR NOME/TELEFONE\n\r" +
                               "* (I)MPRIMIR NOMES/TELEFONES\n\r" +
                               "* (P)ROCURAR NOME\n\r" +
                               "* (A)PAGAR CADASTRO\n\r" +
                               "* (S)AIR");

            System.out.print("Digite a operação a ser realizada: ");
            operacao = input.nextLine().toUpperCase().charAt(0);

            switch (operacao) {

                case 'C': {
                    System.out.print("Digite o nome do contato: ");
                    nomeContato = input.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    telefoneContato = input.nextLine();

                    cadastrar(nomeContato, telefoneContato);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                }
                case 'I': {
                    imprimir();
                    break;
                }
                case 'P': {
                    System.out.print("Digite o nome a ser procurado: ");
                    nomeContato = input.nextLine();

                    procurar(nomeContato);
                    break;
                }
                case 'A': {
                    System.out.print("Digite a posição do contato a ser excluido: ");
                    posicao = Integer.parseInt(input.nextLine());

                    apagar(posicao);
                    System.out.print("Contato apagado com sucesso!");
                    break;
                }
                case 'S':
                    break;

                default:
                    System.out.println("Comando invalido!");

            }
            System.out.println();

        } while (operacao != 'S');

    }


    private static void cadastrar (String nomeContato, String telefoneContato){
        nomesCadastrados[quantidadeCadastros] = nomeContato;
        telefonesCadastrados[quantidadeCadastros] = telefoneContato;

        quantidadeCadastros += 1;
    }


    private static void imprimir () {

        for (int c = 0; c < quantidadeCadastros; c++){
            imprimeContato(c);
        }
    }

    private static void procurar (String nome) {

        boolean achouContato = false;

        for (int c = 0; c < quantidadeCadastros; c++){
            if (nome.equals(nomesCadastrados[c])){
                imprimeContato(c);
                achouContato = true;
                break;
            }
        }
        if (!achouContato) {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void apagar (int posicao) {

        System.arraycopy(telefonesCadastrados, posicao + 1,
                         telefonesCadastrados, posicao,
                  quantidadeCadastros - posicao);
        System.arraycopy(nomesCadastrados, posicao + 1,
                         nomesCadastrados, posicao,
                  quantidadeCadastros - posicao);

        quantidadeCadastros -= 1;
    }

    private  static void imprimeContato(int posicao){

        System.out.println(posicao + ". " + nomesCadastrados[posicao] + ": " + telefonesCadastrados[posicao]);

    }

}