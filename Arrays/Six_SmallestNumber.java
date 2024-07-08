package Arrays;

public class Six_SmallestNumber {

    // Function For Smallest Number
    public static int smallestNumber (int numbers[]) {
        int smallest = Integer.MAX_VALUE; // + infinity

        for(int i=0; i<numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("Smallest value is : " + smallestNumber(numbers));
    }
}