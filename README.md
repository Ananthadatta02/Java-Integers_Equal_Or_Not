  
# Integers Equal or Not - Java Program

## Description

This Java program is a simple command-line application that demonstrates the use of conditional statements and user input handling using the `Scanner` class. It compares two integers entered by the user and performs a basic arithmetic operation based on their equality.

- If the two numbers are equal, the program prints their **product**.
- If the two numbers are not equal, the program prints the **result of dividing** the first number by the second.

## Code

```java
package test_27_03_25;

import java.util.Scanner;

public class IntegersEqualOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = s.nextInt();
        System.out.println("Enter the Second Number");
        int b = s.nextInt();
        s.close();        
        if(a==b)
            System.out.println(a*b);
        else
            System.out.println(a/b);
    }
}
```

## Explanation

1. **Package Declaration**: 
   - `package test_27_03_25;` defines the package name for organizing Java classes.

2. **Import Statement**: 
   - `import java.util.Scanner;` imports the Scanner class to read input from the console.

3. **Main Class and Method**:
   - `IntegersEqualOrNot` is the main class containing the `main` method.
   - `main` is the entry point of any standalone Java application.

4. **User Input**:
   - A `Scanner` object `s` is created to read integers from the user.
   - The program prompts the user to input two integers: `a` and `b`.

5. **Conditional Logic**:
   - If `a` is equal to `b`, the product `a * b` is printed.
   - If `a` is not equal to `b`, the division `a / b` is performed and the result is printed.

6. **Closing the Scanner**:
   - The Scanner object is closed after taking inputs to avoid resource leaks.

## Sample Output

### Example 1: When numbers are equal
```
Enter the First Number
4
Enter the Second Number
4
16
```

### Example 2: When numbers are not equal
```
Enter the First Number
8
Enter the Second Number
2
4
```

## Note
- If the second number is zero when numbers are not equal, the program will throw an `ArithmeticException` due to division by zero.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Integers_Equal_Or_Not.git
```
