package DP_EX;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/14
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class OEM {
    public static void main(String[] args){
        Factory factory = new DellFactory();
        Laptop laptop = factory.productLaptop();
        laptop.work();
    }
}

abstract class Laptop{
    //笔记本品牌
    private String brand;

    protected Laptop(String brand){
        this.brand = brand;
    }

    public void work(){
        System.out.println(brand+"笔记本电脑正在运行");
    }

    public String getBrand() {
        return brand;
    }
}

class HPLaptop extends Laptop{
    public HPLaptop(){
        super("HP");
    }
}

class AcerLaptop extends Laptop{
    public AcerLaptop(){
        super("Acer");
    }
}

class LenovoLaptop extends Laptop{
    public LenovoLaptop(){
        super("Lenovo");
    }
}

class DellLaptop extends Laptop{
    public DellLaptop(){
        super("Dell");
    }
}

interface Factory{
    Laptop productLaptop();
}

class HPFactory implements Factory{

    @Override
    public Laptop productLaptop() {
        return new HPLaptop();
    }
}

class AcerFactory implements Factory{

    @Override
    public Laptop productLaptop() {
        return new AcerLaptop();
    }
}

class LenovoFactory implements Factory{

    @Override
    public Laptop productLaptop() {
        return new LenovoLaptop();
    }
}

class DellFactory implements Factory{

    @Override
    public Laptop productLaptop() {
        return new DellLaptop();
    }
}

