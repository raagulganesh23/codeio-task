package Week2;

public class SecondLargest {
    public static void main(String[]args) {
        int[] arr = {14, 28, 19, 33, 45, 12};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        if (largest == secondLargest) {
            System.out.println("There is no second largest");
        }
        else{
            System.out.println(secondLargest);
        }

    }
}
