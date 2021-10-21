package wrapperclass;

public class PrimitiveToWrapperClass {

	public static void main(String[] args) {
		byte b = 10;  
		short s = 20;  
		int i = 30;  
		long l = 40;  
		float f = 50.0F;  
		double d = 60.0D;  
		char c = 'a';  
		boolean b2 = true;  
		  
		//Autoboxing: Converting primitives into objects  
		Byte byteobj = b;  
		Short shortobj = s;  
		Integer intobj = i;  
		Long longobj = l;  
		Float floatobj = f;  
		Double doubleobj = d;  
		Character charobj = c;  
		Boolean boolobj = b2;  
		
		Integer intObj = Integer.valueOf(i);
		// xxxValue() method
		byte bt = intObj.byteValue();
		int in = shortobj.intValue();
		
		//compareTo() method
		System.out.println(intObj.compareTo(intobj));	//equals
		System.out.println(intObj.compareTo(20));	//less tha 30
		System.out.println(intObj.compareTo(35));	//greater than 30
		
		

	}

}
