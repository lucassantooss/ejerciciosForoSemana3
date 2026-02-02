import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Resuelve ejercicio 1
        /*
        Alumno[] listaAlumnos = new Alumno[5];


        listaAlumnos[0] = new Alumno("Ana", 8.5);
        listaAlumnos[1] = new Alumno("Luis", 4.75);
        listaAlumnos[2] = new Alumno("Marta", 9.0);
        listaAlumnos[3] = new Alumno("Juan", 6.2);
        listaAlumnos[4] = new Alumno("Elena", 5.5);


        System.out.println("--- LISTADO DE CLASE ---");
        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i].mostrarDatos();
        }
        */

        //Resuelve ejrcicio 2
        /*

        Alumno[] listaAlumnos = new Alumno[5];

        listaAlumnos[0] = new Alumno("Ana", 8.5);
        listaAlumnos[1] = new Alumno("Luis", 4.75); // Suspenso
        listaAlumnos[2] = new Alumno("Marta", 9.0);
        listaAlumnos[3] = new Alumno("Juan", 3.2);  // Suspenso
        listaAlumnos[4] = new Alumno("Elena", 5.5);

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
        listaAlumnos[0] = new Alumno("Ana", 8.5);
        listaAlumnos[1] = new Alumno("Luis", 4.75);
        listaAlumnos[2] = new Alumno("Marta", 9.0);
        listaAlumnos[3] = new Alumno("Juan", 3.2);
        listaAlumnos[4] = new Alumno("Elena", 5.5);

        double sumaNotas = 0.0;

        // Recorremos para acumular las notas
        for (int i = 0; i < listaAlumnos.length; i++) {
            sumaNotas += listaAlumnos[i].getNota();
        }

        double media = sumaNotas / listaAlumnos.length;

        System.out.println("La nota media de la clase es: " + media);
        */

        //Resuelve ejercicio 5
        /*
        Alumno[] listaAlumnos = new Alumno[5];

        listaAlumnos[0] = new Alumno("Ana", 8.5);
        listaAlumnos[1] = new Alumno("Luis", 4.75);
        listaAlumnos[2] = new Alumno("Marta", 9.0);
        listaAlumnos[3] = new Alumno("Juan", 6.2);
        listaAlumnos[4] = new Alumno("Elena", 5.5);

        Scanner sc=new Scanner(System.in);

        System.out.println("¿Que nombre quieres buscar?");
        String nombre=sc.nextLine();

        Alumno encontrado=null;
        for(int i=0;i< listaAlumnos.length;i++){
            if(listaAlumnos[i].getNombre().equals(nombre)){
                encontrado=listaAlumnos[i];
                break;
            }
        }
        if(encontrado==null){
            System.out.println("No encontrado");
        }else{
            System.out.println("Encontrado. Su nota es: "+encontrado.getNota());
        }
        */



    }
}