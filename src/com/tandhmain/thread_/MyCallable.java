package com.tandhmain.thread_;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/23 21:17 GMT+0800
 */

//1.自定义一个类，实现callable接口
public class MyCallable implements Callable<Integer> {
    //2.重写call方法
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int i = random.nextInt(11);

        return i;
    }
}
