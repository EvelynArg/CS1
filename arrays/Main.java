public class Main {
public static void update(int[] a) {
a[1] = a[0] + a[2];
a = new int[]{8, 8, 8};
a[0] = 99;
}
public static void main(String[] args) {
int[] nums = {2, 5, 6};
update(nums);
int sum = 0;
for (int i = 0; i < nums.length; i++) {
sum += nums[i];
}
System.out.println("First: " + nums[0]);
System.out.println("Second: " + nums[1]);
System.out.println("Sum: " + sum);
}
}