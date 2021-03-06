private static int partition(Comparable[] a, int lo, int hi)
{
	int i = lo, j = hi+1;
	while (true)
	{
		while (less(a[++i], a[lo]))
			if (i == hi) break;     //find item on left to swap

		while (less(a[lo], a[--j]))
			if (j == lo) break;		//find item on right to swap

		if (i >= j) break; 			//check if pointers cross
		exch(a, i, j);				//swap
	}

	exch(a, lo, j);					//swap with partitioning item
	return j;						// return index of item now known to be in place
}