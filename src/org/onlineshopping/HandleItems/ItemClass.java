package org.onlineshopping.HandleItems;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.ClientPage.SellerOptions;

public class ItemClass extends AddItemAbstractClass{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static ArrayList<String> newitem=new ArrayList<String>();
	SellerOptions selleroptions=new SellerOptions();
	
	private static int[] Item_Id=new int[10];
	private static String[] Item_Name=new String[10];
	protected static String[]Item_Type=new String[30];
	protected static String decription =new String();
	private static String[] Item_Price=new String[10];
	protected static Boolean[] Available=new Boolean[10];

	public int getItem_Id(int no) {
		return Item_Id[no];
	}
	public void setItem_Id(int no,int item_Id) {
		Item_Id[no] = item_Id;
	}
	
	public Boolean getItemAvailability(int no){
		return Available[no];
	}

	public String printAvailable(int no) {
		if(Available[no] == false ){
			return "can not use";
		}else{
			return "can use";
		}
	}
	
	public String getItem_Name(int no) {
		return Item_Name[no];
	}
	public void setItem_Name(int no,String item_Name) {
		Item_Name[no] = item_Name;
	}
	public String getItem_Type(int no) {
		return Item_Type[no];
	}
	public void setItem_Type(int no,String item_Type) {
		Item_Type[no] = item_Type;
	}
	public String getItem_Price(int no) {
		return Item_Price[no];
	}
	public void setItem_Price(int no,String item_Price) {
		Item_Price[no] = item_Price;
	}
	
	@Override
	public void DisplayDynamicItems(int no) {
	System.out.println(getItem_Id(no)+"\t\t\t"+getItem_Name(no)+"\t\t\t"+getItem_Type(no)+"\t\t\t\t"+getItem_Price(no));	
	}
	@Override
	public void AddItem(int no) {
		try{
			Common.DrawLine();
			System.out.println("Adding New Item");
			Common.DrawLine();
		System.out.println("Enter Item Id:");
		setItem_Id(no,Integer.parseInt(br.readLine()));
		
		System.out.println("Enter Item Name:");
		setItem_Name(no,br.readLine());
		
		System.out.println("Enter Item Type:");
		setItem_Type(no,br.readLine());
		
		System.out.println("Enter Item Price:");
		setItem_Price(no,br.readLine());
		
		}
		catch(Exception er){
		}
	}
		
	public int get_NumberOfItems()
	{
		return getNumberOfItems();
	}
	
	public void set_NumberOfItems(int No)
	{
		setNumberOfItems(No);
	}
	
	public void CreateNewItem(int no){
		try{
			Common.DrawLine();
			System.out.println("Adding New Item");
			Common.DrawLine();		
		System.out.println("Enter Item Id:");
		setItem_Id(no,Integer.parseInt(br.readLine()));
		
		System.out.println("Enter Item Name:");
		setItem_Name(no,br.readLine());
		
		System.out.println("Enter Item Type:");
		setItem_Type(no,br.readLine());
		
		System.out.println("Enter Item Price:");
		setItem_Price(no,br.readLine());
		
		System.out.println("Enter Availability:");
		//setAvailable(no,br.readLine());
		}
		catch(Exception er){
			System.out.println("Error Occured:"+er.getMessage());
		}
	}
	
	
	
	
	
	
	//Dynamic Items With Collections
	public void AddDynamicItems(){
		try{
			String id,name,type,price,available;
			Common.DrawLine();
			System.out.println("Adding New Item");
			Common.DrawLine();		
		System.out.println("Enter Item Id:");
		id=br.readLine();
		
		System.out.println("Enter Item Name:");
		name=br.readLine();
		
		System.out.println("Enter Item Type:");
		type=br.readLine();
		
		System.out.println("Enter Item Price:");
		price=br.readLine();
		
		System.out.println("Enter Availability:");
		available=br.readLine();
		
		newitem.add(id+","+name+","+type+","+price+","+available);
		
		
			Common.BlankSpaces();
		selleroptions.MainOptions();
		
		
		}
		catch(Exception er){
			System.out.println("Error Occured:"+er.getMessage());
		}
	}
	
