import java.util.*;
class Solution{
    public static void main(String arg[]){
        Set<Integer> distinct= new HashSet<Integer>();
        int[] arr ={1,2,2,3,1,4,5,5,6,1,1};
        for(int i=0;i<arr.length;i++){
            if(!distinct.contains(arr[i]))
                distinct.add(arr[i]);
        }
        Iterator val=distinct.iterator();
        while(val.hasNext()){
            System.out.println(val.next());
        }
    }
    
}