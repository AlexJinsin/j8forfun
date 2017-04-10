package com.wuba.alex;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    List<Article> articles = new LinkedList<>();
    public void init() {

        for (int i = 0 ; i < 10; i++) {

            articles.add(new Article(String.valueOf(i),String.valueOf("aut:" +i)));
        }
    }

    public List<Article> getAllJavaArticles() {


        articles.p

        return articles.stream()
                .filter(article -> article.getAuthor().contains("2"))
                .collect(Collectors.toList());
    }




    public static void main(String[] args) {


        Main m = new Main();
        m.init();
        System.out.print(m.getAllJavaArticles().get(0).getAuthor());

    }
}
