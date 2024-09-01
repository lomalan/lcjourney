package trees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstructBTree {

    private Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    private int preorderIndex = 0;
    
    public TreeNode buildTreeOptimal(int[] preorder, int[] inorder) {
        // Phase 1. Populating inorder map
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        // Phase 2. Build tree
        return build(preorder, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        var rootValue = preorder[preorderIndex++];
        var mid = inorderIndexMap.get(rootValue);
        var root = new TreeNode(rootValue);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) {
            return null;
        }
        var rootVal = preorder[0];
        var mid = findMidIndex(inorder, rootVal);
        var root = new TreeNode(rootVal);
        root.left = buildTree(
            Arrays.copyOfRange(preorder, 1, mid + 1), 
            Arrays.copyOfRange(inorder, 0, mid)
        );
        root.right = buildTree(
            Arrays.copyOfRange(preorder, mid + 1, preorder.length), 
            Arrays.copyOfRange(inorder, mid + 1, inorder.length)
        );
        return root;   
    }

    private int findMidIndex(int[] inorder, int rootVal) {
        for(int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                return i;
            }
        }
        return 0;
    }
}
