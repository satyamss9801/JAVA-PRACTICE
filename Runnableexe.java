public class Runnableexe {
    public static void main(String[] args) {
        Runnable run = new Runnable(){
        public void run(){
            System.out.println("Anonimous Class ");
        }
        };

      new Thread(run).start(); 

    }
    
}
