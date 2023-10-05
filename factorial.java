/*
 * FOR THE TIME BEING WE WILL USE ITERATIVE METHOD ONLY,
 * AFTER WE FINISH ALL SORTS OF QUESTIONS FROM ITERATIVE,
 * WE WILL DO WITH RECURSION AS WELL
 */
class factorial{
    static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5; //can take user input using Scanner as well, for now, we will find factorial of 5
        System.out.println("The factorial is: "+fact(n));
    }
}