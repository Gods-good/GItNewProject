package test;

import java.util.ArrayList;

public class EmpManage {
	public int account = 123;
	public int pwd = 111;
	private ArrayList a1=null;
	public EmpManage()
	{
		a1=new ArrayList();
	}

	public void addEmp(Emp emp) //加入员工
	{
		a1.add(emp);
	}


	public void delEmp(String empno)//删除员工
	{
		for(int i=0; i<a1.size(); i++)
		{
			Emp emp=(Emp)a1.get(i);
			if(emp.getNumber().equals(empno))
			{
				a1.remove(i);
			}
		}
	}
	public void xgSal(String empno)//修改工资
	{

		for(int i=0; i<a1.size(); i++)
		{
			Emp emp=(Emp)a1.get(i);
			if(emp.getNumber().equals(empno))
			{
				emp.gbSal();
			}
		}
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


}

