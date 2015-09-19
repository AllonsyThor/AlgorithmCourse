public interface Iterator<Item>
{
	boolean hasNext();
	Item next();
	/* void remove(); option, use at your own risk */
}