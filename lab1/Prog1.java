package lab1;

import java.util.Random;

public class Prog1 {

    public static void main(String[] args){


        //TASK A
        Random random = new Random();

        // generate a number between 1 and 9
        int x = random.nextInt(9)+1;
        // generate a number between 3 and 14
        int y = random.nextInt(14) + 3;

        double xResult = Math.pow(Math.PI, x);

        // get a random number in the range 3 - 14
        double yResult = Math.pow(Math.PI, y);
        System.out.printf("π^%d = %.2f\n", x, xResult);
        System.out.printf("π^%d = %.2f\n", y, yResult);


        //TASK B
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;
        //1
        int sum = (int) (a +  b +  c);
        System.out.println(sum);

        //2
        int sum2 = Math.round( a + b + c);
        System.out.println(sum2);






    }
}
