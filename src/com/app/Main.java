package com.app;
import com.app.EmployeeManagementApplicattion.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
	
		public static void main(String[] args) {
			ArrayList <EmployeeManagementApplicattion> list =new ArrayList <EmployeeManagementApplicattion>();
			populate(list);
			Predicate <EmployeeManagementApplicattion> p1 =emp -> emp.designation.equals("teamlead");
			System.out.println("employee information");
			display(p1,list);
		}
		public static void populate(ArrayList<EmployeeManagementApplicattion> list) {
			list.add( new EmployeeManagementApplicattion ("vijay","Employee",15000,"bangalore"));
			 list.add( new EmployeeManagementApplicattion ("vinay","Employee",15000,"hyderabad"));
			 list.add( new EmployeeManagementApplicattion ("akhil","teamlead",30000,"bangalore"));
			 list.add( new EmployeeManagementApplicattion ("sai","manager",50000,"hyderabad"));
			 list.add( new EmployeeManagementApplicattion ("raj","manager",30000,"bangalore"));
			 list.add( new EmployeeManagementApplicattion ("shiva","teamlead",56000,"hyderabad"));
		
		
	}


public static void display(Predicate <EmployeeManagementApplicattion> p1 , ArrayList<EmployeeManagementApplicattion> list)
{
for(EmployeeManagementApplicattion e :list) {
	if(p1.test(e)) {
		System.out.println(e);
	}
}

}

}



