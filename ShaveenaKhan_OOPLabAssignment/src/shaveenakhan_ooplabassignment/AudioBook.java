/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaveenakhan_ooplabassignment;

/**
 *
 * @author User
 */
public class AudioBook extends IBook{
    String title;
    String author;
    int dayTaken;
    int fine;
    boolean val;
    
    @Override
    int daysOverdue(){
    int overdue = 14-dayTaken;
    return overdue;
    }
    
    @Override
    boolean isOverdue(){
    if(dayTaken>14){
    val = true;
    }
    else if(dayTaken<14){
    val = false;
    }
    return val;
    }
    
    @Override
    int computeFine(){
    if(isOverdue()){
        fine=20*Math.abs(daysOverdue());
    }
    return fine;  
} 
    
    void printdisplay(){
System.out.println("\nTitle of book: "+ this.title +"\nAuthor of book: "+ this.author +"\nIf number is positive then book can still be out and if number is negative then it shows overdue days: "+ daysOverdue() +"\nIf book is overdue then it shows true and if book is not overdue then it shows false: " + isOverdue() + "\nYour compute fine is: " + computeFine() );    }
}
