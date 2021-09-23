package myPart01_Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Demo TreeTest
 *
 * @author sunlianyu
 * @date 2021/9/8 16:04
 */
public class TreeTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        TreeNode node = BinaryTreeFunction.createBinaryTree(list);

        BinaryTreeFunction.preOrderTraveral(node);
        System.out.println();
        BinaryTreeFunction.inOrderTraveral(node);
        System.out.println();
        BinaryTreeFunction.postOrderTraveral(node);
        System.out.println("\n---------------------\n\n");

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.leftChild = node2;
        node1.rightChild = node3;
        BinaryTreeFunction.preOrderTraveral(node1);
        System.out.println();
        BinaryTreeFunction.inOrderTraveral(node1);
        System.out.println();
        BinaryTreeFunction.postOrderTraveral(node1);
        System.out.println("\n---------------------\n\n\n");

        Integer[] arr = {1, 2, 4, null, null, 5, null, null, 3, 6, null, null, 7, null, null};
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(arr));
        System.out.println(list1);

        TreeNode myNode = BinaryTreeFunction.createBinaryTree(list1);

        BinaryTreeFunction.preOrderTraveral(myNode);
        System.out.println();
        BinaryTreeFunction.inOrderTraveral(myNode);

        System.out.println();
        BinaryTreeFunction.postOrderTraveral(myNode);

        System.out.println();
        BinaryTreeFunction.levelOrderTraveral(myNode);

    }
}
