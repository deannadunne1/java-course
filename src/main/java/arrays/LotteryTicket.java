package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    private static void printTicket(int[] ticket) {
        Arrays.sort(ticket);
        for(int number : ticket){
            System.out.print(number + " | ");
        }
    }

    /*
    Returns 6 random number to constitute a lottery ticket
     */
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0; i<LENGTH; i++){
            int randomNumber;

            do{
               randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor){
        for(int value : array){
            if(value == numberToSearchFor) return true;
        }

        return false;
    }
}
