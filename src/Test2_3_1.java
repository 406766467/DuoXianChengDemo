/**
 *
 * 创建线程
 * */
public class Test2_3_1 extends Thread {
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"的run()方法被调用");
    }

    public static void main(String[] args) {
        Test2_3_1 test2_3_1 = new Test2_3_1();
        test2_3_1.setName("test2_3_1线程");
        test2_3_1.start();
    }
}
