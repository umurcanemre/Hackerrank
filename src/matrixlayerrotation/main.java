package matrixlayerrotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		//https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
		List<List<Integer>> matrix = Arrays.asList(
				new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19)), 
				new ArrayList<Integer>(Arrays.asList(21,22,23,24,25,26,27,28,29)), 
				new ArrayList<Integer>(Arrays.asList(31,32,33,34,35,36,37,38,39)), 
				new ArrayList<Integer>(Arrays.asList(41,42,43,44,45,46,47,48,49)),
				new ArrayList<Integer>(Arrays.asList(51,52,53,54,55,56,57,58,59)),
				new ArrayList<Integer>(Arrays.asList(61,62,63,64,65,66,67,68,69))				
				);
		
		Solution.matrixRotation(matrix, 3);

	}

}
