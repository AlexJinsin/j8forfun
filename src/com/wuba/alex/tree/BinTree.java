package com.wuba.alex.tree;

import apple.laf.JRSUIConstants;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 2017/4/14.
 */
public class BinTree {

    private int size;
    private BinNode root;
    private List data ;

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

    public void distroyBinTree(IBinNode node) {

    }

    public void preTraversal(IBinNode node) {

        if (node == null)
            return;
        System.out.print(node.getElement() + " ");
        preTraversal(node.left());
        preTraversal(node.right());

    }

    public void inorderTra(BinNode node) {

    }

    public void posterderTra(BinNode node) {

    }

    public static void main(String[] args) {

        System.out.println("create tree ");
        List testData = new LinkedList();
        for (int i = 0; i < 10 ;i ++) {
            testData.add(i);
        }
        BinTree tree = new BinTree(testData);
        tree.preTraversal(tree.root);
    }

}
