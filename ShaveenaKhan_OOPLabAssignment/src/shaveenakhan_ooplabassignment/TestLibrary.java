/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaveenakhan_ooplabassignment;
import java.util.*;
/**
 *
 * @author User
 */
public class TestLibrary {
    public static void main(String[]args){
    RegularBook regular = new RegularBook();
    ReferenceBook reference= new ReferenceBook();
    AudioBook audio = new AudioBook();
    
   
    Scanner input = new Scanner(System.in);
    
    int choice;
    
      System.out.println("Enter 1 If you have Regular Book");
      System.out.println("Enter 2 If you have Reference Book");
      System.out.println("Enter 3 If you have Audio Book");
 
    
    
   
   System.out.println("Entered your choice: ");
      choice = input.nextInt();

      if(choice==1){
    System.out.println("------xxxxxx------Regular Book Section-----xxxxx--------");
    System.out.print("What is the title of book: ");
    regular.title = input.next();
   
   System.out.print("Who is the author of book: ");
   regular.author = input.next();
   
   System.out.print("How many days you took this book? ");
   regular.dayTaken= input.nextInt();
   regular.printdisplay();

      }
      else if(choice==2){
   System.out.println("------xxxxxx------Reference Book Section-----xxxxx--------");
   System.out.print("What is the title of book: ");
   reference.title= input.next();
   
   System.out.print("How many days you took this book? ");
   reference.dayTaken = input.nextInt(); 
   reference.printdisplay();
   
   }
    
      else if(choice==3){
      System.out.println("------xxxxxx------Audio Book Section-----xxxxx--------");
      System.out.print("What is the title of book: ");
      audio.title = input.next();
      
      System.out.print("Who is the author of book: ");
      audio.author = input.next();
      
      System.out.print("How many days you took this book? ");
      audio.dayTaken = input.nextInt();
      audio.printdisplay();
      
      }
        
    
    }





}
