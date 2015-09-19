int count = 0;
for (int i = 0; i < N; i++)
	for (int j = i+1; j < N; j++)
		if (a[i] + a[j] == 0)
			count++;