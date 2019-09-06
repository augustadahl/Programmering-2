package LäxaRepetition;

import java.util.ArrayList;

public class Box {

	private static ArrayList<String> lada = new ArrayList<String>();
	
	public static void add(String s) {
		lada.add(s);
	}
	
	public static ArrayList<String> returnera(){
		return lada;
	}
	
}
