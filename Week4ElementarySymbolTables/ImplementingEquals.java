public final class Date implements Comparable<Date> //typically unsafe to use equals() with inheritance (would violate symmetry)
{
	private final int month;
	private final int day;
	private final int year;
	...

	public boolean equals(Object y)	
	{
		if (y == this) return true; // optimize for true object equality
		if (y == null) return false; //check for null
		if (y.getClass () != this.getClass()) //objects must be in same class
			return false;

		Date that = (Date) y; //cast is guranteed to succeed
		if (this.day  != that.day ) return false;
		if (this.month != that.month ) return false;
		if (this.year != that.year ) return false;  //check that all significant fields are the same
		return true;
	}

}