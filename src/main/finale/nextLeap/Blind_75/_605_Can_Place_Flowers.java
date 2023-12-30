package main.finale.nextLeap.Blind_75;

public class _605_Can_Place_Flowers {

    public static void main(String[] args) {
        boolean canPlace = canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
        System.out.println(canPlace);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length && count < n; i++) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
}
