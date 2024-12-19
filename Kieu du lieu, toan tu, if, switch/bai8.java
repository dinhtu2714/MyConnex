import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem chuyen can: ");
        double ap = sc.nextDouble();

        System.err.println("Nhap diem giua ky: ");
        double m = sc.nextDouble();

        System.err.println("Nhap diem cuoi ky: ");
        double f = sc.nextDouble();

        double average = ap * 0.1 + m * 0.3 + f * 0.6;

        if (average >= 9) {
            System.out.println("Loai A");
        } else {
            if (average >= 7) {
                System.out.println("loai B");
            } else {
                if (average >= 5) {
                    System.out.println("Loai C");
                } else {
                    System.out.println("Loai D");
                }
            }
        }
        sc.close();
    }
}
