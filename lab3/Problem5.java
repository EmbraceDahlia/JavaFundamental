package lab3;

//  Write a recursive solution to return max value from the given array.
// Example: [5, -3, 6, 1, 9, 4 ], Max = 9

// requurement
// find max value from an array
// write a recussive function

// steps
// create a max method
// finf the base case
// solve the function recursivle
// 
// 


public class Problem5 {

    public static int maxValue(int[] a,int index){
        if(index == a.length-1){
            return a[index];

        }
        int maxOfRest = maxValue(a, index + 1);
    
        return ( (a[index]> maxOfRest?a[index]:maxOfRest));




    } 

    public static void main(String[] agrgs){
       System.out.println(maxValue(new int[]{5, -3, 6, 1, 9, 4 },0)); 

    }

    
    

    
}
