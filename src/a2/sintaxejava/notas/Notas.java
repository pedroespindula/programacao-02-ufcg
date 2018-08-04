package a2.sintaxejava.notas;

/*
Sistema de controle de notas de P2.

Execução: java Main 3
(primeiro argumento é o número de notas)

1) Cadastrar Aluno
2) Cadastrar/Alterar Nota
3) Imprimir Aluno
4) Imprimir Turma
5) Sair

Escolha? 1

Nome? Matheus
Matricula? 20411003
...
Escolha? 2
Nota? 1
Resultado? 9.0
...
Escolha? 3
Matricula? 20411003
Média: 3.0
...
Escolha? 4
Alunos? 1
Média? 3.0
...
Escolha? 5
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Notas {

    private static Scanner input = new Scanner(System.in);

    private static Map<String, Aluno> turmaAlunos;  // Matricula --> Aluno

	public static void main(String[] args) {

	        int operacao;
	        int quantidadeNotas = 3;

	        turmaAlunos = new HashMap<>();

	        do {

                operacao = menuInicial();

                switch (operacao) {

                    case 1: {
                        cadastrarAluno(quantidadeNotas);
                        break;
                    }
                    case 2: {

                        System.out.print("Matrícula do aluno: ");
                        String matriculaAluno = input.nextLine();

                        cadastrarNota(matriculaAluno);

                        break;
                    }
                    case 3: {

                        System.out.print("Matrícula do aluno: ");
                        String matriculaAluno = input.nextLine();

                        System.out.println();

                        imprimirAluno(matriculaAluno);
                        break;
                    }
                    case 4: {
                        imprimirTurma();
                        break;
                    }
                    case 5: {
                        System.out.println("Até mais!");
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida");
                        break;
                    }
                }

            } while (operacao != 5);

	}

	private static int menuInicial() {

        System.out.println("\n\r==========================");
	    System.out.print("- MENU:\n\r" +
                         "1) Cadastrar aluno\n\r" +
                         "2) Cadastrar/alterar nota\n\r" +
                         "3) Imprimir aluno\n\r" +
                         "4) Imprimir turma\n\r" +
                         "5) Sair\n\r");

        System.out.print("Digite a opção desejada: ");
	    int opcaoEscolhida = Integer.parseInt(input.nextLine());

        System.out.println("==========================\n\r");

	    return opcaoEscolhida;

    }

    private static void cadastrarAluno(int quantidadeNotas) {

        System.out.print("Matrícula do aluno: ");
        String matriculaAluno = input.nextLine();
        System.out.print("Nome do aluno: ");
	    String nomeAluno = input.nextLine();

        turmaAlunos.put(matriculaAluno, new Aluno(matriculaAluno, nomeAluno, quantidadeNotas));

    }

    private static void cadastrarNota(String matriculaAluno) {

        if (turmaAlunos.containsKey(matriculaAluno)) {

            Aluno aluno = turmaAlunos.get(matriculaAluno);

            System.out.print("Nota a ser alterada: ");
            int idNota = Integer.parseInt(input.nextLine());
            System.out.print("Valor da nota: ");
            double valorNota = Double.parseDouble(input.nextLine());

            aluno.setNota(idNota, valorNota);
            
        } else {

            System.out.println("O aluno não está cadastrado na turma.");
            
        }

    }

    private static void imprimirAluno(String matriculaAluno) {

	    if (turmaAlunos.containsKey(matriculaAluno)) {

	        Aluno aluno = turmaAlunos.get(matriculaAluno);

            System.out.print("Matrícula: " + aluno.getMatricula() + "\n\r" +
                             "Nome: " + aluno.getNome() + "\n\r");

            int cont = 1;
            for(double nota: aluno.getNotas()) {
                System.out.printf("Nota %d: %3.1f\n", cont, nota);
                cont++;
            }

            System.out.printf("Média:  %3.1f\n", aluno.getMedia());
            
        } else {
            System.out.println("O aluno não está cadastrado na turma.");

        }

    }

    private static void imprimirTurma() {

	    int contAlunos = 1;
	    for(String matricula: turmaAlunos.keySet()) {

            System.out.println("- Aluno " + contAlunos);
	        imprimirAluno(matricula);

	        contAlunos++;

            System.out.println();

        }

        if (contAlunos == 1) {

            System.out.println("Turma vazia.");

        }

    }
	
}
