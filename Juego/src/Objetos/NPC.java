package Objetos;

import java.util.List;

public class NPC extends Estudiante {
    private String role;
    private String dialogo;

    // Constructor
    public NPC(String nombre, double cordura, double plata, int capacidadDeestudio, double reputacion, String tipo, Carrera carrera, List<Materia> materias, String role, String dialogo) {
        super(nombre, cordura, plata, capacidadDeestudio, reputacion, tipo, carrera, materias);
        this.role = role;
        this.dialogo = dialogo;
    }

    // Getter and setter methods for NPC-specific attributes
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDialogo() {
        return dialogo;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }

    // Example NPC-specific method
    public void hablar() {
        System.out.println(dialogo);
    }
}


