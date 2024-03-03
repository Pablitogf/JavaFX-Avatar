package co.edu.uniquindio.avatarfx.avatarapp.model;

public class Avatar {

    private String nombre;
    private String apellido;
    private int edad;
    private String fechaNacimiento;
    private String estatus;
    private  String celular;

    public Avatar() {
    }

    public Avatar(String nombre, String apellido, int edad, String fechaNacimiento, String estatus, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estatus = estatus;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Avatar: " +
                "nombre= " + nombre + '\'' +
                ", apellido= " + apellido + '\'' +
                ", edad= " + edad +
                ", fechaNacimiento= " + fechaNacimiento + '\'' +
                ", estatus= " + estatus + '\'' +
                ", celular= " + celular + '\'';
    }
}
