import java.util.Scanner;
import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(arr));

        System.out.println("Phan tu co gia tri nho nhat la: " + arr[0]);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Trung binh cong cac phan tu chia het cho 3 la: " + (sum / count));

        sc.close();
    }
}
