package com.MyLeetCode;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * @author Saw96x
 * @date 2020/9/11 - 7:55
 */
public class inorderTraversal_94 {
    //给定一个二叉树，返回它的中序 遍历。

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
    public List<Integer> inorderTraversal1(TreeNode root) {
        Traversal(root);
        return list;
    }

    //迭代算法
    public List<Integer> inorderTraversal2(TreeNode root) {
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

                stack.push(node);
                stack.push(null);

                if (node.left != null)
                    stack.push(node.left);
            } else {
                stack.pop();
                node = stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }


    //递归辅助函数
    public void Traversal(TreeNode root) {
        if (root != null) {
            Traversal(root.left);
            list.add(root.val);
            Traversal(root.right);
        }
    }
}
