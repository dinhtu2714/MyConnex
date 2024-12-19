import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = sc.nextInt();

        System.out.print("Nhap canh b: ");
        int b = sc.nextInt();

        System.out.print("Nhap canh c: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || a == c) {
                if (isRightTriangle(a, b, c)) {
                    System.out.println("Tam giac vuong can");
                } else {
                    System.out.println("Tam giac can");
                }
            } else if (isRightTriangle(a, b, c)) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong phai la tam giac");
        }
        sc.close();
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);
    }
}
