package test;

import java.util.Scanner;


public class jack {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int id=1000;
        int[][] bankData=new int[100][3];//准备了100个员工账户的空间

        boolean runState=true;
        while(runState){
            //欢迎页面
            System.out.println("================================");
            System.out.println("===");
            System.out.println("           员工管理系统v1.0");
            System.out.println("");
            System.out.println("================================");
            System.out.println("\t1.登录\t          \t2.添加员工");
            System.out.println("\t3.更新员工信息\t\t4.查看员工列表");
            System.out.println("\t4.删除员工信息\t\t5.发工资");
            System.out.println(" \t6.退出");
            System.out.print("请选择:");
            int selectNum=input.nextInt();//等待用户选择
            if(selectNum==2){//添加员工
                System.out.println("----添加员工----");
                System.out.println("账号："+id);
                System.out.print("密码：");
                int mima=input.nextInt();//等待用户输入密码

                for(int[] zhanghu:bankData){//循环查看哪个行没有赛数据
                    if(zhanghu[0]==0){//判断某行是否为零
                        zhanghu[0]=id++;//如果是零就把新账户开在这里
                        zhanghu[1]=mima;
                        break;
                    }
                }
                System.out.println("员工添加成功！");
                System.out.println("----------");
            }else if(selectNum==5){//发工资
                System.out.println("----输入员工姓名：----");
               // System.out.print("账户：");
                int zhanghu=input.nextInt();//输入账户
                System.out.print("金额：");
                int jine=input.nextInt();
                if(jine<0||jine>100000){
                    System.out.println("对不起不支持此功能！");
                }else{
                    boolean zhaodaolemei=false;
                    for(int[] zhanghu1:bankData){
                        if(zhanghu1[0]==zhanghu){
                            zhanghu1[2]+=jine;
                            zhaodaolemei=true;
                            break;
                        }
                    }
                    if(!zhaodaolemei){
                        System.out.println("没有此员工账号！");

                    }
                }
            }else if(selectNum==3){//取钱
                System.out.println("----取钱----");
                System.out.print("账户：");
                int zhanghu=input.nextInt();//让用户输入账户
                System.out.print("密码：");
                int mima=input.nextInt();
                System.out.print("金额：");
                int jine=input.nextInt();
                if(jine<0||jine>100000){
                    System.out.println("对不起不支持此功能！");
                }else{
                    boolean zhaodaolemei=false;
                    for(int[] zhanghu1:bankData){
                        if(zhanghu1[0]==zhanghu){
                            if(zhanghu1[1]==mima){
                                if(jine<=zhanghu1[2]){
                                    zhanghu1[2]-=jine;
                                    zhaodaolemei=true;
                                    break;
                                }else{
                                    System.out.println("余额不足！");
                                    break;
                                }


                            }else{
                                System.out.println("密码错误");
                                break;
                            }

                        }

                        if(!zhaodaolemei){
                            System.out.println("没有此账户！");
                            break;
                        }
                    }
                }
            }else if(selectNum==4){//查询
                System.out.println("----查询----");
                System.out.print("账户：");
                int zhanghu=input. nextInt();//让用户输入账户
                System.out.print("密码：");
                int mima=input.nextInt();
                boolean zhaodaolemei=false;
                for(int[] zhanghu1:bankData){
                    if(zhanghu1[0]==zhanghu){
                        if(zhanghu1[1]==mima){
                            System.out.println("金额："+zhanghu1[2]+"元");
                            break;
                        }else{
                            System.out.println("密码错误");
                            break;
                        }
                    }
                }
            }else if(selectNum==5){
                runState=false;
            }else{
                System.out.println("输入错误!");
            }
        }
    }

}
