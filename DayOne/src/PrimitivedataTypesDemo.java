
public class PrimitivedataTypesDemo {

	public static void main(String[] args) {
		
			//byte takes 1 byte
			byte byteMax = 127;
			byte byteMin = -128;
			
			System.out.println("Min range of byte is" +
					byteMin+"Max range of byte is "+byteMax);
			
			//short - 2 bytes
			short shortMax = 32767;
			short shortMin = -32768;
			System.out.println("Minshort range of byte is" +
					shortMin+"Maxshort range of byte is "+shortMax);
			
			//int - 4bytes
			int maxInt = 2147483647;
			int minInt = -2147483648;
			System.out.println("Minint range of byte is" +
					minInt+"Maxint range of byte is "+maxInt);
			
			//long - 8bytes
			long maxLong = 9223372036854775807L;
			long minLong = -9223372036854775808L;
			
			System.out.println("Minlong range of byte is" +
					minLong+"Maxlong range of byte is "+maxLong);
			
			float f=3234.141243278345f;
			double d=3456.14124512345678902345678914f;
			System.out.println("float value is "+f+" double value is "+d);
			
			//boolean 
			boolean flag=false;
			System.out.println("boolean value is "+flag);
		}
	}


