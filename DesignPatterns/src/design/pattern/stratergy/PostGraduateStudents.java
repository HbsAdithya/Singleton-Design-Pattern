package design.pattern.stratergy;

public class PostGraduateStudents extends Students{

	public PostGraduateStudents() {
		iPrograms = new DoctoralPrograms();
		iFestival = new RoboFest();
	}
	
	@Override
	public void displayStudents() {
		System.out.println("Display Post gratuate students");
	}

}
