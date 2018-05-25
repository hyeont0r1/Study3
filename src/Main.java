import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] asdf = new int[N];
        for (int i=0; i<N;i++)
            asdf[i] = sc.nextInt();

        for (int j=0; j<N;j++)
            System.out.println(asdf[j]);

        System.out.println("yeeee");
    }
}
