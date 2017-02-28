package kit;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class table {
    private int mod;

    public table() {
        this.mod = 0;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public void addTable(){
        System.out.print("+");
        int modulus = mod;
        for (int i = 0; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 0; i < modulus; i++){
            System.out.print(i);
            for (int j = 0; j < modulus; j++)
                System.out.print(" " + ((i + j) % modulus));
            System.out.println();
        }
        System.out.println();
    }

    public void multTable(){
        int modulus = mod;
        System.out.print("x");
        for (int i = 0; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 0; i < modulus; i++){
            System.out.print(i);
            for (int j = 0; j < modulus; j++)
                System.out.print(" " + ((i * j) % modulus));
            System.out.println();
        }
        System.out.println();
    }

    void powTable(){
        int modulus = mod;
        System.out.print("^");
        for (int i = 2; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 1; i < modulus; i++){
            int power = i;
            System.out.print(i);
            for (int j = 2; j < modulus; j++){
                power = (power * i) % modulus;
                System.out.print(" " + power);
            }
            System.out.println();
        }
        System.out.println();
    }
}
