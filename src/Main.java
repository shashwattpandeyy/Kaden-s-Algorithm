import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println ( "Enter size of Array" );
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
        int SizeOfArray = Integer.parseInt ( br.readLine () );
        int[] array = new int[SizeOfArray];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random () * 10);
//        }
        System.out.println ( "Enter Number" );
        for (int i = 0; i < SizeOfArray; i++) {
            array[i] = Integer.parseInt ( br.readLine () );
        }
        System.out.println ( Arrays.toString ( array ) );
        int maxSumIs = LargestSumSubArray.LargestSum ( array );
        System.out.println ( "Sum is: " + maxSumIs );
    }
}
