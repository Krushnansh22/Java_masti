// 1. Calculator class for basic arithmetic operations
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}

// 2. & 3. Number swapping operations
class NumberSwapper {
    // WAP to swap two numbers using third variable
    public void swapWithThirdVariable(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
    // WAP to swap two numbers without using third variable
    public void swapWithoutThirdVariable(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

// 4. Even/Odd checker
class EvenOddChecker {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public void checkEvenOdd(int number) {
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

// 5. Factorial calculator
class FactorialCalculator {
    public long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

// 6. Prime number checker
class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void checkPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

// 7. Prime number generator
class PrimeGenerator {
    private PrimeChecker primeChecker = new PrimeChecker();
    
    public void displayFirstNPrimes(int n) {
        System.out.println("First " + n + " prime numbers:");
        int count = 0;
        int number = 2;
        
        while (count < n) {
            if (primeChecker.isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
}

// 8. Number reverser
class NumberReverser {
    public int reverseNumber(int number) {
        int reversed = 0;
        boolean isNegative = number < 0;
        number = Math.abs(number);
        
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        
        return isNegative ? -reversed : reversed;
    }
    
    public void displayReversedNumber(int number) {
        int reversed = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}

// 9. Palindrome checker
class PalindromeChecker {
    private NumberReverser reverser = new NumberReverser();
    
    public boolean isPalindrome(int number) {
        return number == reverser.reverseNumber(number);
    }
    
    public void checkPalindrome(int number) {
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

// 10. Armstrong number checker
class ArmstrongChecker {
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(Math.abs(number)).length();
        int sum = 0;
        
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == Math.abs(originalNumber);
    }
    
    public void checkArmstrong(int number) {
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

// 11. Constructor types demonstration
class ConstructorDemo {
    private String name;
    private int value;
    
    // Default constructor
    public ConstructorDemo() {
        this.name = "Default";
        this.value = 0;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    public ConstructorDemo(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("Parameterized constructor called");
    }
    
    // Copy constructor
    public ConstructorDemo(ConstructorDemo other) {
        this.name = other.name;
        this.value = other.value;
        System.out.println("Copy constructor called");
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Value: " + value);
    }
}

// 12. Method types demonstration
class MethodTypesDemo {
    private int instanceVar = 10;
    private static int staticVar = 20;
    
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called. Instance variable: " + instanceVar);
    }
    
    // Static method
    public static void staticMethod() {
        System.out.println("Static method called. Static variable: " + staticVar);
    }
    
    // Method with parameters
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method with return type
    public String getMessage() {
        return "Hello from method with return type!";
    }
    
    // Method overloading
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}


public class JavaProgrammingTasks {
    public static void main(String[] args) {
        System.out.println("=== Java Programming Tasks Demonstration ===\n");
        
        // 1. Calculator demonstration
        System.out.println("1. Calculator Operations:");
        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        System.out.println();
        
        // 2. & 3. Number swapping
        System.out.println("2. & 3. Number Swapping:");
        NumberSwapper swapper = new NumberSwapper();
        swapper.swapWithThirdVariable(10, 20);
        swapper.swapWithoutThirdVariable(30, 40);
        System.out.println();
        
        // 4. Even/Odd checker
        System.out.println("4. Even/Odd Checker:");
        EvenOddChecker evenOdd = new EvenOddChecker();
        evenOdd.checkEvenOdd(15);
        evenOdd.checkEvenOdd(20);
        System.out.println();
        
        // 5. Factorial calculator
        System.out.println("5. Factorial Calculator:");
        FactorialCalculator factCalc = new FactorialCalculator();
        System.out.println("Factorial of 5 = " + factCalc.calculateFactorial(5));
        System.out.println("Factorial of 7 = " + factCalc.calculateFactorial(7));
        System.out.println();
        
        // 6. Prime checker
        System.out.println("6. Prime Number Checker:");
        PrimeChecker primeCheck = new PrimeChecker();
        primeCheck.checkPrime(17);
        primeCheck.checkPrime(20);
        System.out.println();
        
        // 7. First 10 prime numbers
        System.out.println("7. First 10 Prime Numbers:");
        PrimeGenerator primeGen = new PrimeGenerator();
        primeGen.displayFirstNPrimes(10);
        System.out.println();
        
        // 8. Number reverser
        System.out.println("8. Number Reverser:");
        NumberReverser reverser = new NumberReverser();
        reverser.displayReversedNumber(12345);
        System.out.println();
        
        // 9. Palindrome checker
        System.out.println("9. Palindrome Checker:");
        PalindromeChecker palindrome = new PalindromeChecker();
        palindrome.checkPalindrome(121);
        palindrome.checkPalindrome(123);
        System.out.println();
        
        // 10. Armstrong number checker
        System.out.println("10. Armstrong Number Checker:");
        ArmstrongChecker armstrong = new ArmstrongChecker();
        armstrong.checkArmstrong(153);
        armstrong.checkArmstrong(370);
        armstrong.checkArmstrong(123);
        System.out.println();
        
        // 11. Constructor types
        System.out.println("11. Constructor Types Demonstration:");
        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.display();
        
        ConstructorDemo obj2 = new ConstructorDemo("Custom", 100);
        obj2.display();
        
        ConstructorDemo obj3 = new ConstructorDemo(obj2);
        obj3.display();
        System.out.println();
        
        // 12. Method types
        System.out.println("12. Method Types Demonstration:");
        MethodTypesDemo methodDemo = new MethodTypesDemo();
        
        // Instance method call
        methodDemo.instanceMethod();
        
        // Static method call
        MethodTypesDemo.staticMethod();
        
        // Method with parameters and return value
        int sum = methodDemo.addNumbers(15, 25);
        System.out.println("Sum of 15 and 25: " + sum);
        
        // Method with return type
        String message = methodDemo.getMessage();
        System.out.println(message);
        
        // Method overloading demonstration
        System.out.println("Method Overloading:");
        System.out.println("multiply(5, 3) = " + methodDemo.multiply(5, 3));
        System.out.println("multiply(5.5, 3.2) = " + methodDemo.multiply(5.5, 3.2));
        System.out.println("multiply(2, 3, 4) = " + methodDemo.multiply(2, 3, 4));
    }
}