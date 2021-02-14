package scannerImportant;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map < String, Integer > mp = new HashMap < String, Integer > ();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.nextLine();//bcz pichli line me input to le liya but wo next line me input nhi lege jb tk hum use nextline me na phocha de
        
        for (int i = 0; i < n; i++) {
            String a = in.nextLine();
            int b = in.nextInt();
            in.nextLine();//bcz pichli line me input to le liya but wo next line me input nhi lege jb tk hum use nextline me na phocha de
            mp.put(a, b);
        }
        
        int q = in .nextInt();
        in.nextLine();//bcz pichli line me input to le liya but wo next line me input nhi lege jb tk hum use nextline me na phocha de
        
        for (int i = 0; i < q; i++) {
            String a = in.nextLine();
            if (mp.containsKey(a))
                System.out.println(mp.get(a));
            else System.out.println("Not Found");
        } 
        in .close();

    }
}