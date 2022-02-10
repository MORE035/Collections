package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WaysOfArrayList {

	public static void main(String[] args) {

		//single line code declaration
		
		ArrayList<String> cities=new ArrayList<String>(Arrays.asList("chennai","kochi"));
		cities.add("Goa");
		System.out.println(cities);
		//--------------------------------------------------------------
		//heard coding the values-----------------
		ArrayList<String> al=new ArrayList<String>();
		al.add("Tirupati");
		al.add("renugunta");
		al.add(1, "Srikalahasti");
		
		System.out.println(al);
//--------reverse the arraylist--------------------------------------
		
		ArrayList<String> rev=new ArrayList<String>();

		for(int i=al.size()-1;i>=0;i--) {
			rev.add(al.get(i));
		}
		System.out.println(rev);
//----------------------------------------------------------------------
//------------add two arrays---------------------
		ArrayList<String> newarray=new ArrayList<String>();
		newarray.addAll(cities);
		newarray.addAll(al);
		
		System.out.println(newarray);
//---------------------------------------------------
//---integer array---------------------------
		ArrayList<Integer> integ=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(integ);

	}

}
