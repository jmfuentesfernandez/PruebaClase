import java.util.Random;

public class Hilo extends Thread implements Runnable {
    private final String nombre;
    static Random r = new Random();

Hilo(String nombre) {this.nombre=nombre;}

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i+" "+this.nombre);
            try {
                //sleep(r.nextInt(100));
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin de la ejecución de "+this.nombre);
    }
}