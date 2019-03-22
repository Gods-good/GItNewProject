package test;

import java.util.ArrayList;

public class Boss {

	public int account = 666;
	public int pwd = 888;
	private ArrayList a1=null;
	public Boss()
	{
		a1=new ArrayList();
	}
	public void saveMoney(int mon){//存钱
		int money = 0;
		money = money + mon;
		System.out.println(money);
	}

	public void all()//查看员工列表
	{
		System.out.println("工号\t姓名\t薪水\t");
		for(int i=0; i<a1.size(); i++)
		{
			Emp emp=(Emp)a1.get(i);
			emp.output();
		}
	}
	public void count() {//查看员工个数
		System.out.println(a1.size());
	}


}
