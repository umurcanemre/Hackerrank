package leetcodeaprilchallange.week3;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * Input: 11110 
 * 		  11010 
 * 		  11000 
 * 		  00000
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: 11000 
 * 		  11000 
 * 		  00100 
 * 		  00011
 * 
 * Output: 3
 * 
 */
public class W3D3 {
    public static int numIslands(char[][] grid) {
        int result = 0;
    	int no = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == '1') {
					result++;
					no = getNo(result, no);
					paintIslandBlob(grid, i, j, no);
				}
			}
		}
        
    	return result;
    }
    private static int getNo(int result, int oldNo) {
    	if(result ==1 )
    		return 2;
    	oldNo++;
    	if(oldNo > 47 && oldNo < 50) {
    		oldNo = 50;
    	}
    	return oldNo;
    }
    
    private static void paintIslandBlob(char[][] grid, int i, int q, int no) {
    	if( i < 0 || i >= grid.length || q < 0 || q >= grid[i].length)
    		return;
    	
    	if(grid[i][q] == '1') {
    		grid[i][q] = (char)no;
    		paintIslandBlob(grid, i-1, q, no);
    		paintIslandBlob(grid, i+1, q, no);
    		paintIslandBlob(grid, i, q-1, no);
    		paintIslandBlob(grid, i, q+1, no);
    	}
    }
}
