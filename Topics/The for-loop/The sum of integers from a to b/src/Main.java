import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int res = 0;
        for (int i = start; i <= end; i++) {
            res += i;
        }
        System.out.println(res);
    }
}