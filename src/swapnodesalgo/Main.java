package swapnodesalgo;

public class Main {

	public static void main(String[] args) {
		int[][] req = new int[][] {{2,3},{4,-1},{5,-1},{6,-1},{7,8},{-1,9},{-1,-1},{10,11},{-1,-1},{-1,-1},{-1,-1}};
		int[] queires = new int[] {1,1};
		
		int[][] sol = Solution2.swapNodes(req, queires);

		
		
	}

}
