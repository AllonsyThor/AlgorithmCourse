private void sink(int k)
{
	while (2*k <= N)
	{
		int j = 2*k;
		if (j < N && less(j, j+1)) j++;
		if (!less(k, j)) break;
		exch(k, j);
		k = j;
	}
}