package lab11.prob1;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> studentsMap = new HashMap<>();
		for (Student student : students) {
			Key studentKey = new Key(student.getFirstName(), student.getLastName());
			studentsMap.put(studentKey, student);
		}

		return studentsMap;
	}
}
