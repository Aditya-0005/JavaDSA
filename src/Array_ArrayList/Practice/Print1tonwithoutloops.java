package Array_ArrayList.Practice;

public class Print1tonwithoutloops {
    public static void main(String[] args) {
        int n;
        n = 10;
        call(n);
    }

    static int call(int n){
        if(n == 0){
            return 0;
        }
        call(n-1);
        System.out.print(n + " ");
        return 0;
    }
}
