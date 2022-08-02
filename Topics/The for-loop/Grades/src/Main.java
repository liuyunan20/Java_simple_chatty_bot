import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        for (int i = 0; i < n; i++) {
           String grade = scanner.next();
           if (grade.equals("A")) {
               numA++;
           } else if (grade.equals("B")) {
               numB++;
           } else if (grade.equals("C")) {
               numC++;
           } else if (grade.equals("D")) {
               numD++;
           }
        }
        System.out.println(numD + " " + numC + " " + numB + " " +numA);
    }
}