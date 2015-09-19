Node oldfirst = first; /* save a link to the list */

first = new Node(); /* create a new node for the beginning */

first.item = "not";
first.next = oldfirst;  /* set the instance variables in the new node */



inner class
private class Node
{
	String item;
	Node next;
}