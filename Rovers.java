/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rov;

import com.sun.javafx.scene.traversal.Direction;
import static java.lang.System.in;
import java.util.Scanner;
import static javax.swing.text.Position.Bias.Backward;
import static javax.swing.text.Position.Bias.Forward;

/**
 *
 * @author webster
 */
public final class Rov {

    
    
    static void position( String Navigate){
        
        
    int Movement =Navigate.length();
    
    
    // Rover direction
    // initial direction of rover is : North
    // Rover will explore all directions 
    int Forward = 0, Backward=0;
    int TurnRight=0, TurnLeft=0;
    
     String message = "Welcome to Rover interface";
    
    
    // For loop checks to see if entered string is valid
    
    for(int i=0; i< Movement;i++) {
   
        
                
        
      
     if(Navigate.charAt(i)=='N') {
          // turns north when W is entered
         Forward++;}
     else if(Navigate.charAt(i)=='E'){
          // turns east when W is entered
          System.out.println("Direction:" + Navigate);
         TurnRight++;}
     else if (Navigate.charAt(i)=='S'){
          // turns south when S is entered
         Backward++; }
     else if (Navigate.charAt(i)=='W'){
        // turns left when W is entered
         TurnLeft++;}
    } 
         // display  Rovers final destination
         System.out.println("Current Destination:( "+ (TurnRight-TurnLeft)+"," + (Forward -Backward) +  ")");    
         
    }
   
    public static void main(String[] args) {
        
       
        String message = "Welcome To Rover Interface:)";
       
        
        //Handles input from user and display it
        Scanner input = new Scanner(System.in);
         System.out.println(message);
        System.out.println(" Please Enter Direction:"  );
        String Movement = input.nextLine();
        // call function to do the things
        position(Movement);
      
    // resets input from user
        input.reset();
        
        }
          
    }
    

