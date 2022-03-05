// https://www.hackerrank.com/challenges/java-loops-i/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        multiplicationTable(2);

        bufferedReader.close();
    }
    
    public static void multiplicationTable(int number) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
