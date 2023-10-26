
public class TypeCastingDemo {

	public static void main(String[] args) {
	//widening type casting/implicit type casting
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.45f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int no=ch;
		System.out.println(no);
		
		char var1='\u00A7';
		long l=var1;
		System.out.println(l);
		
		char var2='\u00A7';
		int l1=var2;
		System.out.println(l1);
		
		//narrowing//Explicit type casting 
		double d1=68957937579.777d;
		long l2=(long)d1;
		float f3=(float)d1;
		System.out.println(l2);
		System.out.println(f3);
		
		long l4=576876899;
		byte b2=(byte)l4;
		int i6=(int)l4;
		System.out.println(b2);
		System.out.println(i6);
		
		
		
	}

}
