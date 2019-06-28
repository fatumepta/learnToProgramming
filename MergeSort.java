import java.util.Arrays;


public class MergeSort {
    public static void main(String[] args) {
//        MergeSort ms = new MergeSort();
//        int[] a1 = new int[]{0, 2, 2};
//        int[] a2 = new int[]{1, 3};
//
//        int[] merged = ms.mergeSort(a1, a2);
//        System.out.println(Arrays.toString(merged));
    }

    private int[] mergeSort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aidx, bidx;

        bidx = aidx = 0;
        for (int i = 0; i < c.length; i++) {

            if (aidx < a.length & bidx < b.length) {
                if (a[aidx] < b[bidx]) {
                    c[i] = a[aidx++];
                } else {
                    c[i] = b[bidx++];
                }

            } else if (aidx < a.length & bidx == b.length) {
                c[i] = a[aidx++];
            } else if (aidx == a.length & bidx < b.length) {
                c[i] = b[bidx++];
            }
        }

        return c;
    }
}
