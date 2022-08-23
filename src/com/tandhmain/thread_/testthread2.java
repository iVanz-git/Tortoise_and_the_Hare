package com.tandhmain.thread_;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/23 21:21 GMT+0800
 */

    //三、实现callable接口，配合Future接口的方式实现
public class testthread2 {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();

        //创建FuterTask对象
        FutureTask<Integer> f1 = new FutureTask<>(myCallable);
        FutureTask<Integer> f2 = new FutureTask<>(myCallable);

        Thread thread1 = new Thread(f1);
        Thread thread2 = new Thread(f2);

        thread1.start();
        thread2.start();

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
