/*The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.
*/


class Solution{

    public static void main(String args[]){
        int[] a={1,1,1,1,3,3,3};
        int candidate=0,count=0;
        for(int i=0;i<a.length;i++){
            if(count==0){
                candidate=a[i];
                count++;
            }
            else if(candidate==a[i]){
                count++;
            }else{
                count--;
            }
        }
        for(int i=0;i<a.length;i++){
            if(candidate==a[i]){
                count++;
            }

        }
        if(count>a.length/2)
           System.out.println(candidate);


    }
}