public class MyThread extends Thread {
    public void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println("Thread1 "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
