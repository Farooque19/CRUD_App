package Minor_Project;

public interface TeacherDaoInterface {
	public void createteacher(Teacher t);
	public void showAllTeacher();
	public void showTeacherBasedOnId(int id);
	public void updateTeacher(int id, String name);
	public void deleteTeacher(int id);
}
