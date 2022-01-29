 class Solution{

     public static void main(String args[]){
         int n=2;
         System.out.println("there are "+countWays(n)+"Number of Ways to reach"+n);
     }
     public static int countWays(int n){
         int[] a=new int[n+1];
         for(int i=0;i<n+1;i++){
             a[i]=-1;
         }
         fec(n,a);
         return a[n];
     }
     public static int fec(int n, int a[]){
         if(n<=1){
            return a[n]=1;

         }
         if(a[n]!=-1){
            return a[n];
         }
         a[n]=fec(n-1,a)+fec(n-2,a);
         return a[n];
     }
 }