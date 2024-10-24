package Objetos;

import java.util.ArrayList;

public class Carrera {
    public String nombre;
    public ArrayList<Materia> materias;
    public ArrayList<Bono> bonos;

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

    public double aplicarBonos(int tipo){
        for(Bono bono : bonos){
            if(tipo == bono.getTipo()){
                return bono.getMultiplicador();
            }
        }
        return 0;
    }
}
