import java.util.*;
class Frequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<n;i++){
             list.add(sc.nextInt());
         }
         frequency(list);
    }
    
    public static void frequency(ArrayList<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : list){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("Element: "+entry.getKey()+" -> "+"freq: "+entry.getValue());
        }
    }
}
