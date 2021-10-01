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
public class Grade {
    
    int value;
         
    void Grades(int value){
   
   
       
        if(value==0){
                   System.out.println("Program terminated");
                    System.exit(0);
                }
        else if(value<0 || value>100){
            throw new ArithmeticException();
            
        }
        else if(value>0 || value>=100){
            if(value>=90){
                System.out.println("A Grade!");
            }
            else if(value>=80){
                System.out.println("B+ Grade!");
            }
            else if(value>=70){
                System.out.println("B Grade!");
            } 
             else if(value>=60){
                System.out.println("C Grade!");
            }
             else if(value>=50){
                System.out.println("D Grade!");
            }
             else if(value>0 || value<50){
                System.out.println("You are Fail :/ "); 
             }
        }
}
    
        
    }
