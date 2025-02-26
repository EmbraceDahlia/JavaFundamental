package lab1;

import java.util.Random;

public class Prog1 {
    public static void main(String[] args){

        System.out.println("Task A");
        Random random = new Random();
        int x =  random.nextInt(1,9);
        int y = random.nextInt(3,14);
        while (true){
            y = random.nextInt(3,14);
            if(y<3 || y>14){
                System.out.println("Something"+y);
                break;
            }
            else
                System.out.println(y);
        }


        System.out.printf("%.2f",Math.pow(Math.PI,x));
        System.out.println();
        System.out.printf("%.2f",Math.pow(y,Math.PI));

        System.out.println("\nTask B");
        //1.27,   3.881,  9.6
        float float1 =1.27f;
        float float2 = 3.881f;
        float float3=9.6f;
        int intSum = (int)(float1+float2+float3);
        System.out.println(float1+"+"+float2+"+"+float3+"="+intSum);
        int roundedIntSum = Math.round(float1+float2+float3);
        System.out.println("The rounded sum is "+roundedIntSum);
    }
}
