package com.wuba.alex.tree;

import com.sun.xml.internal.rngom.digested.DElementPattern;

/**
 * Created by Alex on 2017/4/13.
 */
public class BinNode implements IBinNode{

    private Object element ;
    private IBinNode left;
    private IBinNode right;


    public BinNode() {

    }

    public BinNode(Object ele) {

        element = ele;
    }

    public BinNode(Object ele, IBinNode l, IBinNode r) {
        element = ele;
        left = l;
        right = r;
    }

    @Override
    public Object getElement() {
        return element;
    }

    @Override
    public void setElement(Object element) {
        this.element = element;
    }

    @Override
    public IBinNode left() {
        return left;
    }

    @Override
    public void setLeft(IBinNode left) {
        this.left = left;
    }

    @Override
    public IBinNode right() {
        return right;
    }

    @Override
    public void setRight(IBinNode right) {
        this.right = right;
    }

    @Override
    public boolean isLeft() {
        return (left == null && right == null)?true:false;
    }
}
