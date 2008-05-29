package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Seller {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static int Seller_Id;
	private static String Seller_FirstName,Seller_LastName,Seller_Email,Seller_Address,Seller_UserName,Seller_Password;
	
	public String getSeller_UserName() {
		return Seller_UserName;
	}
	public void setSeller_UserName(String seller_UserName) {
		Seller_UserName = seller_UserName;
	}
	public String getSeller_Password() {
		return Seller_Password;
	}
	public void setSeller_Password(String seller_Password) {
		Seller_Password = seller_Password;
	}
	public int getSeller_Id() {
		return Seller_Id;
	}
	public void setSeller_Id(int seller_Id) {
		Seller_Id = seller_Id;
	}
	public String getSeller_FirstName() {
		return Seller_FirstName;
	}
	public void setSeller_FirstName(String seller_FirstName) {
		Seller_FirstName = seller_FirstName;
	}
	public String getSeller_LastName() {
		return Seller_LastName;
	}
	public void setSeller_LastName(String seller_LastName) {
		Seller_LastName = seller_LastName;
	}
	public String getSeller_Email() {
		return Seller_Email;
	}
	public void setSeller_Email(String seller_Email) {
		Seller_Email = seller_Email;
	}
	public String getSeller_Address() {
		return Seller_Address;
	}
	public void setSeller_Address(String seller_Address) {
		Seller_Address = seller_Address;
	}
	
	
	public void SellerRegistration() throws NumberFormatException, IOException {
		Common.DrawLine();
		System.out.println("-------Seller Registration-------");
		Common.DrawLine();
		System.out.print("Enter Seller Id:");
		setSeller_Id(Integer.parseInt(br.readLine()));
		
		System.out.print("Enter Seller First Name:");
		setSeller_FirstName(br.readLine());
		
		System.out.print("Enter Seller Last Name:");
		setSeller_LastName(br.readLine());
		
		System.out.print("Enter Seller Email:");
		setSeller_Email(br.readLine());
		
		System.out.print("Enter Seller Address:");
		setSeller_Address(br.readLine());
		
		System.out.print("Enter Seller User Name:");
		setSeller_UserName(br.readLine());
		
		System.out.print("Enter Seller Password:");
		setSeller_Password(br.readLine());
	}
	
	public void SellerLogin() throws IOException{
		
		Common.DrawLine();
		System.out.println("-------Seller Login-------");
		
		Common.DrawLine();
		
		System.out.println("Enter Seller User Name :");
		setSeller_UserName(br.readLine());
		
		System.out.println("Enter Seller Password :");
		setSeller_Password(br.readLine());
	}
}
