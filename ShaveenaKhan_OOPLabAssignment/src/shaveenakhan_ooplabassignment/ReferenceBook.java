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
public class ReferenceBook extends IBook{
    String title;
    int dayTaken;
    int fine;
    boolean val;
    
    
    int daysOverdue(){
    int overdue=2-dayTaken;
    return overdue;
    }
    
   
    boolean isOverdue(){
    if(dayTaken>2){
    val=true;
    }
    else if(dayTaken<2){
    val=false;
    }
    return val;
    }
    
    
    int computeFine(){
    if(isOverdue()){
        fine=10*Math.abs(daysOverdue());
    }
    return fine;
    }
    
    void printdisplay(){
    System.out.println("\nTitle of book: "+ this.title +"\nIf number is positive then book can still be out and if number is negative then it shows overdue days: "+ daysOverdue() +"\nIf book is overdue then it shows true and if book is not overdue then it shows false: " + isOverdue() + "\nYour compute fine is: " + computeFine() );

    }
}
