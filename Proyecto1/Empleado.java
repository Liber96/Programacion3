package Proyecto1;

public class Empleado {

    private String nombre;
    private int ID;
    private float Salario;

    public Empleado(String nombr, int ID, float Salario) {
        this.nombre = nombr;
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
