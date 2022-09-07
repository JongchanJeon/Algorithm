import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON_1076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int black = 0, brown = 1, red = 2, orange = 3, yellow = 4, green = 5, blue = 6, violet = 7, grey = 8, white = 9;
        String color = "";
        int realValue = 0;

        for(int i = 0; i < 2; i++) {
            color = sc.next();
            switch (color) {
                case "black":
                    realValue += 0;
                    break;
                case "brown":
                    realValue += 1;
                    break;
                case "red":
                    realValue += 2;
                    break;
                case "orange":
                    realValue += 3;
                    break;
                case "yellow":
                    realValue += 4;
                    break;
                case "green":
                    realValue += 5;
                    break;
                case "blue":
                    realValue += 6;
                    break;
                case "violet":
                    realValue += 7;
                    break;
                case "grey":
                    realValue += 8;
                    break;
                case "white":
                    realValue += 9;
                    break;
            }
            if (i == 0) {
                realValue *= 10;
            }
        }
        color = sc.next();
        int square = 0;
        switch (color) {
            case "black":
                square = 0;
                break;
            case "brown":
                square = 1;
                break;
            case "red":
                square = 2;
                break;
            case "orange":
                square = 3;
                break;
            case "yellow":
                square = 4;
                break;
            case "green":
                square = 5;
                break;
            case "blue":
                square = 6;
                break;
            case "violet":
                square = 7;
                break;
            case "grey":
                square = 8;
                break;
            case "white":
                square = 9;
                break;
        }
        BigInteger total = BigInteger.valueOf((long) (realValue * Math.pow(10, square)));
        System.out.println(total);

    }
}
