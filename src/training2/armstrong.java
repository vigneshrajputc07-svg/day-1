package training2;
public class armstrong {
    public static void main(String[] args) {

        int n = 1;
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}