import java.util.Scanner;

public class bai5 {

    public static Scanner sc = new Scanner(System.in);

    public static void giaiPTB1() {
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem].");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh: x = " + x);
        }
    }

    public static void giaiPTB2() {

        System.out.println("Nhap a: ");
        double a = sc.nextDouble();

        System.out.println("Nhap b: ");
        double b = sc.nextDouble();

        System.out.println("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = c / b;
                System.out.println(" Phuong trinh co 1 nghiem: " + x);
            }
        } else {
            double delta = b * b - 2 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static void tinhTienDien() {

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
    }

    public static void main(String[] args) {
        System.out.println("+..............................+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+..............................+");

        System.err.print("Chon chuc nang: ");
        byte x = sc.nextByte();

        switch (x) {
            case 1:
                giaiPTB1();
                break;

            case 2:
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
                break;

            default:
                break;
        }
    }
}
