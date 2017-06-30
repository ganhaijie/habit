 
public class Test {
	public static void main(String[] args) {

		ServiceFactory factory1 = Implemention1.factory;
		Service service1 = factory1.getService();
		service1.method1();

		ServiceFactory factory2 = Implemention2.factory;
		Service service2 = factory2.getService();
		service2.method1();
	}
}
