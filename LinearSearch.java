class Solution{
    public static void main(String[] arg){
        int[] arr={9,3,4,5,6,8};
        int key=5,i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(key +"present at "+i +"index");
                break;
            }
        } 
        if(i==arr.length){
            System.out.println("key is not present in array");
        }

    }
}