public void insert(Key x)
{
	pq[N++] = x;
	swim(N);  
}