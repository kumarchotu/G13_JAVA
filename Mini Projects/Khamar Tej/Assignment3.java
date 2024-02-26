package suretrust_java;

interface school {
	 void bell();
	}
	class Teacher implements school {
	 @Override
	 public void bell() {
	     System.out.println("Teacher class");
	 }
	}
	class students implements school {
	 @Override
	 public void bell() {
	     System.out.println("student class");
	 }
	}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school teacher = new Teacher();
        school students = new students();
        teacher.bell();
        students.bell(); 

	}

}
