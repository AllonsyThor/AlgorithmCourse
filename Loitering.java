/* loitering */

public String pop()
{ return s[--N]; }


/*this version avoids "loitering": garbage collector can reclaim memory only if no outstanding references */

public String pop()
{
	String item = s[--N];
	s[N] = null;
	return item;
}
