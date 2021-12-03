package org.onlineshopping.PaymentWindow;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.Auction.CloseBid;
import org.onlineshopping.HowToPay.BuyingOptions;
import org.onlineshopping.items.BuyerItemOptions;
import org.onlineshopping.items.Items;

public class PaymentOptions extends CustomerPayment {
	
	int PaymentChoice;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Items items=new Items();
	BuyingOptions buyingoptions=new BuyingOptions();

	public void BuyItemMenu() throws NumberFormatException, IOException{
		
	Common.BlankSpaces();
	Common.DrawLongLine();
	System.out.println("Payment Options");
	Common.DrawLongLine();
	System.out.println("1. Credit Card");
	System.out.println("2. Debit Card");
	System.out.println("3. Payby Paypal");
	System.out.println("4. Back");
	Common.InsertDoubleSpace();
	Common.DrawLongLine();
	System.out.println("Select Payment Method :");
	PaymentChoice=Integer.parseInt(br.readLine());
	CloseBid closebid=new CloseBid();
			
	switch (PaymentChoice) {
	case 1:
		closebid.MakeItemUnavailable(Items.SelectedItemId);
		buyingoptions.Pay(1);		
		break;
		
	case 2:
		closebid.MakeItemUnavailable(Items.SelectedItemId);
		buyingoptions.Pay(2);
		break;
		
	case 3:
		closebid.MakeItemUnavailable(Items.SelectedItemId);
		buyingoptions.Pay(3);
		break;		
	

	default:
		Common.BlankSpaces();
		items.DisplayItems();
		break;
	}
	}
}
