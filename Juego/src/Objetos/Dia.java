package Objetos;

public class Dia {
    private String dia;
    private int tiempo;
    Evento evento;

    public Dia(String dia, int tiempo, Evento evento) {
        this.dia = dia;
        this.tiempo = tiempo;
        this.evento = evento;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
