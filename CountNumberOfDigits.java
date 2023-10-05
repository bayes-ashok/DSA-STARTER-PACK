class CountNumberOfDigits{
    static int count(int n){
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=6789456;
        System.out.println("The total number of digits is: "+count(n));
    }
}