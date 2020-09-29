package tp2;

public class TP2 {

	public static void main(String[] args) {
		short un = 1;
		byte yo = 2;
		float x = 2.1f;
		float intfl = un + x;
		System.out.println(3 + "Abc");
		Integer objetEntier = 2;

		objetEntier = 3;

		/*
		 * int a = 205; a>>=1; System.out.println(a);
		 
		int a = 10;
		int b = 7;
		int c = 8;

		if (a == 2 | b == 3 || c == 8) {
			System.out.println("ok");
		}

		changevalue(b);
		
	      boolean egal=(3==4);
	        System.out.println(egal);
	        //
	        int a=3,b=4;
	        boolean diff=((a<b)||(a>b));
	        System.out.println(diff);
	        //
	        boolean bool1=(3==4);
	        System.out.println(bool1);
	        //
	        boolean bool2=(3.0==4.0);        
	        System.out.println(bool2);
	        }*/
		
	/*
	int a;
    System.out.println( "Premier = " + (a=10)*2 + ";\t" + "Second = "+ a + ";");
	System.out.println(3*0.1);*/
		
		int n ;
		double y;
		
		n=5;
		y = 2*n+1.5;
		System.out.println("n =" +n);
		System.out.println("x ="+y);
		double z;
		z = n*y +12;
		System.out.println("y = " +z);
		
		char code = 'Z';
		int index = code - 'A';
		System.out.println(index+1);
		
		int n1 = 0;
		int n2 = 0;
		System.out.println("n1 =" + n1 + " n2 " +n2);
		n1=++n2;
		System.out.println("n1 " + n1 + " n2 "+n2);
		
		
		Integer in1 = 47;
		Integer in2 = 47;
		System.out.println("resultat" + (in1 == in2));
		
		
			
			String mys = "blou";
			String mys1 = "blou";
		if(mys == mys1) {
			System.out.println("ouiiii");
		}
	
		
		
		
	
	}
	

	public static void changevalue(int b) {
		b = 7;
	}

}
