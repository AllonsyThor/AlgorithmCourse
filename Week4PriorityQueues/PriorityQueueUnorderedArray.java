public class UnorderedMaxPQ<Key extends Comparable<Key>>
{
	private Key[] pq;   //pg[i] = ith element on pq
	private int N;      // number of elements on pq

	public UnorderedMaxPQ(int capacity)
	{ pq = (Key[]) new Comparable[capacity]; } //no generic array creation

	public boolean isEmpty()
	{return N == 0; }

	public void insert(Key x)
	{ pq[N++] = x; }

	public Key delMax()
	{
		int max = 0;
		for (int i = 1; i < N; i++)
			if (less(max, i)) max = i;
		exch(max, N-1);
		return pq[--N];  //null out entry to prevent loitering
	}
}

//less() & exch() similiar to sorting methods