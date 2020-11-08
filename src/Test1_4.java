/**
 * 两个线程打架的案例 造成死锁
 * jps -》jstack 数字
 * jdk自带死锁检测工具 cmd里的jconsole
 * */
public class Test1_4 {
    private static final Object USER_1 = new Object();
    private static final Object USER_2 = new Object();
    public static void main(String[] args) {

        new Thread(()->{
            synchronized (USER_1){
                try {
                    Thread.sleep(10l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (USER_2){
                    System.out.println("USER_1打死了USER_2");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (USER_2){
                synchronized (USER_1){
                    System.out.println("USER_2打死了USER_1");
                }
            }
        }).start();
    }
}
