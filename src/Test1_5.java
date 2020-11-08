import java.util.concurrent.CountDownLatch;

/***
 * 线程安全
 *
 *线程不安全操作实例
 *
 * */
public class Test1_5 {
    public  static  int  num = 0;

    //jdk自带工具 10个线程
    private static  CountDownLatch countDownLatch = new CountDownLatch(10);

    public static void inCreat(){
        num++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 100; j++) {
                    inCreat();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //每个线程执行完成之后，调用
                countDownLatch.countDown();
            }).start();
        }
        while (true){
            if (countDownLatch.getCount() == 0){
                System.out.println(num);
                break;
            }
        }

    }
}
