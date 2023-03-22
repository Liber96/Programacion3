package Proyecto1;

public class Empleado {

    private String nombre;
    private int ID;
    private float Salario;

    public Empleado(String nombre, int ID, float Salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.Salario = Salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.ID;
    }

    public float getSalarioMensual() {
        return this.Salario;
    }

}
