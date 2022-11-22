package OuterClass;

public class OuterClass {
	private int outVar = 10;
	private static int outStaticVar = 20;

	class InnerClass {
		public void printIofo() {
			System.out.println("outVar = " + outVar);
			System.out.println("outStaticVar = " + outStaticVar);
		}
	}

}
