package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistis {

	String name;
	int a;
	int b;
	
	
	Arraylistis(String nameis,int c,int d){
		
		this.name=nameis;
		this.a=c;
		this.b=d;
	}

	public static void main(String[] args) {
		
		
		
		Arraylistis ar1=new Arraylistis("jai",1,2);
 
		Arraylistis ar2=new Arraylistis("jai1",3,4);
		
		Arraylistis ar3=new Arraylistis("jai2",5,6);
		
		
		ArrayList<Arraylistis> ar=new ArrayList<Arraylistis>();
		ar.add(ar1);
		ar.add(ar2);
		ar.add(ar3);
		
		Iterator<Arraylistis> it=ar.iterator();
		
		while(it.hasNext()) {
			
			Arraylistis al=	it.next();
			
			System.out.println(al.a);
			System.out.println(al.b);
			System.out.println(al.name);

		String s="hdins343d@#$";
		System.out.println(s);
		String s1=s.replace("343","");
		System.out.println(s1);
		}
		
	}

}
