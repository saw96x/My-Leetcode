package com.MyLeetCode;

import java.util.*;

/**
 * @author Saw96x
 * @date 2020/9/14 - 8:14
 */
public class postorderTraversal_145 {
    //给定一个二叉树，返回它的后序遍历。
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> list = new ArrayList<>();

    //递归算法
    List<Integer> postorderTraversal1(TreeNode root) {
        Traversal(root);
        return list;
    }

    //迭代算法
    List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                stack.push(node);                          // 中
                stack.push(null);

                if (node.right != null)
                    stack.push(node.right);  // 右

                if (node.left != null)
                    stack.push(node.left);    // 左

            } else {
                stack.pop();
                node = stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }


    //递归辅助函数
    private void Traversal(TreeNode root) {
        if (root == null)
            return;
        Traversal(root.left);
        Traversal(root.right);
        list.add(root.val);
    }
}
