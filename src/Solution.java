import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {

        int pageTurnCount=-1;
        int middle=n/2;
        int pageNumber=p;
        int pageCount=n;

        if(p<=middle) {
            while (pageNumber >= 0) {

                pageNumber -= 2;

                pageTurnCount++;

            }
        }
             if(p>middle){

                 if(n%2==0 && n==p+1){
                     pageTurnCount=0;
                 }

                 while (pageCount >= p) {
                     pageCount-=2;
                     pageTurnCount++;

                 }

             }


        return pageTurnCount;

        }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        System.out.println(result);


    }
}
