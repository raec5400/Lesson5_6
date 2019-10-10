package Lesson6;

public class Patron {

    private String name;
    private Book b1, b2, b3;

    public Patron(String n) {
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }
    
    public boolean hasBook(Book b){              
        if(b1!=b && b2!=b && b3!=b)
            return false;
        else
            return true;
    }

    public boolean borrow(Book b) {
        if (b1 != null && b2 != null && b3 != null) {
            return false;
        }
        if (hasBook(b)) {
            return false;
        }
        if (b1 == null) {
            b1 = b;
        }
        else if (b2 == null) {
            b2 = b;
        } else {
            b3 = b;
        }
        return true;
    }
    
    public boolean returnBook(Book b){
        if(b1 == null && b2 == null && b3 == null)
            return false;
        if(b1==b)
           b1=null;
        if(b2==b)
           b2=null;
        if(b3==b)
           b3=null;
        return true; 
}
    
    public String getName(){
        return name;
    }
}
