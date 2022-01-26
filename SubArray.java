
import java.util.*;
class Solution {
    static void  findSubArray(int[] arr, int sum){
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int currentSum=0,val=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum-sum==0){
                System.out.println("sum found from"+0+"to "+i);
                break;
            }
            if(hm.containsKey(currentSum-sum)){
                val=hm.get(currentSum-sum)+1;
               System.out.println("sum found from"+val+"to"+i);
               break;
            }
            hm.put(currentSum,i);
        }

    }
    public static void main(String args[]){
        int [] arr={11,2,3,4,1,5};
        int sum=10;
        findSubArray(arr,sum);

    }
}