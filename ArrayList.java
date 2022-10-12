package ensurecapacitydemo;

import java.util.*;
class Main{
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("asd");
		a1.add("xyz");
		a1.add(10);
		for(Object a:a1)
		    System.out.println(a);
		    
		a1.add(0,"wer");    
		for(Object a:a1)
		    System.out.println(a);
	}
}
