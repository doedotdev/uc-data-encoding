package kit;

/**
 * Created by benjamin.horn on 2/19/17.
 */
public class mtnbike extends bike {
    private String type;

    public mtnbike(){
        super();

    }
    public mtnbike(int set_size, int set_gears, int set_speed, String set_color, String set_brand){
        super(set_size, set_gears, set_speed, set_color, set_brand);
        this.type = "Not specified";
    }

    public void setType(String desc){
        this.type = desc;
    }

    public void printMtnBikeStats(){
        super.printBikeStats();
        System.out.println("Type: " + this.type);
    }
}
