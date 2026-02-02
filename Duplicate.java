import java.util.*;
class Duplicate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<n;i++){
             list.add(sc.nextInt());
         }
         System.out.print(dup(list));
    }
    public static boolean duplicate(ArrayList<Integer> list){ // 2,5,4,5,5,2,3
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:list){
            map.put(num,map.getOrDefault(num,0)+1);
            // 2,0+1 => 2,1 - clear
            // 5,0+1 => 5,1 - cleared
            // 4,0+1 => 4,1
            // 5,1+1 => 5,2 - cleared
            // 5,2+1 => 5,3
            // 2,1+1 => 2,2
            // 3,0+1 => 3,1 
            //map=>{(4,1),(5,3),(2,2),(3,1)}
            
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>1) return true;
        }
        return false;
    }
}
