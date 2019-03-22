package test;

import java.util.Scanner;

public class Emp {
	private String number;
	private String name;
	private float sal;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Emp() {

	}
	public Emp(String number,String name, float sal)
	{
		this.number=number;
		this.name=name;
		this.sal=sal;
	}
	public void output()
	{
		System.out.println(number+"\t"+name+"\t"+sal+"\t");
	}
	public void gbSal()
	{
		System.out.println("请输入新的工资：");
		Scanner sc=new Scanner(System.in);
		sal=sc.nextFloat();
	}


}

