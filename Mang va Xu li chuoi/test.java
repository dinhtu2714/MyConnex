import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class test {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Chuẩn hóa số điện thoại
        String normalizedPhone = phoneNumber.replace(".", "").replace("-", "").replace(" ", "");

        // Kiểm tra thủ công không dùng regex
        if (normalizedPhone.startsWith("+84")) {
            normalizedPhone = normalizedPhone.substring(3);
        } else if (normalizedPhone.startsWith("84")) {
            normalizedPhone = normalizedPhone.substring(2);
        } else if (normalizedPhone.startsWith("0")) {
            normalizedPhone = normalizedPhone.substring(1);
        }

        // Kiểm tra xem chuỗi còn lại có đúng 9 chữ số hay không
        if (normalizedPhone.length() != 9) {
            return false;
        }

        for (char c : normalizedPhone.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test các trường hợp mẫu
        String[] examples = {
            "+84912345678",
            "84912345678",
            "0912345678",
            "091-234-5678",
            "091.234.5678",
            "123456789",
            "+1234567890",
            "8491234.56789"
        };

        for (String example : examples) {
            System.out.println(example + ": " + isValidPhoneNumber(example));
        }
    }
}
