package src.main.java.base;

import java.util.List;
import java.util.Random;


public class Book {
    String name;
    String author;
    Integer year;
    Integer pages;
    String optional;


    Book(){

        Random rand = new Random();

        List<String> authorlist= List.of("A","B","C","D","E","F","G","H","I","J");

        setName("book"+rand.nextInt(10));
        setAuthor(authorlist.get(rand.nextInt(authorlist.size()))+"."+authorlist.get(rand.nextInt(authorlist.size())));
        setPages(rand.nextInt(190)+10);

        int y = rand.nextInt(75)+1950;
        setYear(y);
        setOptional(y>=1991?"Made in Russia Federation":"Сделано в СССР");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    @Override
    public String toString(){
        return name+" Author: "+author+" Year: "+year+" Pages: "+pages+" Optional: "+optional;
    }
}
