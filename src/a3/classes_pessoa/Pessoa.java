package a3.classes_pessoa;

public class Pessoa {

    String nome;
    int anoNascimento;
    Endereco endereco;
    Funcao funcao;

    public Pessoa(String nome, int anoNascimento, Endereco endereco, String funcao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
        this.funcao = new Funcao(funcao);
    }


    public void adicionaComplemento(int complemento) {

        this.funcao.adicionaComplemento(complemento);

    }

    public int getBonus() {

        return this.funcao.getBonus();

    }

    @Override
    public String toString() {
        return this.nome + " - " + this.anoNascimento + " / " + this.endereco + " / " + this.getBonus();
    }
}
