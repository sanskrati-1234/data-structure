
class Solution{
    public static void main(String args[]){
        int [] arr={1,2,3,4,-5,6,-2};
        System.out.println("Maximum sub Array"+);
    }
    static int sumOfSubArray(int[] arr){
        int max=Integer.MIN_VALUE,temp=0;
        for(int i=0;i<arr.length;i++){
          temp=temp+arr[i];
          if(max<temp){
              max=temp;
          }
          if(temp<0){
              temp=0;
          }
        }
        return max;
    }

}