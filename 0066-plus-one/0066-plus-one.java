import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] arr){
       String number = sum1(arr);

        int[] arr1 = new int[number.length()];

       for (int i = 0; i < arr1.length; i++) {
           arr1[i] = number.charAt(i) - '0';
       }

       return arr1;

   }








    public String array(int[] arr){
        String num = "";
        for (int i = 0; i < arr.length; i++) {
             num = num + arr[i];
        }

        return num;
    }



    public String sum1(int[] arr){
         String sum1 = array(arr);         // return string
        BigInteger num1 = new BigInteger(sum1);      // for big number, parseInt  100-digit number yahan error deta!  [convert to integer]
        num1 = num1.add(BigInteger.ONE);
          sum1 = num1.toString();  // convert to string
        return sum1;
    }

}