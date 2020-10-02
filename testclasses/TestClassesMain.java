package testclasses;

public class TestClassesMain {

	public static void main(String[] args) {


		testCase1();
	}
	
	
	public static void testCase1()
	{
		Animal testAnimal = new Animal("animalsname");
		Sheep testSheep = new Sheep("sheepname");
		Bird testBird = new Bird();
		
		//System.out.println(testSheep.getName());

		manipulateAnimal(testSheep);
	}
	
	public static <T extends Animal> void manipulateAnimal( T a )
	{
		System.out.println(a.getClass().getName());


		if ( a instanceof Sheep)
		{
			System.out.println( ( (Sheep) a ).getWool() );
			
			Sheep b = (Sheep) a;
			
			
			System.out.println( b.getWool() );
		}
	}

	
}
