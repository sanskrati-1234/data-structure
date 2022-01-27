import java.util.*;
class Main{
    public static void main(String[] args){
       Integer[] arr1={1,5,10,20,40,80};
       Integer[] arr2={6,7,20,80,100};
       Integer[] arr3={3,4,15,20,30,70,80,120};
       HashSet<Integer> hs1=new HashSet<Integer>(Arrays.asList(arr1));
       HashSet<Integer> hs2=new HashSet<Integer>(Arrays.asList(arr2));
       HashSet<Integer> hs3=new HashSet<Integer>();
       for(Integer element: arr3){
           if(hs1.contains(element)&&hs2.contains(element)){
               hs3.add(element);
           }
       }
       Iterator it=hs3.iterator();
       while(it.hasNext()){

           System.out.println(it.next());
       }
      
    }
}