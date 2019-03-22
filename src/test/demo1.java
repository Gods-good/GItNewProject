package test;

import java.util.Arrays;
import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] name = new int[0];
        int[] mima = new int[0];
        while(true) {

            System.out.println("欢迎来到学生登录系统!");
            System.out.println("请选择功能：1注册；2登录");
            int choose1 = sc.nextInt();
            switch(choose1){
                case 1:
                    System.out.println("请输入你的用户名：");
                    int name1 = sc.nextInt();
                    int mima1 = sc.nextInt();
                    name = Arrays.copyOf(name, name.length+1);
                    mima = Arrays.copyOf(mima, mima.length+1);
                    name[name.length-1] = name1;
                    mima[mima.length-1] = mima1;
                    System.out.println("注册成功！"+Arrays.toString(name)+Arrays.toString(mima));
                    break;
                case 2:
                    System.out.println("请输入你的姓名和密码：");
                    int name2 = sc.nextInt();
                    int mima2 = sc.nextInt();
                    for (int i = 0;i < 10;i++) {
                        if(name2==name[i] && mima2==mima[i]) {
                            System.out.println("登录成功");
                            break;
                        }else {
                            System.out.println("账号或密码错误");
                            break;
                        }
                    }
                    break;
                default:
            }
        }
    }
}