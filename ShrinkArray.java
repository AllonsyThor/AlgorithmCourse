public String pop()
{
	String item = s[--N];
	s[N] = null;
	if (N > 0 && N == s.length/4) resize(s.length/2);
	return item;
}