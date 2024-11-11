package Objetos;

import java.util.HashMap;
import java.util.List;

public class Estudiante {
    protected String nombre;
    protected double cordura;
    protected double plata;
    protected int capacidadDeestudio; //aumento de la probabilidad de aprobar
    protected String tipo; // "Jugador" o "NPC"
    protected Carrera carrera;
    protected HashMap<Integer, Materia> materias;
    protected double reputacion;

    public Estudiante(String nombre, double cordura, double plata, int capacidadDeestudio, double reputacion, String tipo, Carrera carrera, HashMap<Integer, Materia> materias) {
        this.nombre = nombre;
        this.cordura = cordura;
        this.plata = plata;
        this.capacidadDeestudio = capacidadDeestudio;
        this.reputacion = reputacion;
        this.tipo = tipo;
        this.carrera = carrera;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCordura() {
        return cordura;
    }

    public void setCordura(double cordura) {
        this.cordura = cordura;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getCapacidadDeestudio() {
        return capacidadDeestudio;
    }

    public void setCapacidadDeestudio(int capacidadDeestudio) {
        this.capacidadDeestudio = capacidadDeestudio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public HashMap<Integer, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<Integer, Materia> materias) {
        this.materias = materias;
    }

    public double getReputacion() {return reputacion;}

    public void setReputacion(double reputacion) {
        this.reputacion = Math.max(0, Math.min(reputacion, 100));
    }



}