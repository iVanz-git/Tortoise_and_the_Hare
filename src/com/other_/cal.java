package com.other_;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周六, 2022/8/20 14:58 GMT+0800
 */
public class cal {
    public static void main(String[] args) {

        int divisor = 9;
        int endNum = 30;
        for (int i = 1; i <= endNum; i++) {
            System.out.print(i + "%" + divisor +"的余数为" + (i % divisor) +" \t");
            if (i % 5 == 0){
                System.out.println();
            }
        }

        String s1 = "asdasd dsad ddsa wet 12 fds";
        String s2 = cal.f1(s1);
        System.out.println(s2);



    }
    public static String f1(String str){
        StringBuilder sBuilder = new StringBuilder();
//        //普通for
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' '){
//                sBuilder.append("%20");
//            }
//            else {
//                sBuilder.append(str.charAt(i));
//            }
//        }
        //增强for
        for (char c: str.toCharArray()) {
            if (c == ' '){
                sBuilder.append("%20");
            }
            else {
                sBuilder.append(c);
            }
        }

        return sBuilder.toString();
    }
}
