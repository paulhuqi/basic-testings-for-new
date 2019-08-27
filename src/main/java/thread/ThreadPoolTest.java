package thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    public static void main(String[] args) {
        int poolSize = 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                poolSize, poolSize, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>());
        System.out.println("pool start");
        for(int i=0; i<poolSize+2; i++) {
        System.out.println("###thread start");
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("running... ");
                    try {
                        Thread.sleep(1000*20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        System.out.println("###thread end");
        }
        System.out.println("pool end");
    }
}
