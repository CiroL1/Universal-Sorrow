package Objetos;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrera {
    private String nombre;
    private HashMap<Integer, Materia> materias;
    private ArrayList<Bono> bonos;

    public Carrera(String nombre, HashMap<Integer, Materia> materias, ArrayList<Bono> bonos) {
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

    public HashMap<Integer, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<Integer, Materia> materias) {
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
