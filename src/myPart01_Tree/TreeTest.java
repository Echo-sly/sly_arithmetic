package myPart01_Tree;

import java.util.LinkedList;

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
        TreeNode node= BinaryTreeFunction.createBinaryTree(list);

        BinaryTreeFunction.preOrderTraveral(node);
        System.out.println();
        BinaryTreeFunction.inOrderTraveral(node);
        System.out.println();
        BinaryTreeFunction.postOrderTraveral(node);

    }
}
