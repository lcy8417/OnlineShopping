package org.onlineshopping.PaymentWindow;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.items.Items;
import org.onlineshopping.Shipping.FullfillmentData;
import org.onlineshopping.Shipping.Fullfillments;

public class Online extends PaymentMode {
	
	public static float ActualAmount=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	FullfillmentData fdata=new FullfillmentData();
	
 	public void Paypal(String UserName, String Password, float Amount) {
 		try{
 			ActualAmount=Items.price;
	ProcessPayment("Paypal");
	
 		}
 		catch(Exception we){
 			System.out.println("Error Occured:"+we.getMessage());
 		}
}


	public void CreditCard(long CreditCardNumber, int CVV, String ExpiryDate, float Amount){
		try{
			ActualAmount=Items.price;
	ProcessPayment("CreditCard");
	
		}
		catch(Exception we){
 			System.out.println("Error Occured:"+we.getMessage());
 		}
	
}

	
	public void ProcessPayment(String Type){
		
		long CreditCardNumber;
		int CVV;
		float Amount1;
		String ExpiryDate;
		
		try{
		
		if(Type.equals("CreditCard")){
			Common.DrawLongLine();
			System.out.println("Pay By Credit Card");
			Common.DrawLongLine();
		System.out.println("Enter Credit Card Number :");
		CreditCardNumber=Long.parseLong(br.readLine());
		
		System.out.println("Enter CVV Number :");
		CVV=Integer.parseInt(br.readLine());
					
		System.out.println("Enter Expiry Date:");
		ExpiryDate=br.readLine();
		
		System.out.println("Enter Amount :");
		Amount1=Float.parseFloat(br.readLine());
		
		if(ActualAmount!=Amount1){
			System.out.println("You Entered Wrong Amount For Item... Please Try Again");
			Common.Wait(1000);
			Common.BlankSpaces();
			this.ProcessPayment(Type);
		}
		
		}
		
		if(Type.equals("DebitCard")){
		
			long DebitCardNumber;
			int Pin;
			float DAmount;
			String DExpiryDate;
			
			Common.DrawLongLine();
			System.out.println("Pay By Debit Card");
			Common.DrawLongLine();
			System.out.println("Enter Debit Card Number :");
			CreditCardNumber=Long.parseLong(br.readLine());
			
			System.out.println("Enter PIN Number :");
			CVV=Integer.parseInt(br.readLine());
									
			System.out.println("Enter Expiry Date:");
			DExpiryDate=br.readLine();
			
			System.out.println("Enter Amount :");
			DAmount=Float.parseFloat(br.readLine());
			
			if(ActualAmount!=DAmount){
				System.out.println("You Entered Wrong Amount For Item... Please Try Again");
				Common.Wait(1000);
				Common.BlankSpaces();
				this.ProcessPayment(Type);
			}
		}
		
		if(Type.equals("Paypal")){
			String UserName,Password;
			Float PAmount;
			Common.DrawLongLine();
			System.out.println("Pay By Paypal");
			Common.DrawLongLine();
			System.out.println("Enter Paypal User Name:");
			UserName=br.readLine();
			System.out.println("Enter Paypal Password:");
			Password=br.readLine();
			
			System.out.println("Enter Amount :");
			PAmount=Float.parseFloat(br.readLine());
			
			if(ActualAmount!=PAmount){
				System.out.println("You Entered Wrong Amount For Item... Please Try Again");
				Common.Wait(1000);
				Common.BlankSpaces();
				this.ProcessPayment(Type);
			}
		}
		
		System.out.println("Please Wait......... While Processing Your Request");
		try
		{
			fdata.storeShipmentData();
		Thread.sleep(2000);
		System.out.println("Your Payment is Successful");
		
		Common.DrawLine();
		Common.Wait(700);
		Fullfillments fment=new Fullfillments();
		fment.FullfillmentTypes();
		
		System.out.print("\nPress Enter To Go Back");
		br.readLine();
		Common.BlankSpaces();
		BuyerOptions buyeroptions=new BuyerOptions();
		buyeroptions.MainOptions();		
		}
		catch(Exception er){
		System.out.println("Error Occured While Processing :"+er.getMessage());
		}
		}
		catch(Exception er){
			System.out.println("Invalid Selection... Please Try Again");
			Common.Wait(1000);
			Common.BlankSpaces();
			ProcessPayment(Type);
		}
	}


	@Override
	public void DebitCard(long DebitCardNumber, int Pin, String ExpiryDate,
			float Amount) {
		try{
			ActualAmount=Items.price;
		ProcessPayment("DebitCard");
		}
		catch(Exception we){
 			System.out.println("Error Occured:"+we.getMessage());
 		}
		
	}
}