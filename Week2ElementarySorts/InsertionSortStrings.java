 public class StringSorter
 {
 	public static void main(String[] args)
 	{
 		String[] a = In.readStrings(args[0]);
 		Insertion.sort(a);
 		for (int i = 0; i < N; i++)
 			StdOut.println(a[i]);
 	}
 }