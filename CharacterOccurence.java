import java.util.*;

public class CharacterOccurence {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a string:");
      //aaabcc
      String str = sc.nextLine();
      
      Map<Character,Integer> map = new HashMap<>();
      
      for(int i=0;i<str.length();i++){
          map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
      }
      int num = 0;
      char ch = 'a';
      for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(num < entry.getValue()){ // 0<3 3<1 3<2
                    num = entry.getValue(); //  3   
                    ch = entry.getKey();   //   a
                    System.out.println("change: "+num+" "+ch);
                }

      }
        System.out.println("num : "+num);
        System.out.println("char : "+ch);// a

    }
}
