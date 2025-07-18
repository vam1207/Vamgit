/*
Bob Marley is a jamaican singer, he loves to travel around the globe.
He planned to travel N famous places and return to the starting station.
Each place is indicated with numbers from 0 to N-1.
He will start the travel from Place-0.
 
You are given an integer N and cost matrix cost[][],a symmetric matrix, 
where cost[i][j] indiactes cost to travel from place-i to place-j and vice-versa, 
if cost[i][j]=0, indicates no way to travel from place-i to place-j and vice-versa. 

Your task is to help Bob Marley, to find the shortest possible travel plan
to visit every place and returns to starting place-0. 
Finally print the minimum cost to travel accordingly.

Input Format:
-------------
Line-1: An integer N. 
Next N lines: N space separated integers, cost of i to j.

Output Format:
--------------
Print an integer, the minimum cost to travel all the places and return to place-0.


Sample Input-1:
---------------
4
0 10 35 30
10 0 25 16
24 15 0 20
39 24 14 0

Sample Output-1:
----------------
64

Explanation:
------------
Travelling route is: 0 -> 1 -> 3 -> 2 -> 0


Sample Input-2:
---------------
5
0 22 34 33 30
14 0 11 12 31
16 14 0 38 14
38 25 37 0 23
22 37 13 23 0

Sample Output-2:
----------------
86

Explanation:
------------
Travelling route is: 0 -> 1 -> 3 -> 4 -> 2 -> 0


******* Testcases *******
case =1
input =4
0 10 35 30
10 0 25 16
24 15 0 20
39 24 14 0
output =64

case =2
input =5
0 22 34 33 30
14 0 11 12 31
16 14 0 38 14
38 25 37 0 23
22 37 13 23 0
output =86

case =3
input =10
0 16 24 28 29 28 25 14 18 15
16 0 20 13 21 14 17 11 16 30
24 20 0 12 11 30 17 12 22 28
28 13 12 0 11 21 29 13 28 25
29 21 11 11 0 11 18 28 16 19
28 14 30 21 11 0 17 25 14 21
25 17 17 29 18 17 0 21 14 26
14 11 12 13 28 25 21 0 28 16
18 16 22 28 16 14 14 28 0 17
15 30 28 25 19 21 26 16 17 0
output =136

case =4
input =12
0 12 25 29 32 14 35 12 29 32 33 24
24 0 11 18 21 30 17 28 22 17 28 10
24 13 0 40 39 14 30 25 21 16 13 26
13 15 20 0 14 15 40 11 32 10 30 22
38 13 27 40 0 33 26 19 14 26 10 18
11 34 31 11 40 0 39 27 35 21 39 32
25 35 37 32 33 21 0 24 36 10 29 32
24 25 32 15 30 19 40 0 28 31 33 34
27 39 25 29 23 33 38 31 0 24 18 27
31 30 14 24 31 36 14 35 32 0 26 34
13 36 18 30 25 26 11 22 12 21 0 11
23 34 40 10 37 11 37 36 10 17 17 0
output =160

case =5
input =15
0 11 36 19 22 22 18 11 23 28 40 27 30 39 36
35 0 23 37 29 15 37 11 14 29 28 16 19 13 36
21 15 0 23 15 27 13 17 28 34 11 38 11 35 33
28 34 38 0 23 24 23 40 29 27 16 36 19 26 36
40 28 16 30 0 36 22 12 13 27 33 34 34 36 13
11 23 33 34 36 0 16 10 20 24 14 28 16 18 28
12 37 16 19 10 18 0 17 19 38 38 22 21 20 13
34 19 30 14 25 36 32 0 39 30 31 33 30 39 25
21 27 32 23 15 27 24 34 0 24 31 26 31 11 19
32 21 39 23 29 24 14 25 40 0 18 21 39 10 18
21 35 23 23 13 10 20 26 15 15 0 24 22 16 20
27 12 29 29 35 26 31 36 37 15 37 0 11 22 38
29 33 26 29 19 33 36 19 14 20 10 17 0 27 19
27 39 31 28 40 23 18 20 15 28 18 34 22 0 29
19 26 16 15 10 10 12 26 38 23 30 19 21 29 0
output =201

case =6
input =15
0 63 62 93 48 91 36 96 71 17 74 58 62 81 88
69 0 18 54 49 10 42 34 57 73 97 71 77 23 55
67 80 0 79 36 83 20 27 95 88 86 21 18 33 79
52 80 93 0 81 61 46 21 37 33 95 92 48 90 21
65 42 55 75 0 87 52 54 96 32 36 12 78 21 34
58 31 39 69 67 0 71 90 69 41 48 79 42 71 42
35 28 17 72 64 95 0 51 54 29 90 28 47 72 24
84 58 68 89 36 24 27 0 19 32 94 10 47 53 42
79 90 90 25 13 80 74 97 0 36 37 10 40 19 91
54 56 36 31 86 86 63 71 49 0 41 46 71 65 67
18 54 81 83 96 97 81 94 97 21 0 98 86 34 48
40 60 66 85 17 55 76 52 34 51 87 0 25 36 26
42 96 22 92 28 94 78 87 79 10 43 88 0 29 93
38 94 49 51 51 48 95 84 53 50 25 47 50 0 25
98 55 25 26 19 50 25 30 35 57 22 65 22 69 0
output =325

case =7
input =15
0 6 7 0 2 3 6 8 1 5 5 8 7 6 8
6 0 5 6 9 9 3 4 9 6 6 0 7 3 7
6 9 0 3 4 2 4 7 1 8 5 8 0 6 4
4 7 9 0 3 9 0 6 1 2 5 6 8 5 6
3 6 6 8 0 2 8 9 1 4 0 9 3 4 1
2 6 1 5 0 0 0 8 2 0 0 5 6 5 2
6 2 0 1 5 8 0 9 0 1 5 8 7 7 6
9 7 8 2 3 7 1 0 6 0 0 4 4 0 8
7 8 5 8 4 4 2 6 0 9 0 8 3 3 1
6 5 1 1 6 5 1 6 5 0 0 3 1 5 0
4 9 5 2 2 6 0 0 4 0 0 6 7 9 6
4 9 3 1 8 5 0 0 4 4 0 0 5 6 3
0 7 1 3 8 5 4 7 3 4 1 0 0 5 4
8 8 3 4 8 5 0 0 5 2 4 0 2 0 8
0 8 5 5 4 4 6 0 9 4 5 9 7 4 0
output =33

case =8
input =10
0 2 6 4 0 0 2 0 4 3
7 0 0 1 0 9 0 0 1 0
3 5 3 2 0 0 4 6 0 3
2 5 8 0 7 2 4 6 6 2
1 9 2 9 0 7 3 5 2 4
8 1 8 1 7 0 3 5 7 1
4 5 8 8 9 2 0 5 4 1
2 4 0 3 6 0 0 0 1 1
5 6 9 9 0 2 6 1 0 4
3 4 9 0 8 4 0 4 5 0
output =22

*/

