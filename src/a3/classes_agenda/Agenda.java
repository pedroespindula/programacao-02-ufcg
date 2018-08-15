package a3.classes_agenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Contato> contatos = new HashMap<>();

    public Agenda() {
    }

    public void cadastrarContato (Contato contato) {

        contatos.put(contato.getNome(), contato);

    }

    public void imprimirContatos () {

        int c = 1;
        for (String key: contatos.keySet()) {
            System.out.println(c + ". " + contatos.get(key));
            c++;
        }

    }

    public Contato procurarContato (String nomeContato) {
        System.out.println();
        System.out.println("O contato que você está procurando é:");
        return contatos.get(nomeContato);

    }

    public void apagarContato (String nomeContato) {

        if (contatos.containsKey(nomeContato)) {
            contatos.remove(nomeContato);
            System.out.println("Contato apagado.");
        } else {
            System.out.println("Contato inexistente!");
        }

    }

}
