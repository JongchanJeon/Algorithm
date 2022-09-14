import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < count ; i++) {
            StringTokenizer ab = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(ab.nextToken()) + Integer.parseInt(ab.nextToken()) +"\n");
        }
        bw.close();
    }
}
