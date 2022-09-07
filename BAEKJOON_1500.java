import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON_1500 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        String mo = "1";
        int max = 1;
        int sum = 0;
        int momax = 1;

            for(int i = K - 1; i >= 1; i--){
                mo += "1";
            }
            if(K != 1) {
                while (Math.pow(10, K) - 1 > Integer.parseInt(mo)) {
                    for (int i = K - 1; i >= 0; i--) {
                        sum += Character.getNumericValue(mo.charAt(i));
                        momax *= Character.getNumericValue(mo.charAt(i));
                    }
                    if (sum == S && momax > max) {
                        max = 1;
                        for (int i = K - 1; i >= 0; i--) {

                            max *= Character.getNumericValue(mo.charAt(i));
                        }

                    } else {
                        int intValue = Integer.parseInt(mo) + 1;
                        mo = String.valueOf(intValue);
                        sum = 0;
                        momax = 1;
                    }
                }
                System.out.println(max);
            }
            else{
                System.out.println(S);
            }

    }



    }

