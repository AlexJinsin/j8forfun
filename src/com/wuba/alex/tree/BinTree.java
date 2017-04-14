package com.wuba.alex.tree;

import apple.laf.JRSUIConstants;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Alex on 2017/4/14.
 */
public class BinTree {

    private int size;
    private BinNode root;
    private List data ;

    private Queue<IBinNode> queue ;

    public BinTree(List data) {

        size = data.size();
        this.data = data;
        root = createBinTree(0);
    }

    public BinNode createBinTree(int index) {

        if (index >= size)
            return null;
        BinNode bn = new BinNode(data.get(index));
        System.out.print(data.get(index) + "--");
        bn.setLeft(createBinTree(2*index+1));
        bn.setRight(createBinTree(2*index+2));
        return bn;
    }

    public void initQ(IBinNode node) {
        this.queue = new LinkedList();
        queue.add(node);
    }




    public void distroyBinTree() {

        //未完成
        root = null;

    }


    public void preTraversal(IBinNode node) {

        if (node == null)
            return;
        System.out.print(node.getElement() + " ");
        preTraversal(node.left());
        preTraversal(node.right());

    }


    /**
     * 层次便利一层一层的来 借助一个队列完成
     */
    public void cengci() {


        if (queue.size() == 0)
            return;
        IBinNode n = queue.poll();
        System.out.println(n.getElement());
        if (n.left()!=null) {
            queue.add(n.left());
        }
        if (n.right()!=null) {
            queue.add(n.right());
        }
        cengci();


//        while (queue.size()!=0) {
//            IBinNode n = queue.poll();
//            System.out.println(n.getElement());
//            if (n.left()!=null) {
//                queue.add(n.left());
//            }
//            if (n.right()!=null) {
//                queue.add(n.right());
//            }
//        }

    }





    public void inorderTra(IBinNode node) {

        if (node == null)
            return;
        inorderTra(node.left());
        System.out.print(node.getElement() + " ");
        inorderTra(node.right());

    }

    public void posterderTra(IBinNode node) {

        if (node == null)
            return;
        posterderTra(node.left());
        posterderTra(node.right());
        System.out.print(node.getElement() + " ");
    }

    public static void main(String[] args) {


        while (true) {


            System.out.println("create tree ");
            List testData = new LinkedList();
            for (int i = 0; i < 10; i++) {
                testData.add(i);
            }

            BinTree tree = new BinTree(testData);


            System.out.println();
            System.out.println("先序遍历");
            tree.preTraversal(tree.root);
            System.out.println("中序遍历");
            tree.inorderTra(tree.root);
            System.out.println("后序遍历");
            tree.posterderTra(tree.root);

            tree.initQ(tree.root);
            tree.cengci();

            System.out.println("销毁树");
            tree.distroyBinTree(tree.root);
            tree.root = null;
            System.out.println("销毁后  后续便利");
            tree.posterderTra(tree.root);
        }
    }
}
