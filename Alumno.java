public class Alumno {
    private String nombre;
    private double nota;


    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + this.nombre + " | Nota: " + this.nota);
    }

    public double getNota() {
        return this.nota;
    }

    public String getNombre(){
        return this.nombre;
    }
}
