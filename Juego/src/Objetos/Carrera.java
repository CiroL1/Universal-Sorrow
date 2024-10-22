package Objetos;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Materia> materias;
    private ArrayList<Bono> bonos;

    public Carrera(String nombre, ArrayList<Materia> materias, ArrayList<Bono> bonos) {
        this.nombre = nombre;
        this.materias = materias;
        this.bonos = bonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(ArrayList<Bono> bonos) {
        this.bonos = bonos;
    }
}
