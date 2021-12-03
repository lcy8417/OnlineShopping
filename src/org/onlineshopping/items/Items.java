package org.onlineshopping.items;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import org.onlineshopping.ClientPage.Buyer;
import org.onlineshopping.ClientPage.BuyerOptions;
import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.Auction.BiddingArray;
import org.onlineshopping.HandleItems.AddItems;
import org.onlineshopping.HandleItems.ItemClass;
import org.onlineshopping.AuctionCompetition.Bids;
import org.onlineshopping.ItemState.ItemCount;
import org.onlineshopping.RegistrationInformation.*;

public class Items {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	ItemClass itemclass=new ItemClass();
	AddItems additem=new AddItems();
	public int Item_Id;
	BiddingArray biddingarray=new BiddingArray();
	Bids bids=new Bids();
	public static int SelectedItemId;
	public static int Count=0;
	
	public void DisplayItems() throws NumberFormatException, IOException{
		
		if(Count<=0){
			itemclass.StaticItemsInArrayList();
			++Count;
			}
		
		ItemCount count=new ItemCount();
		System.out.println("-------Items Inventory-------");
		Common.DrawLine();		
		System.out.println("Total Number Of Available Items In Inventory :"+count.GetNumberOfItems());
		System.out.println("======================================================================================");		
		System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
		System.out.println("======================================================================================");
		
		
		
	/*	System.out.println("1 \t\t\t Dell Laptop \t\t Buyable \t\t\t $500");
		System.out.println("2 \t\t\t IPhone \t\t Rentable \t\t\t $950");
		System.out.println("3 \t\t\t Bag \t\t\t Biddable \t\t\t $500");
		System.out.println("4 \t\t\t Bi-Cycle \t\t Buyable \t\t\t $100");
		System.out.println("5 \t\t\t TV \t\t\t Rentable \t\t\t $200"); */
		
		//Display Dynamic Items
		
		itemclass.DiplayArrayListDynamicItems();
		
		System.out.println("======================================================================================");
		
		SelectItem();
	}
	
	public static int price=0;
	
	public void SelectItem() throws NumberFormatException, IOException
	{
		Reports notifications=new Reports();
		Buyer buyer=new Buyer();
		System.out.println("Enter 0 For Back:");
		Common.InsertDoubleSpace();
		System.out.println("\n\nSelect Item Id:");
		Item_Id=Integer.parseInt(br.readLine());
		SelectedItemId=Item_Id;
		BuyerItemOptions buyeritemoptions=new BuyerItemOptions();
		
		//ItemClass itemclass=new ItemClass();
		String[] itemdata;
		String type,name,Available,id;
		
		
		switch (Item_Id) {
		case 1:
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
		case 2:
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
		case 3:
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
		case 4:
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
		case 5:
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
		case 6:			
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			
			break;
			
			
			
			
			
			
			
			
		case 7:			
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			break;
			
			
			
		case 8:			
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			
			break;
			
			
		case 9:			
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			
			break;
			

		case 10:			
			itemdata=itemclass.GetArrayListItemByItemId(Item_Id);
			if(itemdata!=null){
			type=itemdata[2].toString();
			name=itemdata[1].toString();
			Available=itemdata[4].toString();
			price=Integer.parseInt(itemdata[3].toString());
			id=itemdata[0].toString();
			
			
			
			if(Available!=null){
			
			Common.BlankSpaces();
			Common.DrawLongLine();
			System.out.println("Item Availability :"+ Available+"\n\n");
			Common.DrawLongLine();
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			System.out.println(id+"\t\t\t"+ name +"\t\t\t"+type +"\t\t\t"+price);
			Common.InsertDoubleSpace();
			
			if(Available.equals("Available")){
				notifications.SetReports(buyer.getBuyer_UserName()," "+type," "+name," At "+price);
				if(type.equals("Buyable")){
					buyeritemoptions.BuyyableMenu();
				}
				
				if(type.equals("Rentable")){
					buyeritemoptions.RentableMenu();
				}
				
				if(type.equals("Open Bid")){
					buyeritemoptions.BiddableMenu1(name,price);
				}
				
				if(type.equals("Close Bid")){
					buyeritemoptions.BiddableMenu2(name,price);
				}
			
			}
			
			else{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
				DisplayItems();
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			}
			else
			{
				System.out.println("Item Not Available");
				Common.Wait(1000);
				Common.BlankSpaces();
			DisplayItems();	
			}
			
			break;
			
			
		default:
			Common.BlankSpaces();
			BuyerOptions buyeroptions=new BuyerOptions();
			buyeroptions.MainOptions();
			
			break;
		}
	}
}