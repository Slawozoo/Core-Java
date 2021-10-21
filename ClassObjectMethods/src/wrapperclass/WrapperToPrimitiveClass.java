package wrapperclass;

public class WrapperToPrimitiveClass {

	public static void main(String[] args) {
		Integer object = new Integer(10);
		Float fl = new Float(7.77);
		Boolean bl = new Boolean(true);
		Short sh = new Short((short) (5));
		Long ln = new Long(10);
		Double db = new Double(54564654);
		
		
		 //converting wrapper class to integer type
		int val = object.intValue(); 
		float f = fl.floatValue();
		boolean b = bl.booleanValue();
		long l = ln.longValue();
		double d = db.doubleValue();
		
		
		
		
		

	}

}
