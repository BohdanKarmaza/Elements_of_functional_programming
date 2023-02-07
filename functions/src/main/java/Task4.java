public class Task4 {
    public static void main(String[] args) {
        Expression lambdaEven = (n) -> n % 2 == 0;
        Expression lambdaOdd = (n) -> n % 2 != 0;

        int[] nums = {10, 21, 33, 44, 75, 67, 77, 80, 99};

        int a = sum(nums, lambdaEven);
        int b = sum(nums, lambdaOdd);

        System.out.println(a);
        System.out.println(b);
    }
        interface Expression {
            boolean isEqual(int n);
        }
        private static int sum(int[] numbers, Expression func)
        {
            int result = 0;
            for (int i : numbers) {
                if (func.isEqual(i))
                    result += i;
            }
            return result;
        }

}