	public ArrayList<String> GetListOfDynamicItems() {
		return newitem;		
	}
	
	public void DiplayArrayListDynamicItems(){
		String id,name,type,price,available;
		String[] splitvar;
		for(int i=0;i<newitem.size();i++){
		splitvar=newitem.get(i).split(",");
		id=splitvar[0].toString();
		name=splitvar[1].toString();
		type=splitvar[2].toString();
		price=splitvar[3].toString();
		available=splitvar[4].toString();
		
		System.out.println(id+"\t\t\t"+name+"\t\t\t"+type+"\t\t\t\t"+price);
		}
	}
	
	
	public void DiplayArrayListDynamicItemsForSeller(){
		String id,name,type,price,available;
		String[] splitvar;
		for(int i=5;i<newitem.size();i++){
		splitvar=newitem.get(i).split(",");
		id=splitvar[0].toString();
		name=splitvar[1].toString();
		type=splitvar[2].toString();
		price=splitvar[3].toString();
		available=splitvar[4].toString();
		
		System.out.println(id+"\t\t\t"+name+"\t\t\t"+type+"\t\t\t\t"+price);
		}
	}
	
	public void DeleteItemFromArrayList() {
		System.out.println("Delete Item");
		Common.DrawLine();
		System.out.println("Enter Item Id To Delete :");
		try{
		int Index=Integer.parseInt(br.readLine());
		int ItemId,ArrayIndex;
		ItemId=Index;
		ArrayIndex=ItemId-1;
		newitem.remove(ArrayIndex);		
		System.out.println("Item Removed Successfully");
		Common.DrawLine();
		System.out.println("Press Enter To Go Back");
		br.readLine();
		Common.BlankSpaces();
		selleroptions.MainOptions();
		}
		catch(Exception er)
		{
			Common.DrawLine();
			System.out.println("There Is No Item To Delete");
			Common.DrawLine();
			System.out.println("Press Enter To Go Back");
			try{
			br.readLine();
			Common.BlankSpaces();
			selleroptions.MainOptions();
			}
			catch(Exception er1){}
		}
		
	}
	
	public void UpdateItemFromArrayList(){
		
		try{
		String id,name,type,price,available;
		Common.DrawLine();
		System.out.println("Updating Item");
		Common.DrawLine();		
		System.out.println("Enter Item Id:");
		id=br.readLine();
		
		int ItemId,ArrayIndex;
		ItemId=Integer.parseInt(id);
		ArrayIndex=ItemId-1;
		newitem.remove(ArrayIndex);
		
		System.out.println("Enter Item Name:");
		name=br.readLine();
		
		System.out.println("Enter Item Type:");
		type=br.readLine();
		
		System.out.println("Enter Item Price:");
		price=br.readLine();
		
		System.out.println("Enter Availability:");
		available=br.readLine();
		
		newitem.add(ArrayIndex, id+","+name+","+type+","+price+","+available);
		System.out.println("Item Updated Successfully");
		}
		catch(Exception er){
			System.out.println("Error Occured:"+er.getMessage());
			Common.InvalidSelection();
			selleroptions.MainOptions();
		}
		
		
		System.out.println("Press Enter To Go Back");
		try{
		br.readLine();
		Common.BlankSpaces();
		selleroptions.MainOptions();
		}
		catch(Exception er){}
		
	}
	
	
	
	public String[] GetArrayListItemByItemId(int ItemId) {
		int ItemId1,ArrayIndex;
		ItemId1=ItemId;
		ArrayIndex=ItemId-1;
		String[] ItemData=null;
		try{
		String Item=newitem.get(ArrayIndex);
		ItemData=Item.split(",");
		}
		catch(Exception er){}
		return ItemData;
	}
	
	
	
	
	public void StaticItemsInArrayList(){
		
		newitem.add(0, "1,Dell Laptop,Buyable,500,Available");
		newitem.add(1, "2,IPhone,Rentable,950,Available");
		newitem.add(2, "3,Bag,Open Bid,100,Available");
		newitem.add(3, "4,Fan,Close Bid,50,Available");
		newitem.add(4, "5,Bi-Cycle,Buyable,100,Available");
		
	}	
}