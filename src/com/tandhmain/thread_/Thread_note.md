# <center>创建多线程的4种方法

---
## 一、继承Thread类【一般不使用该方式，因为java单继承，限制较多】
### 1. 常用构造器
- 1.Thread()
- 2.Thread(Runnable)

### 2.步骤：
- 1.自定义一个类继承Thread类
- 2.重写run方法
- 3.调用start方法启动线程(启动线程后，线程进入就绪状态；一旦获取到CPU执行权，就会执行run方法)
---

## 二、实现Runnable接口
- 1.自定义给类，实现Runnable接口
- 2.重写run方法
- 3.创建Thread类，启动线程

---

## 三、实现callable接口，配合Future接口的方式实现
- 1.自定义一个类，实现callable接口
- 2.重写call方法
- 3.创建Thread对象调用start方法启动线程，而且可以得到线程执行完毕后的返回值

---

## 四、使用线程池
