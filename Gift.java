package pep;
import java.util.*;
public class Gift {
	public static void main(String[] args) {
		String Sweets[]= {"kova","Zangri"};
		String Chocolate[]= {"Diarymilk","Kitkat"};
		String Candies[]= {"Sweetcandy","Mintcandy"};
		
		Random r=new Random();
		int x=r.nextInt(11);
		double totalweight1=0;
		double totalweight2=0;
		System.out.println("Gift1 Items...............");
		Kova obj1=new Kova();
		obj1.setweight(2*x);
		totalweight1+=obj1.getweight();
		Zangri obj2=new Zangri();
		obj2.setweight(3*x);
		totalweight1+=obj2.getweight();
		Diarymilk obj3=new Diarymilk();
		obj3.setweight(4*x);
		totalweight1+=obj3.getweight();
		Kitkat obj4=new Kitkat();
		obj4.setweight(5*x);
		totalweight1+=obj4.getweight();
		Diarymilk obj5=new Diarymilk();
		obj5.setweight(4*x);
		totalweight2+=obj5.getweight();
		Kitkat obj6=new Kitkat();
		obj6.setweight(5*x);
		totalweight2+=obj6.getweight();
		Sweetcandy obj7=new Sweetcandy();
		obj7.setweight(2*x);
		totalweight2+=obj7.getweight();
		Mintcandy obj8=new Mintcandy();
		obj8.setweight(2*x);
		totalweight2+=obj8.getweight();
		System.out.println("Kova\nZangri\nDiarymilk\nKitkat");
		System.out.println("Total weight of Gift1 is "+totalweight1+"\n");
		System.out.println("Gift2 Items...............");
		System.out.println("Diarymilk\nKitkat\nSweetCandy\nMintCandy");
		System.out.println("Total weight of Gift1 is "+totalweight2+"\n");
		System.out.println("Gifts Based on Sorting");
		if(totalweight1<totalweight2) {
			System.out.println("Gift1  :  "+totalweight1);
			System.out.println("Gift2  :  "+totalweight2);
		}
		else {
			System.out.println("Gift2  :  "+totalweight2);
			System.out.println("Gift1  :  "+totalweight1);
		}
		
	}
}
