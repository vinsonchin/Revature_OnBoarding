import java.util.Arrays;

public class ProblemTwo {

    public int[] maxAndMin(int[] a) {

        int[] result = new int[2];
        result[0] = result[1] = a[0];

        for(int num: a) {
            if(num < result[0]) {
                result[0] = num;
            } else if (num > result[1]) {
                result[1] = num;
            }
        }

        return result;
    }

    public int missing(int[] a) {

        Arrays.sort(a);

        int first = a[1] - a[0];
        int second = a[2] - a[1];
        int difference;

        if(first == second || first == (a[3] - a[2])) {
            difference = first;
        } else {
            difference = second;
        }

        int result = a[0] - difference;

        for(int i = 1; i < a.length; i++) {
            if(a[0] + (difference * i) != a[i]) {
                result = a[0] + (difference * i);
                break;
            }
        }

        return result;
    }
}
