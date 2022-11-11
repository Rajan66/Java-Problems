import java.util.Scanner;

public class Qno1 {
    public static void main(String[] args) throws Exception {
        int length, breadth;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextInt();

        area = length * breadth;
        System.out.println("Area of the rectangle" + area);
        sc.close();
    }
}
