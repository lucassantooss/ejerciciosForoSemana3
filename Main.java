public class Main {
    public static void main(String[] args) {
        //Resuelve ejercicio 1
        /*
        Alumno[] listaAlumnos = new Alumno[5];


        listaAlumnos[0] = new Alumno("Ana García", 8.5);
        listaAlumnos[1] = new Alumno("Luis Pérez", 4.75);
        listaAlumnos[2] = new Alumno("Marta Sanz", 9.0);
        listaAlumnos[3] = new Alumno("Juan López", 6.2);
        listaAlumnos[4] = new Alumno("Elena Rivas", 5.5);


        System.out.println("--- LISTADO DE CLASE ---");
        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i].mostrarDatos();
        }
        */

        //Resuelve ejrcicio 2
        /*

        Alumno[] listaAlumnos = new Alumno[5];

        listaAlumnos[0] = new Alumno("Ana García", 8.5);
        listaAlumnos[1] = new Alumno("Luis Pérez", 4.75); // Suspenso
        listaAlumnos[2] = new Alumno("Marta Sanz", 9.0);
        listaAlumnos[3] = new Alumno("Juan López", 3.2);  // Suspenso
        listaAlumnos[4] = new Alumno("Elena Rivas", 5.5);

        System.out.println("--- ALUMNOS APROBADOS ---");

        for (int i = 0; i < listaAlumnos.length; i++) {
            // Usamos el getter para obtener la nota y compararla
            if (listaAlumnos[i].getNota() >= 5.0) {
                listaAlumnos[i].mostrarDatos();
            }
        }
        */

        //Resuelve ejercicio 3
        /*
        Alumno[] listaAlumnos = new Alumno[5];
        listaAlumnos[0] = new Alumno("Ana García", 8.5);
        listaAlumnos[1] = new Alumno("Luis Pérez", 4.75);
        listaAlumnos[2] = new Alumno("Marta Sanz", 9.0);
        listaAlumnos[3] = new Alumno("Juan López", 3.2);
        listaAlumnos[4] = new Alumno("Elena Rivas", 5.5);

        double sumaNotas = 0.0;

        // Recorremos para acumular las notas
        for (int i = 0; i < listaAlumnos.length; i++) {
            sumaNotas += listaAlumnos[i].getNota();
        }

        double media = sumaNotas / listaAlumnos.length;

        System.out.println("La nota media de la clase es: " + media);
        */

        //Resuelve ejercicio 4

    }
}