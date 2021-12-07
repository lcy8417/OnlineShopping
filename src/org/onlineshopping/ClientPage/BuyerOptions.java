package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.InputStreamReader;

import org.onlineshopping.items.Items;
import org.onlineshopping.AuctionCompetition.BidNotifications;
import org.onlineshopping.AuctionCompetition.Bids;
import org.onlineshopping.ItemState.Account;
import org.onlineshopping.RegistrationInformation.Reports;

public class BuyerOptions{		
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Bids bids=new Bids();
	int MainOptionChoice;
	
	public void MainOptions()
	{
		BuyerSellerDetails buyerselleroptions=new BuyerSellerDetails();
		Buyer buyer=new Buyer();
		
		System.out.println("Welcome "+buyer.getBuyer_UserName());
		Common.DrawLine();
		System.out.println("-------Buyer Menu-------");
		Common.DrawLine();
		System.out.println("1. Display Items");
		System.out.println("2. Reports");
		System.out.println("3. Maintain Account");
		System.out.println("4. Notifications");
		System.out.println("5. Logout");
		Common.DrawLine();
		System.out.println("Select Choice:");
		try{
		MainOptionChoice=Integer.parseInt(br.readLine());
		
		Common.BlankSpaces();
		
		switch (MainOptionChoice) {
		case 1:
			Items items=new Items();
			items.DisplayItems();
			break;
			
		case 2:
			Reports notifications=new Reports();
			notifications.PrintReports();
			break;
			
		case 3:
			Common.DrawLine();
			Account acc=new Account();
			acc.AccountOptions();
			break;
			
		case 4:
			BidNotifications bidnotifications=new BidNotifications();
			bids.getBids();
			Common.DrawLine();						
			bidnotifications.Winner();
			
			break;
			
		case 5:			
			buyerselleroptions.MainOptions();
			break;

		default:			
			this.MainOptions();			
			break;
		}
		}
		catch(Exception er){
			Common.InvalidSelection();
			this.MainOptions();
		}
	}
}