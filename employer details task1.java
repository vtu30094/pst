/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of salaries
        int N = sc.nextInt();

        // Store salaries
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            salaries.add(sc.nextInt());
        }

        // Increase each salary by 10%
        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> salary + (salary * 10 / 100))
                .collect(Collectors.toList());

        // Print updated salaries
        for (int salary : updatedSalaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }
}
