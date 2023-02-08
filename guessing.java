package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int num;
    public int inputNumber;
    public int noOfAttempts = 0;
    public int getNoOfGuesses() {
        return noOfAttempts;
    }
    public void setNoOfGuesses(int noOfAttempts) {
        this.noOfAttempts = noOfAttempts;
        int var = 3;
    }
    Game(int n,int m){
        Random rand = new Random();
        this.num = rand.nextInt(100);
        System.out.format("Welcome to the number guessing game \n ROUND %d",m);
//        System.out.println("ROUND 1");
        System.out.format("\nYou have %d attempts to play this game so best of luck!",n);
        System.out.println("\nEnter number from 1 and 100");
    }
    void takeUserInput(){
        // System.out.format("you have %d attempts to play this game",n);
        System.out.println("\nGuess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean CheckTheNumber() {
        noOfAttempts++;
        if (inputNumber > 100 || inputNumber < 1) {
            System.out.println("Error! Enter number from 1 and 100");
        }
        else if (inputNumber == num) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts\n", num, noOfAttempts);
            //  System.out.println("\nWelcome to ROUND 2");
            return true;
        }
        else if (inputNumber < num) {
            System.out.println("Your Number is low. Increase your Number");
        }
        else if (inputNumber > num) {
            System.out.println("Your Number is high. Decrease your number.");
        }
        if (noOfAttempts==8) {
            System.out.println("your attempts are over");
            System.out.format("The number was %d ",num);
            System.out.println("\nBetter try next time.");
            return true;
        }
        return false;
    }
    int guesses(){
        return noOfAttempts;
    }
    boolean CheckTheNumber1() {
        noOfAttempts++;
        if (inputNumber > 100 || inputNumber < 1) {
            System.out.println("Error! Enter number from 1 and 100");
        }
        else if (inputNumber == num) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts\n", num, noOfAttempts);
            System.out.println("\nCongratulations.You win the game");
            return true;
        }
        else if (inputNumber < num) {
            System.out.println("Your Number is low. Increase your Number.");
        }
        else if (inputNumber > num) {
            System.out.println("Your Number is high. Decrease your number.");
        }

        if (noOfAttempts==5) {
            System.out.println("your attempts are over");
            System.out.format("\nThe number was %d ",num);
            System.out.println("\nYou lose the game.Better try next time.");
            return true;
        }
        return false;
    }
}
public class guessing {
    public static void main(String[] args) {
        int noOfAttempts;
//        System.out.format("Welcome to the number guessing game \n ROUND 1");
        Game g = new Game(8,1);
        boolean b= false;
        boolean c=false;
        int [] k={10,8,6,5};
        int l=0;
        while(!b){
            g.takeUserInput();
            b = g.CheckTheNumber();
            l++;
        }
        if(l==1){
          System.out.format("Your score in round 1 is %d points\n",k[0]);
        } else if (l==2) {
            System.out.format("Your score in round 1 is %d points\n",k[1]);
        } else if (l==3) {
            System.out.format("Your score in round 1 is %d points\n",k[2]);
        }
        else{
            System.out.format("Your score in round 1 is %d points\n",k[3]);
   }
        if(l!=8){
            Game a=new Game(5,2);
            while(!c){
                a.takeUserInput();
                c = a.CheckTheNumber1();
            }}
    }
}

