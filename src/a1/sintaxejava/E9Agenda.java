
package a1.sintaxejava;

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

public class E9Agenda {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        char operacao = 'X';

        String nome;
        String telefone;
        boolean flagProcurar;
        int posicao;

        String[] nomesCadastrados = new String[1000];
        String[] telefonesCadastrados = new String[1000];
        int cadastros = 0;

        System.out.println("Bem vindo à Agenda v1.0.0");

        while (operacao != 'S'){

            System.out.println("Escolha uma opção:\n\r" +
            "* (C)ADASTRAR NOME/TELEFONE\n\r" +
            "* (I)MPRIMIR NOMES/TELEFONES\n\r" +
            "* (P)ROCURAR NOME\n\r" +
            "* (A)PAGAR CADASTRO\n\r" +
            "* (S)AIR");

            System.out.print("Digite a operação a ser realizada: ");
            operacao = input.nextLine().charAt(0);
            System.out.println();

            switch (operacao) {

                case 'C':
                    System.out.print("Digite o nome do contato: ");
                    nome = input.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    telefone = input.nextLine();

                    nomesCadastrados[cadastros] = nome;
                    telefonesCadastrados[cadastros] = telefone;

                    cadastros += 1;
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 'I':
                    System.out.println("Lista de todos os contatos: ");
                    for (int c = 0; c < cadastros; c++) {
                        System.out.println(c + ". " + nomesCadastrados[c] + ": " + telefonesCadastrados[c]);
                    }
                    System.out.println("----------------------------");
                    break;

                case 'P':
                    System.out.print("Digite o nome do contato: ");
                    nome = input.nextLine();

                    flagProcurar = false;

                    for (int c = 0; c < cadastros; c++) {
                        if (nome.equals(nomesCadastrados[c])) {
                            System.out.println(c + ". " + nome + ": " + telefonesCadastrados[c]);
                            flagProcurar = true;
                        }
                    }

                    if (!flagProcurar) {
                        System.out.println("Contato Inexistente.");
                    }
                    break;

                case 'A':
                    System.out.print("Digite a posição do contato: ");
                    posicao = Integer.parseInt(input.nextLine());

                    System.arraycopy(telefonesCadastrados, posicao + 1,
                            telefonesCadastrados, posicao, cadastros - posicao);
                    System.arraycopy(nomesCadastrados, posicao + 1,
                            nomesCadastrados, posicao, cadastros - posicao);

                    cadastros -= 1;
                    System.out.println("Contato apagado com sucesso!");
                    break;

                case 'S':
                    break;

                default:
                    System.out.println("Comando inválido");
            }
            System.out.println();
        }

    }

}
