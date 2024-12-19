import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten sinh vien " + (i + 1) + ": ");
            while (true) {
                names[i] = sc.nextLine().trim();
                if (!names[i].isEmpty()) {
                    break;
                }
            }

            System.out.println("Nhap diem sinh vien " + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }

        quickSort(names, scores, 0, n - 1);

        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " - " + scores[i] + " - ");
            if (scores[i] < 5) {
                System.out.println("Yeu");
            } else if (scores[i] < 6.5) {
                System.out.println("Trung binh");
            } else if (scores[i] < 7.5) {
                System.out.println("Kha");
            } else if (scores[i] < 9) {
                System.out.println("Gioi");
            } else {
                System.out.println("Xuat sac");
            }
        }
    }

    public static void quickSort(String[] names, double[] scores, int low, int high) {
        if (low < high) {
            int pi = partition(names, scores, low, high);

            quickSort(names, scores, low, pi - 1);
            quickSort(names, scores, pi + 1, high);
        }
    }

    public static int partition(String[] names, double[] scores, int low, int high) {
        double pivot = scores[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (scores[j] <= pivot) {
                i++;

                double tempScore = scores[i];
                scores[i] = scores[j];
                scores[j] = tempScore;

                String tempName = names[i];
                names[i] = names[j];
                names[j] = tempName;
            }
        }

        double tempScore = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = tempScore;

        String tempName = names[i + 1];
        names[i + 1] = names[high];
        names[high] = tempName;

        return i + 1;
    }
}
