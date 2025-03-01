package lab3;

public class MaxValue {

    private static int findMaxValue(int[] a,int index){
        if(index == a.length-1){
            return a[index];
        }

        return ( (a[index]> findMaxValue(a, index + 1)?
        a[index]:findMaxValue(a, index + 1)));

    } 

    public static int findMaxValue(int[]a){
        if(a.length==0){
            return 0;
        }

        return findMaxValue(a, 0);

    }

    public static void main(String[] args){
       System.out.println(findMaxValue(new int[]{}));
    }

    
    

    
}
