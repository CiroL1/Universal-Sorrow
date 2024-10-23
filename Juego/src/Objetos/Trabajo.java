package Objetos;

public class Trabajo {
    public String nombre;
    public int tiempo;
    public double remuneracion;

    public Trabajo(String nombre, int tiempo, double remuneracion) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.remuneracion = remuneracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }
}
