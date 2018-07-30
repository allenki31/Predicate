package com.vinay;
import java.util.Scanner;
import java.util.function.Predicate;

import com.app.UserAuthentication;

public class Test {
	public static void main(String[] args) {
		Predicate <UserAuthentication> p = u->u.username.equals("vinay")&&u.pwd.equals("java");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String username =s.next();
		System.out.println("Enter pwd: ");
		String pwd = s.next();
		UserAuthentication user =new UserAuthentication(username ,pwd);
		if (p.test(user)) {
			System.out.println("valid user login successful");
}
			 else {
				System.out.println("invalid user plz login again");
			}

		}

	
}


