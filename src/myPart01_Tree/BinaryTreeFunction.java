package myPart01_Tree;

import java.util.LinkedList;

/**
 * Demo BinaryTreeFunction
 *
 * @author sunlianyu
 * @date 2021/9/8 15:58
 */
public class BinaryTreeFunction {
    /**
     * 创建二叉树
     * 前序法创建二叉树
     *
     * @param list 输入序列
     * @return TreeNode
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> list) {

        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    /**
     * 前序遍历二叉树
     *
     * @param node
     */
    public static void preOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    /**
     * 中序遍历二叉树
     *
     */
    public static void inOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrderTraveral(node.leftChild);
        System.out.print(node.data + " ");
        preOrderTraveral(node.rightChild);
    }

    /**
     * 后序遍历二叉树
     *
     */
    public static void postOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }

        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
        System.out.print(node.data + " ");
    }

}
