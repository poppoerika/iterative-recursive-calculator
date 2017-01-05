
package project3_tharp;


public class Sequence {
    private static int count =0;
    private static int count2 = 0;
    public static int computeIterative(int number){
        int y = 0;
        int z = 0;
        int result =1;
        count++;
        if(number == 0)
            result = 0;
        for(int x = 0; x < number-1; x++){
            z = result * 2 + y;
            y = result;
            result = z;
            count++;
        }
        return result;
    }
    
    public static int computeRecursive(int number){
        count++;
        if(number ==0)
            return 0;
        if(number == 1){
            return 1;
        }
        
        else
            return (computeRecursive(number - 1) * 2) + computeRecursive(number - 2);
    }
    
    public static int getEfficiency(){
        count2 = count;
        count = 0;
        return count2;
    }
}
