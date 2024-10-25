package Objetos;

import java.util.List;

public class Estudiante {
    private String nombre;
    private double cordura;
    private double plata;
    private int capacidadDeestudio; //aumento de la probabilidad de aprobar
    private String tipo; // "Jugador" o "NPC"
    private Carrera carrera;
    private List<Materia> materias;
    private double reputacion;

    public Estudiante(String nombre, double cordura, double plata, int capacidadDeestudio, double reputacion, String tipo, Carrera carrera, List<Materia> materias) {
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public double getReputacion() {return reputacion;}

    public void setReputacion(double reputacion) {
        this.reputacion = Math.max(0, Math.min(reputacion, 100));
    }

    //Metodos
    public void estudiar(Materia materia){
        double actual = materia.getProbabilidadDeAprobar();
        switch(materia.getDificultad()){
            case 1: materia.setProbabilidadDeAprobar(actual + (getCapacidadDeestudio() * (1.5 + carrera.aplicarBonos(1))));
                modificarCordura(5);
                break;
            case 2: materia.setProbabilidadDeAprobar(actual + (getCapacidadDeestudio() * (1.0 + carrera.aplicarBonos(1))));
                modificarCordura(10);
                break;
            case 3: materia.setProbabilidadDeAprobar(actual + (getCapacidadDeestudio() * (0.75 + carrera.aplicarBonos(1))));
                modificarCordura(15);
                break;
            case 4: materia.setProbabilidadDeAprobar(actual + (getCapacidadDeestudio() * (0.5 + carrera.aplicarBonos(1))));
                modificarCordura(20);
                break;
            default: materia.setProbabilidadDeAprobar(actual + (getCapacidadDeestudio() * (1.0 + carrera.aplicarBonos(1))));
                modificarCordura(5);
                break;
        }
    }

    public void trabajar(Trabajo trabajo) {
        double remuneracionConBono = trabajo.getRemuneracion() * carrera.aplicarBonos(2);
        double nuevaPlata = getPlata() + remuneracionConBono;
        setPlata(nuevaPlata);
        modificarCordura(10);
    }


    public void descansar(){
        if (cordura*1.2 > 100){
            setCordura(100);
        } else {
            setCordura(cordura*1.2);
        }
        setReputacion(reputacion*0.9);
    }

    public int modificarCordura(int base) {
        double corduraActual = getCordura();
        double corduraRestar = 0;

        if (corduraActual >= 75 && corduraActual <= 100) {
            corduraRestar = base;
            setReputacion(reputacion*0.9);
        } else if (corduraActual < 75 && corduraActual >= 50) {
            corduraRestar = base * 1.25;
            setReputacion(reputacion*0.8);
        } else if (corduraActual < 50 && corduraActual >= 25) {
            corduraRestar = base * 1.50;
            setReputacion(reputacion*0.7);
        } else if (corduraActual < 25 && corduraActual >= 0) {
            corduraRestar = base * 1.75;
            setReputacion(reputacion*0.6);
        }

        if ((corduraActual - corduraRestar) >= 0) {
            setCordura(corduraActual - corduraRestar);
            return 1;
        } else {
            return 0;
        }
    }

}