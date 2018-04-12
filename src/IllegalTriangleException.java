import java.util.Scanner;

public class IllegalTriangleException {
    static String isTriangle() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập cạnh a: ");
            int side1 = sc.nextInt();
            System.out.print("Nhập cạnh b: ");
            int side2 = sc.nextInt();
            System.out.print("Nhập cạnh c: ");
            int side3 = sc.nextInt();
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new Exception();
            }
            if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)) {
                System.out.println("Đây là tam giác !");
                throw new Exception();
            }
            return "Là Hình Tam Giác";
        } catch (Exception e) {
            e.printStackTrace();
            return "Không phải là hình tam giác";
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle());
    }
}
