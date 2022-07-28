import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String start = str.substring(0, 1);
        System.out.println(start.equalsIgnoreCase("j"));
    }
}