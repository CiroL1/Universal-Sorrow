package Objetos;
public class Materia {
    private String nombre;
    private int dificultad; // 1. Facil, 2. Normal, 3. Dificil, 4. Muy dificil
    private double probabilidadDeAprobar;

    public Materia(String nombre, int dificultad, double probabilidadDeAprobar) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.probabilidadDeAprobar = probabilidadDeAprobar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public double getProbabilidadDeAprobar() {
        return probabilidadDeAprobar;
    }

    public void setProbabilidadDeAprobar(double probabilidadDeAprobar) {
        if (this.probabilidadDeAprobar <= 99){
            this.probabilidadDeAprobar = probabilidadDeAprobar;
        } else {
            this.probabilidadDeAprobar = 100;
        }
    }
}
