import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so dien: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("So dien khong hop le.");
        } else {
            if (x <= 50) {
                System.out.print("Tien dien la: ");
                System.out.println(x * 1000);
            } else {
                System.out.print("Tien dien la: ");
                System.out.println(50 * 1000 + (x - 50) * 1200);
            }
        }
        sc.close();
    }
}
