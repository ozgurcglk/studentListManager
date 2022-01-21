package studentOop;

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		
		Student student1 = new Student(1, "Özgür", "Çağlak", 1234);
		Student student2 = new Student(2, "Adem", "Yıldız", 1223);
		Student student3 = new Student(3, "Batuhan", "Pamukçu", 2433);
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		
		Student studentTest = new Student(1, "Boran", "Karabey", 1212);
		System.out.println(studentManager.getAll().size());
		studentManager.delete(1);
		
		System.out.println(studentManager.getAll().size());
		studentManager.update(studentTest,1);

			
	}

}
