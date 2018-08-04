package a2.sintaxejava.notas;

public class Aluno {

    private String matricula;
    private String nome;

    private double[] notas;


    public Aluno(String matricula, String nome, int quantidadeNotas) {
        setMatricula(matricula);
        setNome(nome);
        setNotas(new double[quantidadeNotas]);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNota(int idNota, double valorNota) {

        double[] notas = this.getNotas();

        notas[idNota - 1] = valorNota;

        this.setNotas(notas);

    }

    public double getMedia() {

        double soma = 0;
        for (double nota: this.notas) {
            soma += nota;
        }

        if (notas.length > 0){
            return soma / notas.length;
        } else {
            return -1;
        }
    }
}
