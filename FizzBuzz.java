import java.util.*;


public class FizzBuzz {
    public List<String> fizzBuzz(int n){

        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0)  list.add("FizzBuzz");
                else        list.add("Fizz");
            }
            else if(i%5==0) list.add("Buzz");
            else            list.add("" +i);
        }
        return list;


    }
    public static void main(String[] args) {
        FizzBuzz fb=new FizzBuzz();
        int n=15;
        System.out.println(fb.fizzBuzz(n));


    }
}
