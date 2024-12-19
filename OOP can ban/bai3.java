public class bai3 {
    public class MyInteger {
        int value;

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isEven() {
            if (this.value % 2 == 0) {
                return true;
            }
            return false;

        }

        public boolean isOdd() {
            if (this.value % 2 != 0) {
                return true;
            }
            return false;

        }

        public boolean isPrime() {
            for (int i = 2; i <= Math.sqrt(this.value); i++) {
                if (this.value % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isEven(int x) {
            if (x % 2 == 0) {
                return true;
            }
            return false;
        }

        public static boolean isOdd(int x) {
            if (x % 2 != 0) {
                return true;
            }
            return false;
        }

        public static boolean isPrime(int x) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean equal(int x) {
            if (this.value == x) {
                return true;
            }

            return false;
        }

        public boolean equal(MyInteger x) {
            if (this == x) {
                return true;
            }
            return false;
        }
    }
}
