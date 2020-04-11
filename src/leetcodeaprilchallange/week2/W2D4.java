package leetcodeaprilchallange.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

/**
 *  Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *  
 *  Example:
 *  Given a binary tree
 *  
 *            1
 *           / \
 *          2   3
 *         / \     
 *        4   5    
 *  
 *  Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *  
 *  Note: The length of path between two nodes is represented by the number of edges between them. 
 *
 */
public class W2D4 {
	private static Map<TreeNode,Integer[]> nodeChildDepth = new HashMap<>();
	private static final int L = 0;
	private static final int R = 1;
	public static int diameterOfBinaryTree(TreeNode root) {
		nodeChildDepth.clear();
        calculateChildDepths(root);
		
		return getMaxPath();
    }
	
	private static int getMaxPath() {
		int max = 0;
		for(Map.Entry<TreeNode, Integer[]> e : nodeChildDepth.entrySet()) {
			int nodeMax = e.getValue()[L] + e.getValue()[R];
			max = nodeMax > max ? nodeMax : max; 
		}
		return max;
	}
	
	private static void calculateChildDepths(TreeNode root) {
		if(root ==null) {
			return;
		}

		calculateChildDepths(root.left);
		calculateChildDepths(root.right);
		
		Integer [] depths = new Integer[2];
		depths[L] = root.left != null ? Integer.max(nodeChildDepth.get(root.left)[L], nodeChildDepth.get(root.left)[R]) +1 : 0;
		depths[R] = root.right != null ? Integer.max(nodeChildDepth.get(root.right)[L], nodeChildDepth.get(root.right)[R]) +1 : 0;
		nodeChildDepth.put(root, depths);
	}
	

	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	    @Override
	    public String toString() {
	    	String res =String.valueOf(val);
	    	if(left != null)
	    		res +=  " - l:" + left.val ;
	    	if(right != null)
	    		res += " r:" + right.val;
	    	return res;
	    }
	}
	
	public static void runTests() {
		test1();
		test2();
		test3();
	}
	private static void test1() {

		TreeNode root = new TreeNode(1);
		TreeNode rNode = new TreeNode(3);
		root.right = rNode;
		TreeNode lRoot = new TreeNode(2);
		root.left = lRoot;
		TreeNode lmNode = new TreeNode(4);
		TreeNode lrNode = new TreeNode(5);
		lRoot.left = lmNode;
		lRoot.left = lrNode;
		
		assertEquals(3, diameterOfBinaryTree(root));
	}
	private static void test2() {

		TreeNode root0 = new TreeNode(0);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root6 = new TreeNode(6);
		TreeNode root7 = new TreeNode(7);
		TreeNode root8 = new TreeNode(8);

		root0.right = root1;
		root0.left = root2;

		root2.right = root4;
		root2.right.right = root6;
		root2.right.right.right = root8;

		root2.left = root3;
		root2.left.left = root5;
		root2.left.left.left = root7;
		
		assertEquals(6, diameterOfBinaryTree(root0));
	}
	private static void test3() {

		TreeNode root0 = new TreeNode(0);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root6 = new TreeNode(6);
		TreeNode root7 = new TreeNode(7);
		TreeNode root8 = new TreeNode(8);

		root0.right = root1;
		root1.right = root2;
		root2.right = root3;
		root3.right = root4;
		root4.right = root5;
		root5.right = root6;
		root6.right = root7;
		root7.right = root8;
		
		assertEquals(8, diameterOfBinaryTree(root0));
	}
}
