public class MaxPQ<Key extends Comparable<Key>>
{
	private Key[] pq;
	private int N;

	public MaxPQ(int capacity)
	{ pq = (Key[]) new Comparable[capacity+1]; }

	public boolean isEmpty()
	{ return N == 0; }
	public void insert(Key key)
	public Key delMax()
	{
		Key max = pq[1];
		exch(1, N--);
		sink(1);
		pq[N+1] = null; 
		return max;
	}

	private boolean less(int i, int j)
	{ return pq[i].compareTo(pq[j]) < 0; }
	private void exch(int i, int j)
	{ Key t = pq[i]; pq[i] = pq[j]; pq[j] = t; }
}