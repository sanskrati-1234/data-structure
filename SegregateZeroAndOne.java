class Solution{
    public static void main(String args[]){
        int arr[]={0,1,0,1,0,1,0,1,0,1};
        int left=0,right=arr.length-1,temp;

        while(left<right){
            while(left<right && arr[left]==0)
                 left++;
            while(left<right && arr[right]==1)
                right--;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
    }
}