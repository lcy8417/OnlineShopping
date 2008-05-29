package org.onlineshopping.Shipping;

import java.util.ArrayList; 

import org.onlineshopping.ClientPage.Buyer;
import org.onlineshopping.HandleItems.ItemClass;
import org.onlineshopping.items.Items;

public class FullfillmentData {
	
	ItemClass itemclass=new ItemClass();
	public static ArrayList<String> shipmentData=new ArrayList<String>();
	Buyer buyer=new Buyer();
	
	
	public void getFullfillmentData(){
		if(shipmentData.size()>0){
		for(int i=0;i<shipmentData.size();i++){
			System.out.println(shipmentData.get(i));
		}
		}
		else{
			System.out.println("No Shipment Data Available");
		}
	}
	
	
	public void storeShipmentData(){
		try{
	int selectedItem=Items.SelectedItemId;
	//if(selectedItem>=6){
	int Index=selectedItem-1;
	String Name,Type,Price,Avail,Data;
	String[] ArrayData;
	Data=itemclass.newitem.get(Index);		
	ArrayData=Data.split(",");
	
	Name=ArrayData[1].toString();
	Price=ArrayData[3].toString();
	
	Data=Name+" Was Shipped To "+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address(); 
	
	shipmentData.add(Data);
	//}
/*	else{
		switch (selectedItem) {
		case 1:
			shipmentData.add("Dell Laptop Was Shipped To "+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address());
			break;
			
		case 2:
			shipmentData.add("IPhone Was Shipped To"+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address());
			break;
			
		case 3:
			shipmentData.add("Bag Was Shipped To"+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address());
			break;
			
		case 4:
			shipmentData.add("Bi-Cycle Was Shipped To"+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address());
			break;
			
		case 5:
			shipmentData.add("TV Was Shipped To"+buyer.getBuyer_UserName()+" At Address "+buyer.getBuyer_Address());
			break;

		default:
			break;
		}
	}*/
		}
		catch(Exception er){
			
		}
	}
}