import java.util.*;

class TSMP
{
	static int N;
	static Scanner sc=new Scanner(System.in);
	static{
		N=sc.nextInt();
	}
	static int final_path[] = new int[N + 1];
	static boolean visited[] = new boolean[N];

	static int final_res = Integer.MAX_VALUE;
	static void copyToFinal(int curr_path[])
	{
		for (int i = 0; i < N; i++)
			final_path[i] = curr_path[i];
		final_path[N] = curr_path[0];
	}

	static int firstMin(int adj[][], int i)
	{
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < N; k++)
			if (adj[i][k] < min && i != k)
				min = adj[i][k];
		return min;
	}

	static int secondMin(int adj[][], int i)
	{
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int j=0; j<N; j++)
		{
			if (i == j)
				continue;

			if (adj[i][j] <= first)
			{
				second = first;
				first = adj[i][j];
			}
			else if (adj[i][j] <= second && adj[i][j] != first)
				second = adj[i][j];
		}
		return second;
	}

	static void TSPRec(int adj[][], int curr_bound, int curr_weight, int level, int curr_path[])
	{

		if (level == N)
		{

			if (adj[curr_path[level - 1]][curr_path[0]] != 0)
			{

				int curr_res = curr_weight + adj[curr_path[level-1]][curr_path[0]];
	
				if (curr_res < final_res)
				{
					copyToFinal(curr_path);
					final_res = curr_res;
				}
			}
			return;
		}

		for (int i = 0; i < N; i++)
		{
			if (adj[curr_path[level-1]][i] != 0 &&	visited[i] == false)
			{
				int temp = curr_bound;
				curr_weight += adj[curr_path[level - 1]][i];

				if (level==1)
					curr_bound -= ((firstMin(adj, curr_path[level - 1]) +	firstMin(adj, i))/2);
				else
					curr_bound -= ((secondMin(adj, curr_path[level - 1]) + firstMin(adj, i))/2);

				if (curr_bound + curr_weight < final_res)
				{
					curr_path[level] = i;
					visited[i] = true;

					TSPRec(adj, curr_bound, curr_weight, level + 1,
						curr_path);
				}

				curr_weight -= adj[curr_path[level-1]][i];
				curr_bound = temp;

				Arrays.fill(visited,false);
				for (int j = 0; j <= level - 1; j++)
					visited[curr_path[j]] = true;
			}
		}
	}

	static void TSP(int adj[][])
	{
		int curr_path[] = new int[N + 1];

		int curr_bound = 0;
		Arrays.fill(curr_path, -1);
		Arrays.fill(visited, false);

		for (int i = 0; i < N; i++)
			curr_bound += (firstMin(adj, i) + secondMin(adj, i));

		curr_bound = (curr_bound==1)? curr_bound/2 + 1 :	curr_bound/2;

		visited[0] = true;
		curr_path[0] = 0;

		TSPRec(adj, curr_bound, 0, 1, curr_path);
	}
	
	// Driver code
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		N = sc.nextInt();
		int adj[][] = new int[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				adj[i][j] = sc.nextInt();
				
		TSP(adj);

		System.out.printf("%d", final_res);
		/*System.out.printf("Path Taken : ");
		for (int i = 0; i <= N; i++)
		{
			System.out.printf("%d ", final_path[i]);
		}*/
	}
}
