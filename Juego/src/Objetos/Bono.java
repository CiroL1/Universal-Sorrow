package Objetos;
public class Bono {
    public int tipo; //1. Estudio 2. Trabajo 3. Relaciones
    public double multiplicador;
    public int tiempo;

    public Bono(int tipo, double multiplicador, int tiempo) {
        this.tipo = tipo;
        this.multiplicador = multiplicador;
        this.tiempo = tiempo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}