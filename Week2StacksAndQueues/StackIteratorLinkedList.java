import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>
{
	...

	public Iterator<Item> iterator() { return new ListIterator(); }

	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;

		public boolean hasNext() {return current != null; }
		public void remove() { /*not supported, throw UnsupportedOperationException */}
		public Item next() {/* throw NoSuchElementException if no more items in iteration */}
		{
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}