import java.util.Scanner;

public class BAEKJOON_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white = 0;
        char[][] chess = new char[8][8];
        int count = 0;
        String chessBoard = sc.next();
        for(int i = 0 ; i < 7 ; i++){
            chessBoard += sc.next();
        }
        for(int i = 0 ; i < 8; i++){
            for(int j = 0 ; j < 8; j++){
                chess[i][j] = chessBoard.charAt(count);
                count++;
                if ((i + j) % 2 == 0 && chess[i][j] == 'F'){
                    white++;
                }
            }
        }

        System.out.println(white);

    }
}
