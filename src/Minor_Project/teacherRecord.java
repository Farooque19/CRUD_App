package Minor_Project;

import java.util.Scanner;
public class teacherRecord {

	public static void main(String[] args) {
		TeacherDaoInterface dao = new TeacherDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Teacher Management Application:");
		do {
			System.out.println("1. Add Teacher");
			System.out.println("2. Show All Teacher");
			System.out.println("3. Show Teacher based on course");
			System.out.println("4. Update the Teacher name");
			System.out.println("5. Delete the Teacher");
			System.out.println("6. Exit");
			System.out.println("Enter choice:");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				Teacher t = new Teacher();
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				System.out.println("Enter Name:");
				String Name = sc.next();
				System.out.println("Enter Salary:");
				double sal = sc.nextDouble();
				System.out.println("Enter Course:");
				String course = sc.next();
				System.out.println("Enter Age");
				int age = sc.nextInt();
				System.out.println("Enter Gender:");
				String gender = sc.next();
				t.setId(id);
				t.setName(Name);
				t.setSalary(sal);
				t.setCourse(course);
				t.setAge(age);
				t.setGender(gender);
				dao.createteacher(t);
				break;
				
			case 2:
				dao.showAllTeacher();
				break;
				
			case 3:
				System.out.println("Enter id to show the details:");
				int tid = sc.nextInt();
				dao.showTeacherBasedOnId(tid);
				break;
				
			case 4:
				System.out.println("Enter id to update the details:");
				int Id = sc.nextInt();
				System.out.println("Enter the new name:");
				String name  = sc.next();
				dao.updateTeacher(Id, name);
				break;
				
			case 5:
				System.out.println("Enter Teacher id to be deleted:");
				int I_d = sc.nextInt();
				dao.deleteTeacher(I_d);
				break;
				
			case 6:
				System.out.println("Thank you!!");
				System.exit(0);
			default:
				System.out.println("Wrong choice entered!!");
				break;
			}
		}while(true);
	}

}
