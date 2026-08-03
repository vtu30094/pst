import java.io.*;
import java.util.*;

class UserMainCode {

    public int isEven(int input1) {
        if (input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        int result = obj.isEven(input1);

        System.out.println(result);

        sc.close();
    }
}
