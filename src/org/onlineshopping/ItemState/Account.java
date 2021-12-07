package org.onlineshopping.ItemState;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.Buyer;
import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.BuyerSellerDetails;
import org.onlineshopping.ClientPage.Common;

public class Account {
	int Choice;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void AccountOptions(){
		Common.BlankSpaces();
		Common.DrawLine();
		System.out.println("Maintain Account");
		Common.DrawLine();
		System.out.println("1. Update Profile");
		System.out.println("2. Delete Account");
		System.out.println("3. Back");
		Common.InsertDoubleSpace();
		Common.DrawLine();
		System.out.println("Enter Your Choice :");
		try{
		Choice=Integer.parseInt(br.readLine());
		Common.BlankSpaces();
		switch (Choice) {
		case 1:
			UpdateProfile();
			break;
			
		case 2:
			DeleteProfile();
			break;
			
		case 3:
			BuyerOptions bopt=new BuyerOptions();
			Common.BlankSpaces();
			bopt.MainOptions();
			break;

		default:
			Common.DrawLine();
			System.out.println("Invalid Option.. Press Enter To Try Again");
			Common.DrawLine();
			br.readLine();
			Common.BlankSpaces();
			this.AccountOptions();
			break;
		}
		
		}
		catch(Exception er){
			System.out.println("Invalid Option... Try Again");
			Common.Wait(1000);
			this.AccountOptions();
		}
	}
	
	public void UpdateProfile(){
		Buyer buyer=new Buyer();
		try{
		buyer.UpdateBuyerDetails();
		}
		catch(Exception er){
			System.out.println("Error Occured.. Try again");
			Common.Wait(1000);
			Common.BlankSpaces();
			this.UpdateProfile();
		}
	}
	
	public void DeleteProfile(){
		BuyerSellerDetails bsd=new BuyerSellerDetails();
		Common.BlankSpaces();
		Common.DrawLine();
		System.out.println("Delete Profile");
		Common.DrawLine();
		System.out.println("Are You Sure Do You Want To Deactivate Your Account ? (Y/N) :");
		try{
		char YN=(char)System.in.read();
		
		switch (YN) {
		case 'y':
			System.out.println("Deactivating Account......");
			Common.Wait(1000);
			System.out.println("Your Account Deactivated Successfully.. Press Enter To Go Back");
			br.readLine();
			Common.BlankSpaces();
			bsd.MainOptions();
			break;
			
		case 'n':
			Common.BlankSpaces();
			bsd.BuyerMainOptions();			
			
		default:
			Common.BlankSpaces();			
			bsd.BuyerMainOptions();
			break;
		}
		
		}
		catch(Exception er){
		
		}
	}
}
