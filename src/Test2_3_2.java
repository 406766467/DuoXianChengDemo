public class Test2_3_2 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"的run()方法被调用");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test2_3_2());
        thread.setName("Test2_3_2线程");
        thread.start();
    }
}
