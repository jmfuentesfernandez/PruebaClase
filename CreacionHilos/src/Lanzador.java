public class Lanzador {
    public static void main(String[] args) {
        //Thread h1 = new Thread(new Hilo("1"));
        Hilo2 h2 = new Hilo2("X");
        Hilo2 h3 = new Hilo2("O");
        //h1.start();
        h2.run();
        h3.run();

        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("Hilo principal terminado");
    }
    //Acabo de comentar en lanzador
}