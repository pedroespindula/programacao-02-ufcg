package a3.classes_pessoa;

public class Funcao {

    private int complemento;
    private String funcao;

    public Funcao(String funcao) {

        this.funcao = funcao;

    }

    public int getBonus () {

        if (this.funcao.equals("Abacateiro")) {
            return 20 + this.complemento;
        }
        return 10 + (this.complemento / 2);

    }

    public void adicionaComplemento(int complemento) {

        this.complemento += complemento;

    }

}
