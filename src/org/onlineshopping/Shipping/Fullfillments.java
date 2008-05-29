package org.onlineshopping.Shipping;

import java.io.BufferedReader; 
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.Common;

public class Fullfillments extends FullfillmentTemplate{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	

	@Override
	public void FullfillmentSuccessMessage(String Days) {
		Common.DrawLine();
		Common.Wait(1000);
		System.out.println("Your Item Has Been Packed Successfully");
		Common.Wait(1000);
		if(Days.equals("One")){
		System.out.println("Your Item Shipped Successfully.. You Will Receive Your Item In "+Days+"  Day");
		}
		else{
			System.out.println("Your Item Shipped Successfully.. You Will Receive Your Item In a "+Days+" Of  Day");
		}
		
		Common.DrawLine();
		System.out.println("Press Enter To Go Back");
		try{
		br.readLine();
		Common.BlankSpaces();
		BuyerOptions buyeroptions=new BuyerOptions();
		buyeroptions.MainOptions();		
		}
		catch(Exception er){}
	}

	@Override
	public void FullfillmentTypes() {
		int Choice;
			System.out.println("Select Fullfillment Type:");
			Common.DrawLine();
			Common.InsertDoubleSpace();
			System.out.println("1. One Day Shippment");
			System.out.println("2. Regular Shippment");
			Common.DrawLine();
			System.out.println("Enter Choice:");
			try{
			Choice=Integer.parseInt(br.readLine());
			switch (Choice) {
			case 1:
				FullfillmentTypes fullfillmenttypes=new FullfillmentTypes();
				fullfillmenttypes.OneDayShipping();
				break;
				
			case 2:
				FullfillmentTypes fullfillmenttypes1=new FullfillmentTypes();
				fullfillmenttypes1.RegularShipping();
				break;

			default:
				ErrorMessage();
				break;
			}
			}
			catch(Exception er){
				ErrorMessage();
			}
	}
	
	public void ErrorMessage(){
		System.out.println("You Selected Invalid Fullfillment Type.. Try Again.....");
		Common.Wait(1000);
		Common.BlankSpaces();
		this.FullfillmentTypes();
	}

}
