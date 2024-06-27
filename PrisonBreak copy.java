package Codeforces;

import java.util.Scanner;

public class PrisonBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0) {
            long n=sc.nextLong(), m=sc.nextLong(), r=sc.nextLong(), c=sc.nextLong();
            long max=0;

            max= Math.max(max, (n-r)+(m-c));
            max= Math.max(max, (n-r)+(c-1));
            max= Math.max(max, (r-1)+(m-c));
            max= Math.max(max, (r-1)+(c-1));

            System.out.println(max);
        }
        sc.close();
    }
}
