package a3.classes_navio;

public class Navio {

    private int vida;
    private int poderFogo;
    private boolean vivo = true;

    Navio(int vida) {

        this.vida = vida;
        this.poderFogo = 10;

    }

    Navio(int vida, int poderFogo) {
        this.vida = vida;
        this.poderFogo = poderFogo;
    }

    public boolean estaVivo() {
        return vivo;
    }

    public void baleado(int danoSofrido) {
        this.vida -= danoSofrido;
    }

    public void baleado(Navio navioAtacante) {
        this.vida -= navioAtacante.getPoderFogo();
        if (this.vida <= 0) {
            this.vivo = false;
        }
    }

    public int getVida() {
        return vida;
    }

    public int getPoderFogo() {
        return poderFogo;
    }

    public String toString() {
        return this.getVida() + " " + this.getPoderFogo();
    }

}
