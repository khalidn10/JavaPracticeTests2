package java_tests;

public class ChildClass extends ParentClass {

	ParentClass p = new ParentClass();
	
	public ChildClass()
	{
		//super();
		System.out.println("Child constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c = new ChildClass();
		System.out.println("Done processing");
		
		ParentClass pc = c.p;
	}

}
