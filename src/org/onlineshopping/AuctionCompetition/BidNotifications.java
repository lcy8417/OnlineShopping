package org.onlineshopping.AuctionCompetition;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.onlineshopping.ClientPage.Buyer;
import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.Auction.BiddingArray;
import org.onlineshopping.items.BuyerItemOptions;
import org.onlineshopping.items.Items;
import org.onlineshopping.Shipping.FullfillmentData;

public class BidNotifications extends BidNotificationsObserver{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Bids bs=new Bids();
	Buyer buyer=new Buyer();
	
	ArrayList<String> bids=new ArrayList<String>();
	@Override
	public void ShowAllBids() {
		bids=BiddingArray.AllBids;
		if(bids.size()>0){
		/*for(int i=0;i<bids.size();i++){
		System.out.println(bids.get(i));
		System.out.println();
		}*/
			bs.getBids();
		}
		else{
			System.out.println("No Previous Bids Placed");
		}
	}
	HashMap<Integer, String> winner=new HashMap<Integer,String>();
	
	@Override
	public void Winner() {
		try{
		bids=BiddingArray.AllBids;
		for(int i=0;i<bids.size();i++){
			
		String data=bids.get(i);
		String[] data1=data.split(" ");
		int amount=Integer.parseInt(data1[4].toString());
		String name=data1[0].toString();
		
			winner.put(new Integer(amount),name);
			
	
		}
		
		
		int obj = Collections.max(winner.keySet());
		System.out.println("Winner");
		Common.DrawLine();	
	    System.out.println("Winner is : "+winner.get(obj)+" He Bidded :"+obj);	    
	    Common.InsertDoubleSpace();
	    
	    String LoggedInUser=buyer.getBuyer_UserName();
	    String Winner=winner.get(obj);
	    
	    if(LoggedInUser.equals(Winner)){
	    	//FullfillmentData fdata=new FullfillmentData();
	    	//fdata.storeShipmentData();
	    	Items.price=obj;
	    	BuyerItemOptions bio=new BuyerItemOptions();
	    	bio.BuyyableMenu();
	    }
	    
	    System.out.println("Press Enter to Go Back");
	    	    	
	    br.readLine();
	    Common.BlankSpaces();
	    BuyerOptions bo=new BuyerOptions();
	    bo.MainOptions();
	    }
	    catch(Exception er){
	    	Common.DrawLine();
	    	System.out.println("No Bidding Information Available... Press Enter to Go Back");
	    	try{
	    	br.readLine();
	    	Common.BlankSpaces();
	    	BuyerOptions buyeropt=new BuyerOptions();
	    	buyeropt.MainOptions();
	    	}
	    	catch(Exception er1)
	    	{
	    		
	    	}
	    }
	}
	
	
	
	
	
	
	
	public String CurrentBidding() {
		bids=BiddingArray.AllBids;
		for(int i=0;i<bids.size();i++){
			
		String data=bids.get(i);
		String[] data1=data.split(" ");
		int amount=Integer.parseInt(data1[4].toString());
		String name=data1[0].toString();
		
			winner.put(new Integer(amount),name);
			
	
		}
		String current="No Previous Bidding";
		try{
		int obj = Collections.max(winner.keySet());
		
	    current=""+obj;
		}
		catch(Exception er){}
	    return current;
	}	
}
