package org.onlineshopping.ClientPage;

import java.io.IOException;


public class Client {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BuyerSellerDetails details=new BuyerSellerDetails();
		Common.DrawLine();
		System.out.println("\tOnline Shopping");		
		details.MainOptions();
		
		
	}
}
