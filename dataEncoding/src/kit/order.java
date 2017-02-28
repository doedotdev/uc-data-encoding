package kit;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class order {
    private double value;
    private double mod;

    public order(double value, double mod) {
        this.value = value;
        this.mod = mod;
    }

    public double order(){
        double temp;
        for (double i = 1 ; i < mod; i++){
            temp = Math.pow(value,i);
            if(temp%mod == 1){
                //System.out.println("order" + i);
                return i;
            }
        }

        return -1;
    }
}
