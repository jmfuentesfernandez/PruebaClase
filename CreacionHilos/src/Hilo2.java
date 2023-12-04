public class Hilo2 implements Runnable{
    private Thread miHilo;

    public Hilo2(String nombre){
        miHilo = new Thread(this,nombre);
        miHilo.start();
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i+" "+miHilo.getName());
            try {
                Thread.sleep(Hilo.r.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("FIN hilo "+miHilo.getName());
        /*EDITADO POR MANUELALEJANDROMARQUEZ*/
    }
}
