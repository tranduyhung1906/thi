package Phan1;

public class Phan1 {
        public static int tongsole(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                if (num % 2 != 0 && num <= 100) {
                    sum += num;
                }
            }
            return sum;
        }

}
