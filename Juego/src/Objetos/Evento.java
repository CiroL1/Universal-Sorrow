package Objetos;

import java.util.ArrayList;

public class Evento {
    public int tipo; //1. Clase, 2. Trabajo, 3. Relacion
    public String descripcion;
    public ArrayList<Integer> opciones;
    public Bono outcome;

    public Evento(int tipo, String descripcion, ArrayList<Integer> opciones, Bono outcome) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.opciones = opciones;
        this.outcome = outcome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Integer> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Integer> opciones) {
        this.opciones = opciones;
    }

    public Bono getOutcome() {
        return outcome;
    }

    public void setOutcome(Bono outcome) {
        this.outcome = outcome;
    }
}
