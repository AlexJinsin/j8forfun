package com.wuba.alex;

import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alex on 2017/4/10.
 */
public class Article implements  Runnable{

    private  String title = null;
    private  String author = null;;
    private final List<String> tags = null;;

    public Article(String t, String a) {
        title = t;
        author = a;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public void run() {

        System.out.println("in thread");

    }
}
