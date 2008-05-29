package org.onlineshopping.AuctionCompetition;

import java.util.ArrayList; 

import org.onlineshopping.ClientPage.Common;

public class Bids {
	public static ArrayList<String> bids=new ArrayList<String>();
	public void setBids(String Bid){
		bids.add(Bid);
	}
	
	public void getBids()
	{
		if(bids.size()>0){
			Common.BlankSpaces();
			System.out.println("Bid Notifications");
			Common.DrawLine();
			for(int i=0;i<bids.size();i++){
				String Type;
				String Data;
				String[] DataArray;
				Data=bids.get(i);
				DataArray=Data.split(" ");
				Type=DataArray[1].toString();
				if(!Type.equals("CBidded")){				
				System.out.println(bids.get(i));
				}
			}
		}
		else{
			System.out.println("No Previous Bids");
		}
	}
}
