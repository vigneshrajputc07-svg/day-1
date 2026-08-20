package training4;



public class prog3 {

    public static void main(String[] args) {

        int n = 100000;

        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = i + 1;
        }

        int target = 1000;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (students[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println("Student found: " + found);
    }
}