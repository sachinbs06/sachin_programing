package sdbms;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

class StudentManagementSystemImpl implements StudentManagementSystem {

	Scanner scan = new Scanner(System.in);
	LinkedHashMap <Integer, Student> db = new LinkedHashMap<Integer, Student>();
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter Id, Name, Age and Marks:");
		int id = scan.nextInt();
		String name = scan.next();
		int age = scan.nextInt();
		double marks = scan.nextDouble();

		//db.put(id, new Student(id, name, age, marks));
		Student std = new Student(id,name, age, marks);
		db.put(id, std); // db.put(std.getId(), std);
		System.out.println("Student Record Inserted Successfully");
	}

	@Override
	public void removeStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter student Id:");
		int id =scan.nextInt();//

		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Student Record Deleted");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Data Not Found!");
			}

			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAllStudent() {
		// TODO Auto-generated method stub
		db.clear();
		System.out.println("All the Students Records Deleted");

	}

	@Override
	public void displayStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter student id:");
		int id = scan.nextInt();

		if(db.containsKey(id)) {
			Student std = db.get(id);
			System.out.println("Id:"+std.getId());
			System.out.println("Age:"+std.getAge());
			System.out.println("Name:"+std.getName());
			System.out.println("Marks:"+std.getMarks());
		}
		else {
			try {
				throw new StudentNotFoundException("Student data not found!");
			}
			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void displayAllStudent() {
		// TODO Auto-generated method stub
		Set<Integer> setOfKeys= db.keySet(); // creating a set of student id's
		for(int id : setOfKeys) {
			System.out.println(db.get(id));
		}

	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Id:");
		int id=scan.nextInt();

		if(db.containsKey(id)) {
			Student s = db.get(id);
			System.out.println("1:Update Age\n2:Update Name\n3:Update Marks");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Age:");
				int age = scan.nextInt();
				s.setAge(age);
				break;

			case 2:
				System.out.println("Enter Name:");
				String name = scan.next();
				s.setName(name);
				break;

			case 3:
				System.out.println("Enter Marks");
				double marks = scan.nextDouble();
				s.setMarks(marks);
				break;

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Student Data Update Successfully");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Data Not Found!!");
			}
			catch(StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void countStudents() {
		// TODO Auto-generated method stub
		System.out.println("No Of Student Records Present:"+db.size());

	}

	@Override
	public void sortStudents() {
		// TODO Auto-generated method stub

	}

}

