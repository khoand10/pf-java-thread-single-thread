public class app {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) { System.out.println("thread 2:" + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        MyThread thread1 = new MyThread();
        thread1.setPriority(5);
        thread2.setPriority(1);
        thread1.start();
        thread2.start();
    }
}
