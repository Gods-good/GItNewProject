package test;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpManage em=new EmpManage();
		Boss em1=new Boss();
		System.out.println("请登录");
		int account = sc.nextInt();
		int pwd = sc.nextInt();
		if(account == 123 && pwd == 111) {
			int i;
			do
			{

				System.out.println("请选择你要进行的操作：");
				System.out.println("1表示添加一个雇员");
				System.out.println("2表示修改雇员工资");
				System.out.println("3表示删除一个雇员");
				System.out.println("4表示显示所有员工的信息");
				System.out.println("0表示退出程序");
				i=sc.nextInt();
				switch(i)
				{
					case 1: System.out.println("请输入你所要输入的工号");
						String a=sc.next();
						System.out.println("请输入"+a+"的姓名");
						String b=sc.next();
						System.out.println("请输入"+a+"的工资");
						float c=sc.nextFloat();
						Emp emp=new Emp(a,b,c);
						em.addEmp(emp);
						break;
					case 2:
						System.out.println("请输入你所要修改该员工的工号");
						String emno=sc.next();
						em.xgSal(emno);
						break;
					case 3:System.out.println("请输入你所要删除员工");
						String e=sc.next();
						em.delEmp(e);
						break;
					case 4:em.all();
						break;
					default:
				}
			}while(i!=0);
		}
		if(account == 666 && pwd == 888) {
			int i;
			do
			{
				System.out.println("请选择你要进行的操作：");
				System.out.println("1表示给公司存钱");
				System.out.println("2表示查看员工个数");
				System.out.println("3表示查看员工列表");
				System.out.println("0表示退出程序");
				i=sc.nextInt();
				switch(i)
				{
					case 1:
						System.out.println("请输入您要存的金额");
						int mon = sc.nextInt();
						em1.saveMoney(mon);
						break;
					case 2:
						em1.count();
						break;
					case 3:em1.all();
						break;
					default:
				}
			}while(i!=0);
		}



	}

}

