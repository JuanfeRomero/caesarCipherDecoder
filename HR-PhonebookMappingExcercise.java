import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> keyMapping = new HashMap<String, Integer>();
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            keyMapping.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(keyMapping.containsKey(s)){
            System.out.println(s+ "=" +keyMapping.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

