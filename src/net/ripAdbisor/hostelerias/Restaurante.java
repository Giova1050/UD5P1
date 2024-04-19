package net.ripAdbisor.hostelerias;

public class Restaurante {
    private String nombre;
    private String direccion;
    private int horario;
    private float puntuacion;

    public Restaurante(String nombre, String direccion, int horario, float puntiacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        this.puntuacion = puntiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
