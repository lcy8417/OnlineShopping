package org.onlineshopping.ClientPage;

import java.io.BufferedReader; 
import java.io.InputStreamReader;

import org.onlineshopping.Auction.CloseBid;
import org.onlineshopping.HandleItems.DeleteItem;
import org.onlineshopping.HandleItems.ItemClass;
import org.onlineshopping.HandleItems.UpdateItem;
import org.onlineshopping.items.Items;
import org.onlineshopping.Shipping.FullfillmentData;

public class SellerOptions {
	
	//public static int Count=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int MainOptionChoice;
		
	
	public void MainOptions()
	{
		Common.DrawLine();
		System.out.println("-------Seller Menu-------");
		Common.DrawLine();
		System.out.println("1. Add Item");
		System.out.println("2. Update Item");
		System.out.println("3. Delete Item");		
		System.out.println("4. Item reports");
		System.out.println("5. Close Bid For Item");
		System.out.println("6. Shipment");
		System.out.println("7. Get Buyer Address");
		System.out.println("8. Logout");
		Common.DrawLine();
		System.out.println("Select Choice:");
		try{
		MainOptionChoice=Integer.parseInt(br.readLine());
		
		if(Items.Count<=0){
			ItemClass itemclass=new ItemClass();
			itemclass.StaticItemsInArrayList();
			++Items.Count;
			}
		Common.BlankSpaces();
		
		switch (MainOptionChoice) {
		case 1:
			Common.BlankSpaces();
			/*CreateItem createitem=new CreateItem();
			createitem.CreateItems(6);*/
			ItemClass itemclass=new ItemClass();
			itemclass.AddDynamicItems();
			
			break;
			
		case 2:
			Common.BlankSpaces();
			UpdateItem updateitem=new UpdateItem();
			updateitem.UpdateItemInList();
			break;
			
		case 3:
			Common.BlankSpaces();
			DeleteItem deleteitem=new DeleteItem();
			deleteitem.Delete();
			break;
			
		case 4:
			Common.BlankSpaces();
			ItemClass itemclass1=new ItemClass();
			Seller seller=new Seller();
			System.out.println("List Of Items Created By "+seller.getSeller_UserName());
			Common.DrawLongLine();		
			System.out.println("Item Id \t\t Item Name \t\t Item Type \t\t Item Price");
			Common.DrawLongLine();
			if(itemclass1.GetListOfDynamicItems().size()>=6){
			itemclass1.DiplayArrayListDynamicItemsForSeller();
			}
			else{
				System.out.println("No Data Available");
			}
			Common.DrawLongLine();
			System.out.println("Press Enter To Go Back");			
			br.readLine();
			Common.BlankSpaces();
			MainOptions();			
			break;
			
		case 5:
			Common.BlankSpaces();
			Common.DrawLine();
			System.out.println("Close Perticular Bid");
			Common.DrawLine();
			CloseBid closebid=new CloseBid();
			closebid.ClosePerticularBid();
			
			break;
			
		case 6:
			Common.DrawLine();
			System.out.println("Shipment Information");
			Common.DrawLine();
			FullfillmentData fdata=new FullfillmentData();
			fdata.getFullfillmentData();
			Common.DrawLine();
			System.out.println("Press Enter To Go Back");
			br.readLine();
			Common.BlankSpaces();
			MainOptions();
			break;
			
		case 7:
			Buyer buyer=new Buyer();
			String Email;
			Common.BlankSpaces();
			Common.DrawLine();
			System.out.println("Get Buyer Address");
			Common.DrawLine();
			System.out.println("Enter Buyer Email Address :");
			Email=br.readLine();
			Common.DrawLine();
			System.out.println(buyer.getAddressByBuyerEmail(Email));
			Common.InsertDoubleSpace();
			System.out.println("Press Enter To Go Back");
			br.readLine();
			Common.BlankSpaces();
			this.MainOptions();
			break;

			
		case 8:
			BuyerSellerDetails buyerselleroptions=new BuyerSellerDetails();
			buyerselleroptions.MainOptions();
			break;

		default:
			Common.InvalidSelection();
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
