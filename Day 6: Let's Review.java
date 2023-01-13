import java.io.*;
import java.util.*;

public class solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            String even="", odd="";
            String s = sc.next();
            char[] charArray = s.toCharArray();
            for (int j=0;j<charArray.length;j++){
                if (j%2==0){
                    even+=charArray[j];
                }
                else {
                    odd+=charArray[j];
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}
