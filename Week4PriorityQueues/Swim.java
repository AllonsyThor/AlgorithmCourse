private void swim(int k)
{
	while (k > 1 && less(k/2, k))
	{
		exch(k, k/2);
		k = k/2
	}
}

//parent of node at k is at k/2