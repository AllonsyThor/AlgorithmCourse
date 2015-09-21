public class Shell
{
	public static void sort(Comparable[] a)
	{
		int N = a.length;

		int h-1;
		while (h < N/3) h - 3*h +1; /* 3x+1 sequence */

		while (h >= 1)
		{ /* h-sort the array */
			for (int i = h; i < N; i++) /* insertion sort */
			{
				for (int j = i; j >= h && less(a[j], a[j-h]) j -= h);
				exch(a, j, j-h); 
			}

			h = h/3; /*move to next increment */
		}
	}

	private static boolean less(Comparable v, Comparable w)
	{ /* as before */}

	private static void exch(Comparable[] a, int i, int j)
	{/* as before */}
}