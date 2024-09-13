import java.util.Scanner;
import java.util.Random;
public class Main{
    
public static void main(String[]args){
Random rand=new Random();
Scanner scan= new Scanner(System.in);

int x =rand.nextInt(100);
int guess;


System.out.println("Enter your first guess:");
guess =scan.nextInt();
int count=0;//count the number of times user
while(guess!=x){
    if (guess<x){
        System.out.println("too low!");
    }else if(guess>x){
        System.out.println("too high");
        

    } else {  System.out.println("you got it");


    }
    System.out.println("next"); 
    guess =scan.nextInt();
    count++;
}



        
    
    if(count<7){
        System.out.println("you got an impoosibly good score");
    
    }
    if(count>8);{
        System.out.println("you did a good job");
    
    }
    if(count<10){
        System.out.println("you did a good job");
    }
    if(count>10){
        System.out.println("Try the divide and conquer sytragy next time!");
    }



    // if x less  than, greater than or equal 
   

  // how well did you do 
}
}

