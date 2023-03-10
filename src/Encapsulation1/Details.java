package Encapsulation1;

public class Details 
{
 private String name;
 private int age;
 public void setName(String s)
 {
	 name=s;
 }
 public void setage(int a)
 {
	 age=a;
 }
 
 public void getName()
 {
	 System.out.println("My name : " +name);
 }
 public void getAge()
 {
	 System.out.println("My age is: " +age);
 }
}
