public final class Vector {						//can't override instance methods
	private final int N;
	private final	double[] data;				//all instance variables private & final

	public Vector(double[] data) {
		this.N = data.length;
		this.data = new double[N];
		for (int i = 0; i < N; i++)  			// defensive copy of mutable instance variables
			this.data[i] = data[i];
	}

	// instance methods don't change instance variables
}