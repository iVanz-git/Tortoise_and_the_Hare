package com.tandhmain.thread_;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/23 11:41 GMT+0800
 */

/**
 * 创建多线程的4中方法：
 * 1、继承Thread类
 * 2、实现Runnable接口
 * 3、实现callable接口，配合Future接口
 * 4、使用线程池
 *
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程---:" + i);
        }
    }
}
