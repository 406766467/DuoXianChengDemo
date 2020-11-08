public class Test2_4_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+Thread.currentThread().getName()+"的run()方法被调用");
            }
        });

        thread.setName("Test2_4_1线程");
        thread.start();
    }
}
