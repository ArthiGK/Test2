package javaPrograms;

public class MethodOverloadingSub {

	String ename,mgr;
	int deptno,salary;
	
	void empldet()
	{
		System.out.println("Employee name " + ename);
		System.out.println("Employee department " + deptno);
		System.out.println("Employee salary " + salary);
	}
	void empldet(String ename)
	{
		mgr="Arthi";
		System.out.println("The employee name is " + ename);
		System.out.println("The manager is " + mgr);
		
	}
	
	void empldet(int deptno, String ename)
	{
      String deptname;
      String desig;
      deptname="IT";
      desig="Engineer";
      System.out.println();
      System.out.println();
      System.out.println("The department details of " + ename + " is:");
      System.out.println(ename + " " + deptno + " " + deptname + " " +  desig);
	}
	}


