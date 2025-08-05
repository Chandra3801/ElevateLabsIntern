package elevateIntern;

import java.util.*;

class Student {
	int id;
	String name;
	double marks;

	Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
	}
}

public class StudentRecordSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();

		while (true) {
			System.out.println("\n1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Marks: ");
				double marks = sc.nextDouble();
				students.add(new Student(id, name, marks));
				System.out.println("Student added.");
			} else if (choice == 2) {
				for (Student s : students) {
					System.out.println(s);
				}
				if (students.isEmpty())
					System.out.println("No students found.");
			} else if (choice == 3) {
				System.out.print("Enter ID to update: ");
				int id = sc.nextInt();
				sc.nextLine();
				boolean found = false;
				for (Student s : students) {
					if (s.id == id) {
						System.out.print("Enter new name: ");
						s.name = sc.nextLine();
						System.out.print("Enter new marks: ");
						s.marks = sc.nextDouble();
						System.out.println("Student updated.");
						found = true;
						break;
					}
				}
				if (!found)
					System.out.println("Student not found.");
			} else if (choice == 4) {
				System.out.print("Enter ID to delete: ");
				int id = sc.nextInt();
				boolean removed = false;
				for (int i = 0; i < students.size(); i++) {
					if (students.get(i).id == id) {
						students.remove(i);
						System.out.println("Student deleted.");
						removed = true;
						break;
					}
				}
				if (!removed)
					System.out.println("Student not found.");
			} else if (choice == 5) {
				System.out.println("Goodbye!");
				break;
			} else {
				System.out.println("Invalid choice.");
			}
		}
		sc.close();
	}
}
