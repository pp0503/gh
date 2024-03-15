package task2;

import java.util.Scanner;

public class test 

{
	public static void main(String[] args)
	{

	student s=new student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter roll no");
	s.setRollno(sc.nextInt());
	System.out.println("Enter name");
	s.setName(sc.next());

	System.out.println(s.getRollno());
	System.out.println(s.getName());
	}

}
