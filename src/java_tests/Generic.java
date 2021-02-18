package java_tests;

public class Generic {

	public <E, F> E genericMethod(E e, F f)
	{
		System.out.println("E parameter is: " + e);
		System.out.println("F parameter is: " + f);
		return e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double e = 1.01;
		float f = 5.0f;
		Generic g = new Generic();
		double h = g.genericMethod(e, f)*f;
		System.out.println("h = " + h);
	}
}
