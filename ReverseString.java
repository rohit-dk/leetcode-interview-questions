class ReverseString {
    public void reverseString(char[] s){
        int startIndex=0;
        int endIndex=s.length-1;

        while(startIndex<endIndex){
            char tempChar=s[startIndex];
            s[startIndex]=s[endIndex];
            s[endIndex]=tempChar;

            startIndex++;
            endIndex--;
        }

        for(char tempChar : s){
            System.out.print(tempChar);
        }
    }
    public static void main(String[] args) {
        ReverseString rv=new ReverseString();
        char ca[]={'h','e','l','l','o'};
        rv.reverseString(ca);

    }
}
