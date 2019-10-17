package classewrappers;

import java.util.ArrayList;
import java.util.List;

public class ClasseWrappers {

	public static void main(String[] args) {

		Integer iRef = Integer.valueOf(10);
		System.out.println(iRef.intValue());
		
		Double dRef = Double.valueOf(10.1);
		System.out.println(dRef.doubleValue());
		
		Float fRef = Float.valueOf(20.2f);
		System.out.println(fRef.floatValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number nRef = Integer.valueOf(30);
		System.out.println(nRef.intValue());
		
		List<Number> lista = new ArrayList<>();
		lista.add(40);
		lista.add(50.5);
		System.out.println(lista);
		

	}

}
