public class missingnumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr[arr.length-1];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int tot=n*(n+1)/2;
        System.out.println(tot-sum);
    }
}
