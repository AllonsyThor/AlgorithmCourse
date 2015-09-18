public class FixedCapacityStackOfStrings
{
	private String[] s;
	private int N = 0;

	public FixedCapacityStackOfStrings(int capacity)
	{ s = new String[capacity]; }

	public boolean isEmpty()
	{ return N == 0; }

	public void push(String item)
	{ s[N++] = item; }
	/* use to inded into array; then increment N */

	public String pop()
	{ return s[--N]; }
	/* decrement N; then use to index into array */
}