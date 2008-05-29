package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Admin {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private String Admin_UserName,Admin_Password;

	public String getAdmin_UserName() {
		return Admin_UserName;
	}

	public void setAdmin_UserName(String admin_UserName) {
		Admin_UserName = admin_UserName;
	}

	public String getAdmin_Password() {
		return Admin_Password;
	}

	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}

	public void AdminLogin() throws IOException {
		Common.DrawLine();
		System.out.println("Enter Admin User Name :");
		setAdmin_UserName(br.readLine());
		
		System.out.println("Enter Admin Password :");
		setAdmin_Password(br.readLine());
	}
}
