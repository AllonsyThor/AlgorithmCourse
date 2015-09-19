inner class

private class Node
{
	String item;
	Node next;
}


String item = first.item; /* save item to return */

first = first.next; /* delete first node */

return item; /* return saved item */