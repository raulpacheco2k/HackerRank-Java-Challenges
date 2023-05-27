// https://www.hackerrank.com/challenges/java-output-formatting

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
              
                String result = "";
                int intSize = String.valueOf(x).length();  
                
                if (intSize == 2) {
                    result += "0" + x; 
                } else if (intSize == 1) {
                    result = "00" + x; 
                } else {
                    result += x;
                }
                
                System.out.printf("%-15s%s%n", s1, result);
            }
            System.out.println("================================");
    }
}
