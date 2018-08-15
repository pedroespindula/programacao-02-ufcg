package a3.classes_agenda;

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

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Menu menu = new Menu("- Menu: " + System.lineSeparator() +
                                         "1. Cadastrar contato" + System.lineSeparator() +
                                         "2. Imprimir contatos" + System.lineSeparator() +
                                         "3. Procurar contato" + System.lineSeparator() +
                                         "4. Apagar contato" + System.lineSeparator() +
                                         "5. Sair");

        int decisao = 0;

        do {
            decisao = menu.escolhaOpcao();

            switch (decisao) {
                case 1: {
                    String nomeContato = menu.recolheEntrada("o nome do contato");
                    String telefoneContato = menu.recolheEntrada("o telefone do contato");

                    agenda.cadastrarContato(new Contato(nomeContato, telefoneContato));
                    break;
                }
                case 2: {
                    agenda.imprimirContatos();
                    break;
                }
                case 3: {
                    String nomeContato = menu.recolheEntrada("o nome do contato");
                    System.out.println(agenda.procurarContato(nomeContato));
                    break;
                }
                case 4: {
                    String nomeContato = menu.recolheEntrada("o nome do contato");
                    agenda.apagarContato(nomeContato);
                    break;
                }
                case 5: {
                    System.out.println("Obrigado!");
                    break;
                }
                default: {
                    System.out.println("Opção inexistente. Tente novamente!");
                }
            }

        } while (decisao != 5);
    }

}
