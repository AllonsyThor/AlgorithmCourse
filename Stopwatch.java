public class Stopwatch
	Stopwatch() /* create a new stopwatch */

	double elapsedTime() /* time since creation (in seconds) */



	public static void main(String[] args)
	{
		int[] a = In.readInts(args[0]);
		Stopwatch stopwatch = new Stopwatch();
		StdOut.println(ThreeSume.count(a));
		double time = stopwatch.elapsedTime();
	}
