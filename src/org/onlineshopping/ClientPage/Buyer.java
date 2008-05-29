package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.onlineshopping.strategy.*;


public class Buyer {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public static HashMap<String, String> userdetils=new HashMap<String, String>();
	
	private static int Buyer_Id;
	private static String Buyer_FirstName,Buyer_LastName,Buyer_Email,Buyer_Address,Buyer_UserName,Buyer_Password;
	
	
	public String getBuyer_UserName() {
		return Buyer_UserName;
	}
	public void setBuyer_UserName(String buyer_UserName) {
		Buyer_UserName = buyer_UserName;
	}
	public String getBuyer_Password() {
		return Buyer_Password;
	}
	public void setBuyer_Password(String buyer_Password) {
		Buyer_Password = buyer_Password;
	}
	public int getBuyer_Id() {
		return Buyer_Id;
	}
	public void setBuyer_Id(int buyer_Id) {
		Buyer_Id = buyer_Id;
	}
	public String getBuyer_FirstName() {
		return Buyer_FirstName;
	}
	public void setBuyer_FirstName(String buyer_FirstName) {
		Buyer_FirstName = buyer_FirstName;
	}
	public String getBuyer_LastName() {
		return Buyer_LastName;
	}
	public void setBuyer_LastName(String buyer_LastName) {
		Buyer_LastName = buyer_LastName;
	}
	public String getBuyer_Email() {
		return Buyer_Email;
	}
	public void setBuyer_Email(String buyer_Email) {
		Buyer_Email = buyer_Email;
	}
	public String getBuyer_Address() {
		return Buyer_Address;
	}
	public void setBuyer_Address(String buyer_Address) {
		Buyer_Address = buyer_Address;
	}
	
	public void BuyerRegistration() throws NumberFormatException, IOException {
		Common.DrawLine();
		System.out.println("-------Buyer Registration-------");
		Common.DrawLine();
		System.out.print("Enter Buyer Id:");
		setBuyer_Id(Integer.parseInt(br.readLine()));
		
		System.out.print("Enter Buyer First Name:");
		setBuyer_FirstName(br.readLine());
		
		System.out.print("Enter Buyer Last Name:");
		setBuyer_LastName(br.readLine());
		
		System.out.print("Enter Buyer Email:");
		setBuyer_Email(br.readLine());
		
		System.out.print("Enter Buyer Address:");
		setBuyer_Address(br.readLine());
		
		System.out.print("Enter Buyer User Name:");
		setBuyer_UserName(br.readLine());
		
		System.out.print("Enter Buyer Password:");
		setBuyer_Password(br.readLine());
		
		userdetils.put(getBuyer_Email(), getBuyer_Address());
	}
	
	public String getAddressByBuyerEmail(String Email){
		String Address =userdetils.get(Email);
		return Email+" Address Is "+Address;
	}
	
	public void UpdateBuyerDetails() throws NumberFormatException, IOException {
		Common.DrawLine();
		System.out.println("-------Update Profile-------");
		Common.DrawLine();
		System.out.print("Enter Buyer Id:");
		setBuyer_Id(Integer.parseInt(br.readLine()));
		
		System.out.print("Enter Buyer First Name:");
		setBuyer_FirstName(br.readLine());
		
		System.out.print("Enter Buyer Last Name:");
		setBuyer_LastName(br.readLine());
		
		System.out.print("Enter Buyer Email:");
		setBuyer_Email(br.readLine());
		
		System.out.print("Enter Buyer Address:");
		setBuyer_Address(br.readLine());
		
		System.out.print("Enter Buyer User Name:");
		setBuyer_UserName(br.readLine());
		
		System.out.print("Enter Buyer Password:");
		setBuyer_Password(br.readLine());
		System.out.println("Please Wait..Profile Is Updating");
		Common.Wait(500);
		Common.DrawLine();
		System.out.println("Profile Updated Successfully");
		Common.Wait(500);
		Common.DrawLine();
		System.out.println("Press Enter To Go Back");
		br.readLine();
		Common.BlankSpaces();
		BuyerOptions boptions=new BuyerOptions();
		boptions.MainOptions();
	}
	
	
	
	
	public void BuyerLogin() throws IOException{
		Common.DrawLine();
		System.out.println("-------Buyer Login-------");
		Common.DrawLine();
		System.out.println("Enter Buyer User Name :");
		setBuyer_UserName(br.readLine());
		
		System.out.println("Enter Buyer Password :");
		setBuyer_Password(br.readLine());
		
		Reports notifications=new Reports();
		notifications.ClearReportsWhenUserLoggedIn();
		
	}
}