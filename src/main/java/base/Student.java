package src.main.java.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    String name;
    private List<Book> booklist = new ArrayList<>();

    public Student() {
        
        List<String> namelist = List.of("A","B","C","D","E","F","G","H","I","J");
        Random rand = new Random();
        
        setName("Student "+namelist.get(rand.nextInt(namelist.size())));
    }
    
    public Student add_books(){
        Random rand = new Random();
        for (int i=0,j=rand.nextInt(5)+5;i<j;i++){
            booklist.add(new Book());
        }
        return this;
    }
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name+" books:"+booklist.size(); 
    }

    public List<Book> getBooklist() {
        return List.copyOf(booklist);
    }

}
