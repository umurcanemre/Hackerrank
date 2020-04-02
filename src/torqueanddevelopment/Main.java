package torqueanddevelopment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	//public static void main(String[] args) {
	//	//www.hackerrank.com/challenges/torque-and-development/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=graphs
	//       int[][] roads = new int[][]{new int[]{1,2},new int[]{3,1},new int[]{2,3}};
	//        System.out.println(Solution.roadsAndLibraries(3, 2, 1, roads));
	//        
	//        
	//        roads = new int[][]{new int[]{1,3},new int[]{3,4},new int[]{2,4},new int[]{1,2},new int[]{2,3},new int[]{5,6}};
	//        System.out.println(Solution.roadsAndLibraries(6, 2, 5, roads));
	//        
	//        
	//        roads = new int[][]{new int[]{1,2},new int[]{1,3},new int[]{1,4}};
	//        System.out.println(Solution.roadsAndLibraries(5, 6, 1, roads));
    //
	//}

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = Solution.roadsAndLibraries(n, c_lib, c_road, cities);

            System.out.println(String.valueOf(result));
            
        }


        scanner.close();
    }}
