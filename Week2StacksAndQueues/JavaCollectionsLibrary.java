public interface List<Item> implements Iterable<Item>

List()							/* create an empty list */

boolean isEmpty()				/* is the list empty? */

int size()						/* number of items */

void add(Item item)				/* append item to the end */

Item get(int index)				/* return item at given index */ 

Item remove(int index)			/* return & delete item at given index */

boolean contains(Item item)		/* does the list contain the given item? */

Iterator<Item> iterator()		/* interator overa all items in the list */