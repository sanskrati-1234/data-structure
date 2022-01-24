class Solution{
    public static void main(String[] str){
        int key=5;
        int[] arr={1,2,3,4,5};
        int l=0,r=4, mid=2;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                break;
            }else if(arr[mid]>key){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
    }

    
}