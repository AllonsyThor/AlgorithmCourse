MinPQ<Transaction> pq = new MinPQ<Transaction>();

while (StdIn.hasNextLine())
{
	String line = StdIn.readLine();
	Transaction item = new Transation(line);
	pq.insert(item);
	if (pq.size() > M)
		pq.delMin();
}