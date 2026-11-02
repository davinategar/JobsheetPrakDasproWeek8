# Report: JOBSHEET 8 LOOPS 2

Name: Davina Tegar Putri Ervia

NIM: 264107020083

GitHub: https://github.com/davinategar

# 1. Learning Objectives

* Understand the concept of nested loops in algorithms
* Understand the flow of nested loops
* Recognize the syntax of nested loops
* Be able to apply nested loops to solve a simple case study.

# 2. Practicum

## 2.1 Experiment 1: Review of Loops 1

**Experiment Steps**

the code:

```
import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        sc.close();
    }
}
```

Result:

![result experiment1 n5 jobsheet8](result-experiment1-n5-jobsheet8.png)

![result-experiment1-n3-jobsheet8](result-experiment1-n3-jobsheet8.png)

![result-experiment1-n7-jobsheet8](result-experiment1-n7-jobsheet8.png)

**Question**

1. If the initialization ```i = 1``` is changed to ```i = 0``` without changing the condition, how many ```*``` characters are printed when ```n = 5```? Explain.

Answer:

There will be 6 asterisk (*) characters printed. Because the loop starts from ```i = 0``` and continues while ```i <= 5```. So, the loop runs 6 times (0, 1, 2, 3, 4, 5).

2. If the condition i <= n is changed to i < n, how many times does the loop run whenn = 5? Why is the result different?

Answer:

The loop runs 4 times. Because the loop starts from ```i = 1``` and stops when ```i``` reaches 5. The condition ```i < 5``` means that ```i``` must be less than 5, so the loop only runs for 1, 2, 3, and 4. 

3. Predict the output of the following code fragment when n = 9, then verify it by replacingthe FOR loop in your program and running it.

```
for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

Answer:

The output: ```2 4 6 8```. The loop starts from 2 and increases by 2 each time. It prints only even numbers that do not exceed 9. 

Modify this code so that it prints the odd positive numbers that do not exceed n.

```
for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

Output when n = 9: ```1 3 5 7 9``` 

4. Explain why changing the increment ```i++``` to ```i--``` (with the condition still ```i <= n```) makes the loop run endlessly.

Answer:

Because ```i--``` decreases the value of ```i``` by 1 in every loop. The value of i becomes smaller and always satisfies the condition ```i <= n```.

## 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)

**Experiment Steps**

the code:

```
import java.util.Scanner;

public class Rectangle07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int colums = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colums; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

Result:
