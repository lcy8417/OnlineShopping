package org.onlineshopping.Auction;

import java.io.BufferedReader; 
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.ClientPage.SellerOptions;
import org.onlineshopping.HandleItems.ItemClass;

public class CloseBid {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ItemClass itemclass=new ItemClass();
	int ItemId,Index;
	public void ClosePerticularBid(){
		System.out.println("Enter Item Id To Close The BID :");
		try
		{
		ItemId=Integer.parseInt(br.readLine());
		Index=ItemId-1;
		String Name,Type,Price,Avail;
		String Data=itemclass.newitem.get(Index);
		String[] ArrayData;		
		ArrayData=Data.split(",");
		Name=ArrayData[1].toString();
		Type=ArrayData[2].toString();
		Price=ArrayData[3].toString();
		Avail="Not Available";
		Data=ItemId+","+Name+","+Type+","+Price+","+Avail;
		itemclass.newitem.remove(Index);
		itemclass.newitem.add(Index, Data);
		System.out.println("Bid Closed Successfully.. Press Enter to Go Back");
		br.readLine();
		Common.BlankSpaces();
		SellerOptions selleroptions=new SellerOptions();
		selleroptions.MainOptions();
		}
		catch(Exception er)
		{
			System.out.println("Wrong Input.. Enter Again");
			Common.Wait(1500);
			Common.BlankSpaces();
			this.ClosePerticularBid();
		}
	}
	
	
	
	
	
	
	
	public void MakeItemUnavailable(int ItemId1){
		
		try
		{
		
		Index=ItemId1-1;
		String Name,Type,Price,Avail;
		String Data=itemclass.newitem.get(Index);
		String[] ArrayData;		
		ArrayData=Data.split(",");
		Name=ArrayData[1].toString();
		Type=ArrayData[2].toString();
		Price=ArrayData[3].toString();
		Avail="Not Available";
		Data=ItemId1+","+Name+","+Type+","+Price+","+Avail;
		itemclass.newitem.remove(Index);
		itemclass.newitem.add(Index, Data);
		
		}
		catch(Exception er)
		{
			
		}
	}
	
	
	
	
	
}
