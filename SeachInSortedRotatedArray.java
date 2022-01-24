class Solution{
    public static void main(String[] str){
        int key=5;
        int[] arr={1,2,3,4,5};
        int l=0,r=4, mid=2;
        BinarySearchInRotatedArray(arr,key,l,4);
    }
    static int BinarySearchInRotatedArray(int[] arr,int key,int left,int right){
         int mid =(left+right)/2;
         if(left>right) return -1;
         if(arr[mid]==key){
             return mid;
         }else if(arr[left]<=arr[mid]){
             if(arr[left]<=key && arr[mid]>=key){
                 BinarySearchInRotatedArray(arr,key,left,mid-1);
             }else{
                 BinarySearchInRotatedArray(arr,key,mid+1,right)
             }
         }
         else{
             if(arr[right>=key && arr[mid]<=key){
                 BinarySearchInRotatedArray(arr,key,mid+1,right);
             }else{
                 BinarySearchInRotatedArray(arr,key,left,mid-1)
             }
        }
    }

    
}