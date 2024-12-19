import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so dien thoai: ");
        String numbers = sc.nextLine();
        sc.close();

        numbers = numbers.replace("+", "").replace("-", "").replace(".", "");

        int l = 0;
        for (char x : numbers.toCharArray()) {
            if ('0' <= x && x <= '9')
                l++;
        }

        if (l >= 10 && l <= 11) {
            if (l == 10) {
                if (numbers.charAt(0) == '0') {
                    System.out.println("La so dien thoai");
                    return;
                }
            }

            if (numbers.charAt(0) == '8' && numbers.charAt(1) == '4') {
                System.out.println("La so dien thoai");
                return;
            }
        }
        System.out.println("Khong phai la so dien thoai asd");
    }
}
