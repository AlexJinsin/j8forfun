package com.wuba.alex.tree;

import java.util.Objects;

/**
 * Created by Alex on 2017/4/13.
 */
public interface IBinNode {


    public Object getElement();
    public void setElement(Object element);

    public IBinNode getLeft();
    public void setLeft(IBinNode left);

    public IBinNode getRight();
    public void setRight(IBinNode right);

    public boolean isLeft();


}
