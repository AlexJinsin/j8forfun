package com.wuba.alex;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {


    List<Article> articles = new LinkedList<>();
    public void init() {

        for (int i = 0 ; i < 10; i++) {

            articles.add(new Article(String.valueOf(i),String.valueOf("aut:" +i)));
        }
    }

    public List<Article> getAllJavaArticles() {



        return articles.stream()
                .filter(article -> article.getAuthor().contains("2"))
                .collect(Collectors.toList());
    }

    public static void toDoSth() {

        System.out.println("this mathod in Main class todo run");
    }


    public static void main(String[] args) {






        LocalDate today = LocalDate.now();
//        System.out.println(LocalDate.of(1992, Month.JULY,8));

        String path = String.join("/","user","local");
        String ip = String.join(".",new String[]{"192","168","0","0"});
//today = null;

        Path a = Paths.get("/","user","local");
//        Byte.toUnsignedInt(1);

         Objects.requireNonNull(today);



        System.out.println(a);


//        Article article = new Article("a","b");


//        new  Thread(() -> System.out.println("hello world")).start();
//        new  Thread(() -> {for (int i = 0 ; i < 10000 ; i++) System.out.println("i:" + i);}).start();

//        new Article("","").run();
//        new Article("","").run();

//        System.out.print(Instant.now());

//        new Thread(new Article("","")).start();
//        new Thread(new Article("","")).start();

//        Main m = new Main();
//        m.init();
//        System.out.print(m.getAllJavaArticles().get(0).getAuthor());

    }
}
