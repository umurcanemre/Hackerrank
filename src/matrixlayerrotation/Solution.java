package matrixlayerrotation;

import java.util.List;

public class Solution {
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		int laneCount = matrix.size() < matrix.get(0).size() ? matrix.size() / 2 : matrix.get(0).size() / 2;
		printMAtrix(matrix);
		for (int i = 0; i < r; i++) {
			for (int lane = 0; lane < laneCount; lane++) {
				rotateLaneOnce(matrix, lane);
				printMAtrix(matrix);
			}
		}
	}

	private static void rotateLaneOnce(List<List<Integer>> matrix, final int lane) {
		final int sizeX = matrix.get(0).size();
		final int sizeY = matrix.size();

		int keepValHor = matrix.get(lane).get(lane);
		for (int i = lane; i < sizeX - (lane + 1); i++) {
			matrix.get(lane).set(i, matrix.get(lane).get(i+1));
		}
printMAtrix(matrix);
		int keepValVert = matrix.get(sizeY - (lane + 1)).get(lane);
		for (int i = sizeY - (lane + 1); i > lane + 1; i--) {
			matrix.get(i).set(lane, matrix.get(i - 1).get(lane));
		}
		matrix.get(lane + 1).set(lane, keepValHor);

printMAtrix(matrix);
		keepValHor = matrix.get(sizeY - (lane + 1)).get(sizeX - (lane + 1));
		for (int i = sizeX - (lane + 2); i > lane ; i--) {
			matrix.get(sizeY - (lane + 1)).set(i+ 1, matrix.get(sizeY - (lane + 1)).get(i ));
		}
		matrix.get(sizeY - (lane + 1)).set(lane + 1, keepValVert);

printMAtrix(matrix);
		for (int i = lane; i < sizeY - (lane + 2); i++) {
			matrix.get(i).set(sizeX - (lane + 1), matrix.get(i + 1).get(sizeX - (lane + 1)));
		}
		matrix.get(sizeY - (lane + 2)).set(sizeX - (lane + 1), keepValHor);
		printMAtrix(matrix);
	}
	
	private static void printMAtrix(List<List<Integer>> m) {
		for(List<Integer> list : m)
			System.out.println(list);
		System.out.println("----");
	}
}
