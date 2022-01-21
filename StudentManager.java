package studentOop;
import java.util.List;
import java.util.ArrayList;

public class StudentManager extends Student{
	
	ArrayList<Student> students = new ArrayList<Student>();

	public StudentManager() {
		super();
	}
	

	public void add(Student addedStudent) {
		if(students.contains(addedStudent)) {
			System.out.println("This student already exists !");
			return;
		}	
		this.students.add(addedStudent);
		System.out.println("Student " + addedStudent.getId() + " has been successfully added !");
	}	

	public void delete(int id) {
		Student studentDeleted = new Student();
		for (Student student : students) {
			if(student.getId() == id) {
				studentDeleted = student;
			}
		}
		students.remove(studentDeleted);
		System.out.println("Student " + studentDeleted.getId() + " has been successfully deleted !");
	}
	
	public void update(Student studentUpdated, int id) {
			for (Student student : students) {
				if (id == studentUpdated.getId()) {
					studentUpdated = student;
			}
		}
		System.out.println("Student " + id + " has been successfully updated !");
	}
	
	public ArrayList<Student> getAll(){
		return this.students;
	}
}
