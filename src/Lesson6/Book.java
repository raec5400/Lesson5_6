package Lesson6;

public class Book {
    private String title, author;
    
    public Book(String t, String a){
        title = t;
        author = a;
    }
    
    public String toString(){
        String str = "title: \t" + title;
        str += "\nAuthor:\t" + author;
        return str;
        
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
}
