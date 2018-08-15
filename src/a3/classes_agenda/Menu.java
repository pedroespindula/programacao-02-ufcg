package a3.classes_agenda;

import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private String textoPrincipal;

    public Menu(String textoPrincipal) {
        this.textoPrincipal = textoPrincipal;
    }

    public String getTextoPrincipal () {

        return this.textoPrincipal;

    }

    public int escolhaOpcao () {

        System.out.println();
        System.out.println("=============================");
        System.out.println(this.textoPrincipal);
        int opcao = Integer.parseInt(this.recolheEntrada("a opção desejada"));
        System.out.println("=============================");
        System.out.println();

        return opcao;

    }

    public String recolheEntrada (String texto) {

        System.out.print("Digite " + texto +": ");
        return input.nextLine();


    }

}
