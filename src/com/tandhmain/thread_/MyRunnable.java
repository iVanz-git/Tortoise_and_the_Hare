package com.tandhmain.thread_;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/23 12:32 GMT+0800
 */

//自定义类实现Runnable接口
public class MyRunnable implements Runnable{
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程===" + i);
        }
    }
}
