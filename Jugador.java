public class Jugador {
    private String nombre;
    private int vida;

    public Jugador(String nombre, int vida){
        this.nombre=nombre;
        this.vida=vida;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }

    public void recibirDano(){
        this.vida-=10;
        if(this.vida<0){
            this.vida=0;
        }
    }

    public void mostrarDatos(){
        System.out.println("Jugador: "+this.nombre+" tiene: "+this.vida+" de vida.");
    }

}
