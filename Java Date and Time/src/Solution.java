import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int d = in.nextInt();
        int y = in.nextInt();

        in.close();

        LocalDate dt = LocalDate.of(y, m, d);

        System.out.print(dt.getDayOfWeek());

    }
}
