import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        Integer[] ints = {0,1,2, 15,3,4,5,8,6,7};
        String intsStringSorted = sort(ints);
        System.out.println(intsStringSorted);
    }

    public static String sort(Integer[] ints){

        for (int i =0; i< ints.length-1;i++) {
            for (int j =0; j< ints.length-1;j++) {
            if (ints[j].compareTo(ints[j+1])==1) {
                swap(ints, j,j+1);
            }}}
        return Arrays.toString(ints);
    }

    private static void swap(Integer[] ints, int i, int j) {
        int a =ints[i];
        int b =  ints[j];
        ints[i]=b;
        ints[j]=a;
    }
}
