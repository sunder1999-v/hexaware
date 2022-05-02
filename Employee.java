import java.util.*;

class Test
{

 int empid;
 String ename;
 double salary;
 int deptno;

  if(deptno=10){
  salary=sal*10/100+sal
  System.out.println(salary);
  }
  elseif(deptno=20){
  salary=sal*15/100+sal
  System.out.println(salary);
  }
   elseif(deptno=30){
   salary=sal*20/100+sal
   System.out.println(salary);
   }
  else{
   System.out.println("invalid Deptno");
  }


}




class Employee
{
 public static void main(String[] args)
 {
  
  Test a1=new Test();
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter employee id:");
  a1.empid=scanner.nextInt();
  System.out.println("enter employee name:");
  a1.ename=scanner.nextInt();
  System.out.println("enter employee salary:");
  a1.salary=scanner.nextInt();
  System.out.println("enter dept no:");
  a1.deptno=scanner.nextInt();


  System.out.println("hike increment is:" +a1.salary);

}

 