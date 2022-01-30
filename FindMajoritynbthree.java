/*

*/
class Solution{

    public static void main(String args[]){
        int a[]={1,1,1,3,3,3,4,4,4};
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int candidate=0,count=0;
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        hm.forEach((k,v)->{
            if(v>=a.length/3){
                System.out.println(k);
            }
        }
        );
    }