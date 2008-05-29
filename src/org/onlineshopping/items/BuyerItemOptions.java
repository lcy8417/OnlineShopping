package org.onlineshopping.items;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import org.onlineshopping.PaymentWindow.PaymentOptions;
import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.Auction.CloseBidding;
import org.onlineshopping.Auction.OpenBidding;
import org.onlineshopping.HandleItems.RentItem;
import org.onlineshopping.AuctionCompetition.BidNotifications;

public class BuyerItemOptions {

	int ItemSelectionChoice=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void BuyyableMenu() throws NumberFormatException, IOException{
	System.out.println("1. Buy Item");
	System.out.println("2. Back");
	Common.DrawLongLine();
	System.out.println("\n\n Select a Choice:");
	ItemSelectionChoice=Integer.parseInt(br.readLine());
	
	switch (ItemSelectionChoice) {
	case 1:
		
		PaymentOptions paymentoptions=new PaymentOptions();
		paymentoptions.BuyItemMenu();
		break;		
	

	default:
		Common.BlankSpaces();
		Items items=new Items();
		items.DisplayItems();
		
		break;
	}
	
	}
	
	
	public void BiddableMenu1(String ItemName, int ItemPrice) throws NumberFormatException, IOException{
		OpenBidding openbidding=new OpenBidding();
		BidNotifications bidnotifications=new BidNotifications();
		
		System.out.println("1. Open Bid");		
		System.out.println("2. Back");
		Common.DrawLongLine();
		System.out.println("\n\n Select a Choice:");
		ItemSelectionChoice=Integer.parseInt(br.readLine());
		
		switch (ItemSelectionChoice) {
		case 1:
			try{
			Common.BlankSpaces();
			Common.DrawLine();
			System.out.println("Recent Biddings");
			Common.DrawLine();
			bidnotifications.ShowAllBids();
			openbidding.OpenBid(ItemName, ItemPrice);
			}
			catch(Exception er){
				System.out.println("No Previous Biddings Placed");
			}
			break;
			
		case 2:
			Common.BlankSpaces();
			Items items1=new Items();
			items1.DisplayItems();
			break;		
		

		default:
			Common.BlankSpaces();
			Items items=new Items();
			items.DisplayItems();
			
			break;
		}
		
		}
	
	
	
	
	
	
	
	public void BiddableMenu2(String ItemName, int ItemPrice) throws NumberFormatException, IOException{
		CloseBidding closebidding=new CloseBidding();
		BidNotifications bidnotifications=new BidNotifications();
		
		System.out.println("1. Close Bid");
		System.out.println("2. Back");
		Common.DrawLongLine();
		System.out.println("\n\n Select a Choice:");
		ItemSelectionChoice=Integer.parseInt(br.readLine());
		
		switch (ItemSelectionChoice) {
		case 1:
			
			Common.BlankSpaces();
			Common.DrawLine();
			System.out.println("Recent Biddings");
			Common.DrawLine();			
			closebidding.CloseBid(ItemName, ItemPrice);
	
			break;		
		
		case 2:
			Common.BlankSpaces();
			Items items2=new Items();
			items2.DisplayItems();
			break;

		default:
			Common.BlankSpaces();
			Items items=new Items();
			items.DisplayItems();
			
			break;
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void RentableMenu() throws NumberFormatException, IOException{
		System.out.println("1. Rent Item");		
		System.out.println("2. Back");
		Common.DrawLongLine();
		System.out.println("\n\n Select a Choice:");
		ItemSelectionChoice=Integer.parseInt(br.readLine());
		
		switch (ItemSelectionChoice) {
		case 1:
			Common.BlankSpaces();
			RentItem rentitem=new RentItem();
			rentitem.RentItemByItemId(1);
			break;
			
	
		default:
			Common.BlankSpaces();
			Items items=new Items();
			items.DisplayItems();
			
			break;
		}
		
		}
}
