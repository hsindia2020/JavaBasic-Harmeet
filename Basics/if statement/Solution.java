import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

public static void fizzBuzz(int n) {
    // Write your code here
int i;
 for (i=1;i<=n;i++){

			int a = n % i;
			if (a == 2) {
             System.out.println("Fizz");
         } else{
             System.out.println(i);
         }
 }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.fizzBuzz(n);

        bufferedReader.close();
    }
}