package com.MyLeetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Saw96x
 * @date 2020/9/14 - 8:07
 */
public class preorderTraversal_144 {
    //给定一个二叉树，返回它的前序遍历。

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
    public List<Integer> preorderTraversal1(TreeNode root) {
        Traversal(root);
        return list;
    }

    //迭代算法
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                if (node.right != null)
                    stack.push(node.right);

                if (node.left != null)
                    stack.push(node.left);

                stack.pop();
                stack.push(node);
                stack.push(null);
            } else {
                stack.pop();
                node = stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }

    //递归辅助函数
    void Traversal(TreeNode root) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.left != null)
            Traversal(root.left);
        if (root.right != null)
            Traversal(root.right);
    }
}
