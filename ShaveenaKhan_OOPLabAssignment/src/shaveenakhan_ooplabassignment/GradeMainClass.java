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
public class GradeMainClass {
        public static void main(String[]args){
        Grade grade = new Grade();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        
         try{
        int s= grade.value = input.nextInt();
        grade.Grades(s);
        }
       
         
        catch(InputMismatchException ae){
            System.out.println("Invalid non-numeric input! Try again");
                    

        }
        
        catch(ArithmeticException ae){
            System.out.println("Please enter marks in between 1 to 100");
        }
        }}
