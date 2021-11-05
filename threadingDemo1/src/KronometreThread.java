public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName; //thread'leri birbirinden ayirabilmeliyiz.Java tarafindan Fark edilmesi icin

    //getter-setter veya bu sekilde constructor
    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }

    @Override
    public void run() {
        //Runnable Java Class
        //run icerisine yazdiklarimiz thread seklinde calisacak.
        System.out.println("Çalıştırılıyor: " + threadName);

            try {
                for (int i = 1; i < 10; i++) {
                    System.out.println(threadName + ":" + i);
                    Thread.sleep(1000);
                }
                    } catch (InterruptedException e) {
                    System.out.println("Kesildi: " + threadName);
                    }
            System.out.println("thread bitti " + threadName);

    }
    //bu kodlar standarttır.
    public void start() {
        System.out.println("thread nesnesi olusturuluyor");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }}

