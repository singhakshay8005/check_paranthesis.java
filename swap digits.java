// program to swap first and last digit of a number :-
public class swap{
     public static void main(String[] args) {
          int n = 12345;
          int r = n%10;              //5
          int L = n/10000;           //1
          int mid = n%10000;         //2345
          int rem = mid/10;          //234

          int length = String.valueOf(n).length();
         
          double result = (5* Math.pow(10,length-1)) + rem*10 + L;
          int intValue = (int) result;
          System.out.println("number after reversing the first and last digit = " + intValue );
     }
}
