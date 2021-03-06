public class Student
{
	public static final Comparator<Student> BY_NAME = new ByName();
	public static final Comparator<Student> BY_SECTION = new BySection();
	private final String name;
	private final int section;

	...

	private static class ByName implements Comparator<Student>
	{
		public int compare(Student v, Student w)
		{return v.name.compareTo(w.name); }
	}

	private static class BySection implements Comparator<Student>
	{
		public int compare(Student v, Student w)
		{ return v.section - w.section; }  //this technique works here since no danger of overflow
	}
}

//one Comparator for the class (static)