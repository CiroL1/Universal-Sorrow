package Objetos;
public class Bono {
    private String estadistica;
    private double multiplicador;
    private int tiempo;

    public Bono(String estadistica, double multiplicador, int tiempo) {
        this.estadistica = estadistica;
        this.multiplicador = multiplicador;
        this.tiempo = tiempo;
    }

    public String getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(String estadistica) {
        this.estadistica = estadistica;
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
