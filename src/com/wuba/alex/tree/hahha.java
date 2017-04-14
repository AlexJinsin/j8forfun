package com.wuba.alex.tree;

/**
 * Created by Alex on 2017/4/13.
 */
public class hahha {




    public static void main(String[]  args) {



        BinNode binNodeTree = new BinNode("1",null,null);
        BinNode father = new BinNode("father",binNodeTree,null);


        System.out.println(father.getElement());
        System.out.println(father.getLeft());
        System.out.println(father.getRight());
        System.out.println(father.getLeft().getElement());




    }



}
