package org.onlineshopping.ClientPage;

import java.util.Arrays;

public class Common {
public static void DrawLine() {
	System.out.println("====================================");
}

public static void DrawLongLine() {
System.out.println("======================================================================================");
}

public static void InvalidSelection(){
	System.out.println("Invalid Selection.. Try Again");
	Wait(1000);
	BlankSpaces();
}

public static void InsertDoubleSpace() {
	System.out.println("\n");
}

public static void BlankSpaces()
{
	char c = '\n';
	int length = 25;
	char[] chars = new char[length];
	Arrays.fill(chars, c);
	System.out.print(String.valueOf(chars));
}

public static void Wait(int Time){
	try{
	Thread.sleep(Time);
	}
	catch(Exception er){
		System.out.println("Error Occured :"+er.getMessage());
	}
}
}
