
public class bai1 {
    public class Rectangle {
        double width, height;

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double perimeter() {
            return 2 * this.height * this.width;
        }

        public double area() {
            return this.height * this.width;
        }
    }
}
