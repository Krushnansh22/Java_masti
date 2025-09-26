import java.util.Scanner;

class Adder {
    int[] arr;
    int targetSum;

    // Constructor
    Adder(int[] inputArr) {
        arr = inputArr;
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        targetSum = sc.nextInt();
    }

    int[] numSum() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[0];
    }
}

class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements (space separated): ");
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Adder adder = new Adder(arr);
        adder.getData();
        int[] result = adder.numSum();
        if (result.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.print("Pair found: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}