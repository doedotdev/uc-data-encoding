package kit;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class prime {
    private int value;

    public prime() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Boolean isPrimeFaster(){
        if(value == 0 || value == 1){
            return false;
        }
        else if(value == 2){
            return true;
        }
        else if(value %2 == 0){
            return false;
        }
        else{
            for(int i = 3; i*i <= value; i = i + 2 ){
                if(value%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean isPrimeSlow(){
        if(value == 0 || value == 1){
            return false;
        }
        else if(value == 2){
            return true;
        }
        else{
            for(int i = 2; i < value; i++ ){
                if(value%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    void printSlow(int limit){
        System.out.print("[");
        for(int i = 0; i < limit; i++){
            setValue(i);
            if(isPrimeSlow() == true){
                System.out.print(i + ", ");
            }
        }
        System.out.print("]");
    }

    void printFast(int limit){
        System.out.print("[");
        for(int i = 0; i < limit; i++){
            setValue(i);
            if(isPrimeFaster() == true){
                System.out.print(i + ", ");
            }
        }
        System.out.print("]");
    }
}
