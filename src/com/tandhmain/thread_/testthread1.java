package com.tandhmain.thread_;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/23 12:01 GMT+0800
 */

/**
 * 创建多线程的4中方法：
 * 1、继承Thread类
 * 2、实现Runnable接口
 * 3、实现callable接口，配合Future接口
 * 4、使用线程池
 */

public class testthread1 {
    public static void main(String[] args) {
/**
 * ======================继承Thread类【此方法较少用，因java单继承，限制较多】=====================================
 */
//        //创建线程对象
//        MyThread myThread = new MyThread();
//        //调用start方法启动线程:
//        // 两个作用：1.启动线程 2.执行run方法
//        myThread.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("---主线程：" + i);
//        }

        //创建子线程1 Thread的匿名内部类并赋值
        Thread thread = new Thread("=我是子线程1===") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };
        thread.start();
        //主线程循环
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        //创建子线程2，同样使用匿名内部类，不赋值直接使用。
        new Thread("===子线程2=222222222") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);

                }
            }
        }.start();



        /**
         * ===================实现Runnable接口========================================
         */

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        //启动线程，线程进入就绪状态；一旦获取CPU的执行权，就会执行run方法
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程==" + i);
        }

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread2.start();


    }
}
