import java.util.Scanner;

public class bai4 {
    private static int get(int x) {
        if (x <= 50) {
            return 1;
        } else if (x <= 100) {
            return 2;
        } else if (x <= 200) {
            return 3;
        } else if (x <= 300) {
            return 4;
        } else if (x <= 400) {
            return 5;
        } else {
            return 6;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so dien: ");
        int x = sc.nextInt();

        double total = 0;

        switch (get(x)) {
            case 1:
                total = x * 1.678;
                break;
            case 2:
                total = 50 * 1.678 + (x - 50) * 1.734;
                break;
            case 3:
                total = 50 * 1.678 + 50 * 1.734 + (x - 100) * 2.014;
                break;
            case 4:
                total = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (x - 200) * 2.536;
                break;
            case 5:
                total = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (x - 300) * 2.834;
                break;
            case 6:
                total = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (x - 400) * 2.927;
                break;
        }

        System.out.println("Tien dien la: " + total);
        sc.close();
    }
}
