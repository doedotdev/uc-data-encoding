package kit;

/**
 * Created by benjamin.horn on 2/19/17.
 */
public class bike {
    private String name;
    private int size;
    private int gears;
    private int speed;
    private String color;
    private String brand;

    public bike(){
        // default const
    }

    public bike(int set_size, int set_gears, int set_speed, String set_color, String set_brand){
        brand = set_brand;
        color = set_color;
        speed = set_speed;
        gears = set_gears;
        size = set_size;
    }

    public void changeSpeed(int change){
        this.speed = this.speed + change;
    }

    public void changeGears(int change){
        this.speed = this.gears + gears;
    }

    public void printBikeStats(){
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("speed: " + speed);
        System.out.println("gears :" + gears);
        System.out.println("size: " + size);
    }

}
