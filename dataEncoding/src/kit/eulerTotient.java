package kit;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class eulerTotient {
    private int in_value;
    private int totient_number;

    public eulerTotient() {
    }

    public int getValue() {
        return in_value;
    }

    public void setValue(int in_value) {
        this.in_value = in_value;
    }

    public int euclidGCD(int a , int b){ // recursive get gcd of both
        if(b == 0){
            return a;
        }
        return euclidGCD(b, a%b);
    }

    public int getTotient_number() {
        if(in_value == 0){
            return 0;
        }
        totient_number = 1;
        System.out.print("[ 1 ");
        for(int i = 2; i < in_value; i++){
            if(euclidGCD(i,in_value) == 1){
                System.out.print(i + " ");
                totient_number ++;
            }
        }
        System.out.print("]");
        System.out.println();
        return totient_number;
    }

}
