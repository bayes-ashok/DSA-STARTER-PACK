public class LCM {
    static int calculateLCM(int num1,int num2){
        return ((num1*num2)/HCF.calculateGCD(num1,num2)); //imported static function to calculate GCD which we have already used before in HCF.java
    }
    public static void main(String[] args) {
        int num1=5;
        int num2=7;
        int lcm=calculateLCM(num1, num2);
        System.out.println("The LCM is: "+lcm);       
    }
}
