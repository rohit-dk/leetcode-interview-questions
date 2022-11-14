public class NumberOfOneBits {
    public int hammingWeight(int n){
        int count=0;
        while(n!=0){
            count+=n&1 ;
            n>>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfOneBits nb=new NumberOfOneBits();
        System.out.println(nb.hammingWeight(000000000000000000000000101));
    }
}
