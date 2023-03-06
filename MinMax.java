public class MinMax {


    public static void minMax(int[] a, int[] b){
        int n = a.length;
        int max_n = Integer.MIN_VALUE;
        int min_n = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max_n = Math.max(max_n,Math.max(a[i],b[i]));
            min_n = Math.max(min_n,Math.min(a[i],b[i]));
        }
        System.out.print(max_n*min_n);
    }

    public static void main(String args[]) {
        int[] a = {1,2,3,2,3,4,5,3,5,6,7,8};
        int[] b = {2,1,5,3,4,6,4,3,2,3,1,2};
        minMax(a,b);
        System.out.println("\n");
        int[] a1 = {1, 2, 6, 5, 1, 2};
        int[] b1 = {3, 4, 3, 2, 2, 5};
        minMax(a1,b1);
        System.out.println("\n");
        int[] a2 = {8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8};
        int[] b2 = {2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5};
        minMax(a2,b2);

    }
}