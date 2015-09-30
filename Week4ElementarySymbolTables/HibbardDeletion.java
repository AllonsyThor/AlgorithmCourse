public void delete(Key key)
{ root = delete(root, key); }

private Node delete(Node x, Key key) {
	if (x == null) return null;
	int cmp = key.compareTo(x.key);
	if      (cmp < 0) x.left = delete(x.left, key);  //search for key
	else if (cmp > 0) x.right = delete(x.right, key);
	else {
		if (x.right == null) return x.left; //no right child
		if (x.left == null) return x.right; // no left child

		Node t = x;
		x = min(t.right);
		x.right = deleteMin(t.right);  //replace with successor
		x.left = t.left;
	}
	x.count - size(x.left) + size(x.right) + 1; //update subtree counts
	return x;
}