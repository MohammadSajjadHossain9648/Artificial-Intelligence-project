/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author Student
 */
public class Card {
    String title;
    String author;
    int copies;

    public void set(String title, String author, int copies){
       this.title=title;
       this.author=author;
       this.copies=copies;
    }
    
    public void show(){
        System.out.println("title : "+this.title);
        System.out.println("author : "+this.author);
        System.out.println("no of copies : "+this.copies);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       Card s1= new Card();
        s1.set("ai","Russel",10);
        
        s1.show();
         
    }
    
}


