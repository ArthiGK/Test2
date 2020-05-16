package javaPrograms;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingSub emp = new MethodOverloadingSub();
		emp.ename="Sanjay";
		emp.deptno=10;
		emp.salary=10000;
		emp.empldet();
		
		emp.empldet("Sanjay");
		emp.empldet(10,"Sanjay");
		

	}

}
