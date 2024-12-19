import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String sourceStr = sc.nextLine();

        // Cau a
        String input = sourceStr.toLowerCase().replaceAll("[^a-zà-ỹ0-9\\s]", "");

        String[] str = input.split(" ");

        Map<String, Integer> map = new HashMap<>();

        System.out.println("Dem so luong tu trong chuoi: ");
        for (String word : str) {
            if (map.get(word) == null) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        System.out.println("Cau a:");
        for (String word : str) {
            if (map.get(word) == null) {
                continue;
            } else {
                System.out.println(word + ": " + map.get(word) + " tu");
                map.remove(word);
            }
        }

        // Cau b
        String[] str2 = sourceStr.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : str2) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            res.append(word).append(" ");
        }
        System.out.println("Chuoi sau khi viet hoa chu dau trong moi tu: ");
        System.out.println(res);

        // Cau c
        sourceStr = sourceStr.replaceAll(
                "[aáàảãạăắằẳẵặâấầẩẫậeéèẻẽẹêếềểễệiíìỉĩịoóòỏõọôốồổỗộơớờởỡợuúùủũụưứừửữựyýỳỷỹỵAÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬEÉÈẺẼẸÊẾỀỂỄỆIÍÌỈĨỊOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢUÚÙỦŨỤƯỨỪỬỮỰYÝỲỶỸỴ]",
                "");

        System.out.println("Chuoi sau khi xoa nguyen am: ");
        System.out.println(sourceStr);
    }
}
