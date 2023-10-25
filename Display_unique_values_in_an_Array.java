import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findUniqueElements(arr);

        if (result.length == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    public static int[] findUniqueElements(int[] arr) {
        int n = arr.length;
        boolean[] isUnique = new boolean[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            isUnique[i] = true;
        }
        for (int i = 0; i < n; i++) {
            if (isUnique[i]) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        isUnique[i] = false;
                        isUnique[j] = false;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (isUnique[i]) {
                uniqueCount++;
            }
        }
        int[] uniqueElements = new int[uniqueCount];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (isUnique[i]) {
                uniqueElements[index] = arr[i];
                index++;
            }
        }

        return uniqueElements;
    }
}
