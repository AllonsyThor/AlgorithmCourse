private class Node
{
	private Key key;
	private Value val;
	private Node left;
	private Node right;
	private int count; //number of nodes in subtree
}

public int size()
{ return size(root); }

private int size(Node x)
{
	if (x == null) return 0; //ok to call when x is null
	return x.count;
} 

private Node put(Node x, Key key, Value val)
{
	if (x == null) return new Node(key, val, 1);
	int cmp = key.compareTo(x.key);
	if      (cmp < 0) x.left = put(x.left, key, val);
	else if (cmp > 0) x.right = put(x.right, key, val);
	else              x.val = val;
	x.count = 1 + size(x.left) + size(x.right);
	return x;
}