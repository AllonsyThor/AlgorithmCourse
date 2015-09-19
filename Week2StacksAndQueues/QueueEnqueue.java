/* save a link to the last node */
Node oldlast = last;

/* create a new node for the end */
Node last = new Node();
last.item = "not";
last.next = null;

/* link the new node to the end of the list */
oldlast.next = last;