public class FixedCapacityStack<Item>
{
	private Item[] s;
	private int N = 0;

	public FixedCapacityStack(int capacity)
	{ s = (Item[]) new Object[capacity]; }
	/* the ugly cast, since Java does not allow generic array creation */

	public boolean isEmpty()
	{ return N == 0; }

	public void push(Item item)
	{ s[N++] = item; }

	public Item pop()
	{ return s[--N]; }
}