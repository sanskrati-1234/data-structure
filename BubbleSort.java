class Solution{
    public static void main(String args[]){
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int temp=0,count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0){
                System.out.println("Array is alread sorted");
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }
}