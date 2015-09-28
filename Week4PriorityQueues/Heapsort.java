public class Heap
{
	public static void sort(Comparable[] pq)
	{
		int N = pq.length;
		for (int k = N/2; k >= 1; k--)
		sink(a, k, N);

		while (N > 1)
		{
			exch(a, 1, N--);
			sink(a, 1, N);
		}
	}

	private void sink(Comparable[], int k, int N)
	{ /* as before */ }

	private static boolean less(Comparable[] pq, int i, int j)
	{ /* as before, but convert from 1-based indexing to 0-base indexing */ }

	private static void exch(Comparable[] pq, int i, int j)
	{ /* as before, but convert from 1-based indexing to 0-base indexing */ }

}

