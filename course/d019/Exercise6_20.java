class Exercise6_20 {
    static int[] shuffle(int[] arr) {
        int a, b, temp, cnt = 0;
        while (true) {
            a = (int) (Math.random() * arr.length);
            b = (int) (Math.random() * arr.length);
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            cnt++;
            if (cnt > arr.length * arr.length) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}