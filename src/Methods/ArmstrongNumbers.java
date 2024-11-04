package Methods;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        for(int i=1; i<1000000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int rem = 0;
        int ans = 0;

        while(n > 0){
            rem = n%10;
            ans = ans + (rem*rem*rem);
            n /= 10;
        }

        return temp == ans;
    }
}
