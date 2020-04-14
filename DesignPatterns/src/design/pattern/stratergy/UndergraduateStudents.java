package design.pattern.stratergy;

public class UndergraduateStudents extends Students{
	
	public UndergraduateStudents() {
		iPrograms = new BScPrograms();
		iFestival = new CodeFest();
	}

	@Override
	public void displayStudents() {
		System.out.println("Display under gratuate students");
	}
}
