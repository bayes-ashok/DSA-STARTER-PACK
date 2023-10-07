/*
 * The code is based on Euclidean Algo to find H.C.F.
 */
import java.lang.Math;
public class HCF {
    static int calculateGCD(int a, int b){
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        int rem;
        while(true){
            rem=num1%num2;
            if(rem==0){
                return num2;
            }
            else{
                num1=num2;
                num2=rem;
            }
        }
    }
    public static void main(String[] args) {
        int a=64,b=96;
        int hcf=calculateGCD(a,b);
        System.out.println("The HCF is: "+hcf);
    }
}
