package org.onlineshopping.Auction;

import java.io.BufferedReader; 
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.Buyer;
import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.>AuctionCompetition.BidNotifications;
import org.onlineshopping.>AuctionCompetition.Bids;

public class OpenBidding {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int BiddingAmount;
	Buyer buyer=new Buyer();
	BuyerOptions buyeroptions=new BuyerOptions();
	BidNotifications bidnotifications=new BidNotifications();
	Bids bids=new Bids();
		
	public void OpenBid(String ItemName, int ItemPrice){
		System.out.println("Time : 5:00");
		Common.DrawLine();		
		System.out.print("Item Price :"+ItemPrice);
		System.out.print("\t\t Current Bidding :"+bidnotifications.CurrentBidding());
		System.out.println();
		System.out.println("Press 0 To Go Back :");
		Common.DrawLine();
		System.out.println("Enter Bidding Amount :");
		try{
		BiddingAmount=Integer.parseInt(br.readLine());
		if(BiddingAmount==0){
			Common.BlankSpaces();
			buyeroptions.MainOptions();
		}
		else{
		String UserName=buyer.getBuyer_UserName();
		
		if(BiddingAmount>ItemPrice){
			BiddingArray.AllBids.add(UserName+" Bidded Amount $ "+BiddingAmount+" To "+ItemName);
			bids.setBids(buyer.getBuyer_UserName()+" Bidded "+" Amount $"+" "+BiddingAmount+" To "+ItemName);
			Common.DrawLine();
			System.out.println("Bid Placed Successfully");
			System.out.println("Press Enter to Go Back");
			br.readLine();
			Common.BlankSpaces();
			buyeroptions.MainOptions();
		}
		else{
			System.out.println("Enter Bidding Amount Grater Than The Original Amount");
			Common.Wait(1000);
			this.OpenBid(ItemName,ItemPrice);
		}
		}
		}
		catch(Exception er){
			Common.InvalidSelection();
			this.OpenBid(ItemName,ItemPrice);
		}
	}
}
