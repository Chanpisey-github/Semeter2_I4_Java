package tp09.Ex1;

public class MyClass {
    public static void main(String[] args) {
        int[] myNumbers = {};
        System.out.println("Min = " + minInArray(myNumbers));
    }

    /**
     * Find minimum element in given array of integer.
     * @param ar array of integer
     * @return minimum element
     * @throws NullPointerException in case ar is null
     * @throws IllegalArgumentException in case ar length is zero
     */
    static int minInArray(int[] ar) throws NullPointerException, IllegalArgumentException {
        if(ar == null) throw new NullPointerException("Array should not be null.");
        if(ar.length == 0) throw new IllegalArgumentException("Array should have at least one element.");
        int min = ar[0];
        for (int i : ar) {
            if (min > i) min = i;
        }
        return min;
    }
}
