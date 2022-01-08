package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    public int [] shuffleGame(int [] arr) {
        Random rndm = ThreadLocalRandom.current();
        for(int i=arr.length-1;i>0;i--) {
            int index=rndm.nextInt(i+1);
            int tmp=arr[index];
            arr[index] =arr[i];
            arr[i]=tmp;
        }
        
        return arr;
    }

    public void play(int [] arr) {

        boolean play=true;
        System.out.println("\n---------------------------");
        System.out.println("\n *Welcome to shuffle game*");
        System.out.println("\n---------------------------");
        System.out.println("\n Guess where the 0 is ?");
        System.out.println("\nAre you ready to play? y/n");

        Scanner sc=new Scanner(System.in);
        String answer=sc.nextLine();

        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("\nPleaser enter y or n ");
            answer=sc.nextLine();
        }
        if(answer.equals("y")) {
            play=true;
        }
        else {
            if(answer.equals("n")) play=false;
            System.out.println("End of game ...");
        }

        while (play) {//game loop

            int [] shuffledArray = shuffleGame(arr);//shuffling the array
            System.out.println("\nPick 1,2 or 3");
            int index=sc.nextInt();//read  the answer


            //check the result
            if(arr[index-1]==0) {//good guess
                System.out.println("\nGood guess !!!!!");
            }
            else{//wrong guess
                System.out.println("\nSorry :( wrong guess");
            }



            System.out.println("\nDo you want to try again? y/n");
            String answer2 = sc.nextLine();
            while (!answer2.equals("y") && !answer2.equals("n")) {
                System.out.println("\nPleaser enter y or n ");
                answer2=sc.nextLine();
            }

            if(answer2.equals("y")) play=true;
            else{
                play=false;
                System.out.println("End of game ...");
            }
        }
    }
}
