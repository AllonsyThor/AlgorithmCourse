public void deleteMin()
{ root = deleteMin(root); }

private Node deleteMin(Node x)
{
	if (x.left == null) return x.right;
	x.left = deleteMin(x.left);
	x.count = 1 + size(x.left) + size(x.right);
	return x;
}