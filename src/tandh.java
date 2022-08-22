import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周五, 2022/8/19 16:42 GMT+0800
 *
 * 使用swing进行桌面程序开发
 */

public class tandh {
    public static void main(String[] args) {
        //创建一个窗口
        JFrame frame = new JFrame("龟兔赛跑");
        //设置窗口大小
        frame.setSize(500, 400);

        //去掉默认窗口布局
        frame.setLayout(null);

        //创建乌龟图片
        JLabel tortoiseIcon = new JLabel(new ImageIcon("E:\\code\\Tortoise_and_the_Hare\\picsrc\\tortoise.jpg"));
        //设置乌龟图片坐标位置
        tortoiseIcon.setBounds(0, 100, 50, 50);
        //将乌龟图片添加到窗口中
        frame.add(tortoiseIcon);

        //创建兔子图片
        JLabel hareIcon = new JLabel(new ImageIcon("E:\\code\\Tortoise_and_the_Hare\\picsrc\\hare.jpg"));
        //设置兔子图片坐标位置
        hareIcon.setBounds(0, 200, 50, 50);
        //将兔子图片添加到窗口中
        frame.add(hareIcon);

        //添加按钮
        JButton startButton = new JButton("开始");
        startButton.setBounds(200, 0, 100, 50);
        frame.add(startButton);

        //给按钮绑定事件：动作监听器
        startButton.addActionListener(new ActionListener() {
            //此方法，是点击按钮后，swing进行回调
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //获取乌龟的横坐标，然后设置新坐标
                double x1 = tortoiseIcon.getBounds().getX();
                tortoiseIcon.setBounds((int)x1 + 10, 100, 50, 50);
                //获取兔子的横坐标，然后设置新坐标
                double x2 = hareIcon.getBounds().getX();
                hareIcon.setBounds((int)x2 + 10, 200, 50, 50);

            }
        });


//        Thread

        //退出和关闭，在最后
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口显示  visible
        frame.setVisible(true);


    }
}
