/* "foreach" statement (shorthand) */
for (String s : stack)
	StdOut.println(s);


/* equivalent code (longhand) */
Iterator<String> i = stack.iterator();
while (i.hasNext())
{
	String s = i.next();
	StdOut.println(s);
}