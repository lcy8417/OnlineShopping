package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;


public class BuyerSellerDetails {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int Choice,RegistrationChoice,LoginChoice;

	Buyer buyer=new Buyer();
	Seller seller=new Seller();
	Admin admin=new Admin();
	
	BuyerOptions buyeroptions=new BuyerOptions();
	
	public void MainOptions(){
		
		Common.DrawLine();		
		System.out.println("1. Register");
		System.out.println("2. Login");		
		Common.DrawLine();
		System.out.println("Select Choice ( 1 or 2 ) :");
		try{
		Choice=Integer.parseInt(br.readLine());
		
		Common.BlankSpaces();
		
		switch (Choice) {
		case 1:
			RegistrationOptions();
			
			break;
			
		case 2:
			LoginOptions();
			
			break;

		default:
			MainOptions();
			break;
		}
		}
		
		catch(Exception er)
		{
			Common.InvalidSelection();
			MainOptions();		
		}
	}
	
	public void RegistrationOptions() throws NumberFormatException, IOException {
		Common.DrawLine();
		System.out.println("-------Registration-------");
		Common.DrawLine();		
		System.out.println("1. Buyer Registration");
		System.out.println("2. Seller Registration");
		System.out.println("3. Back");
		Common.DrawLine();
		System.out.println("Select Choice:");
		RegistrationChoice=Integer.parseInt(br.readLine());
		
		Common.BlankSpaces();
		
		switch (RegistrationChoice) {
		case 1:
			BuyerRegistration();
			Common.BlankSpaces();
			MainOptions();
			break;
			
		case 2:
			SellerRegistration();			
			Common.BlankSpaces();
			MainOptions();
			break;
			
		case 3:
			MainOptions();
			break;
		default:
			Common.InvalidSelection();
			MainOptions();
			break;
		}
	}
	
	
	public void LoginOptions(){
		Common.DrawLine();
		System.out.println("-------Login-------");
		Common.DrawLine();
		System.out.println("1. Buyer Login");
		System.out.println("2. Seller Login");	
		System.out.println("3. Back");
		Common.DrawLine();
		System.out.println("Select Choice:");
		try{
		LoginChoice=Integer.parseInt(br.readLine());
		
		Common.BlankSpaces();
		
		switch (LoginChoice) {
		case 1:
			BuyerLogin();						
			Common.BlankSpaces();
			BuyerMainOptions();
			break;
		
		case 2:
			SellerLogin();
			Common.BlankSpaces();
			SellerMainOptions();
			break;
			
		case 3:
			MainOptions();
			break;
			
		default:
			Common.InvalidSelection();
			LoginOptions();
		}
		}
		catch(Exception er){
			Common.InvalidSelection();
			LoginOptions();
		}
	}

public void BuyerRegistration() throws NumberFormatException, IOException {
	buyer.BuyerRegistration();
}

public void BuyerLogin() throws NumberFormatException, IOException {
	buyer.BuyerLogin();
}

public void SellerRegistration() throws NumberFormatException, IOException {
	seller.SellerRegistration();
}

public void SellerLogin() throws NumberFormatException, IOException {
	seller.SellerLogin();
}

public void AdminLogin() throws NumberFormatException, IOException {
	admin.AdminLogin();
}

public void BuyerMainOptions() throws NumberFormatException, IOException {
	buyeroptions.MainOptions();
}

public void SellerMainOptions() throws NumberFormatException, IOException {
	SellerOptions selleroptions=new SellerOptions();
	selleroptions.MainOptions();
}
}