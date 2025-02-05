public class LinearSearchArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, };
        int target = 4;
        boolean isfound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isfound = true;
                System.out.println("Element is found at index :" + i);
            }

        }
        if (!isfound) {
            System.out.println("The element is not found in the array");
        }
    }
}
