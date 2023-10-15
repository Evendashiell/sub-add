import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        int x, y, sub, add;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the number");
        x = myObj.nextInt();
        System.out.println("Input another number");
        y = myObj.nextInt();

        add = x + y;
        System.out.println("Sum is " + add);

        sub = x - y;
        System.out.println("substraction is " + sub);

    }
    
}
