package a3.classes_pessoa;

public class Endereco {

    private String endereco;
    private int numeroCasa;
    private String cidade;
    private String estado;
    private String pais;

    Endereco() {};

    public Endereco(String endereco, int numeroCasa, String cidade, String estado, String pais) {
        this.endereco = endereco;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setRua(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.endereco + " - " + this.numeroCasa + ". " + this.cidade + ", " + this.estado + ", " + this.pais;
    }
    
}
