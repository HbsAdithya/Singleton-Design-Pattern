package design.pattern.templateMethod;

public class TestTemplateMethod {
	
	static Beverage beverage = null;

	public static void main(String[] args) {
		
		Beverage tea = new Tea();
		tea.prepareRecepie();
		System.out.println("==============================");
		Beverage coffie = new Coffie();
		coffie.prepareRecepie();
	}
}
