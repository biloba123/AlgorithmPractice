package DP_EX;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/28
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class BridgeTest {
    public static void main(String[] args) {
        Coffee coffee=new MediumCoffee();
        coffee.setIngredient(new Milk());
        coffee.taste();
    }
}

abstract class Ingredient{
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Milk extends Ingredient{
    public Milk(){
        super("牛奶");
    }
}

class Suger extends Ingredient{
    public Suger(){
        super("糖");
    }
}

class Lemon extends Ingredient{
    public Lemon(){
        super("柠檬");
    }
}

abstract class Coffee{
    private Ingredient mIngredient;

    public abstract void taste();

    public void setIngredient(Ingredient ingredient) {
        mIngredient = ingredient;
    }

    @Override
    public String toString() {
        return "咖啡"+(mIngredient==null?"未加配料":"加了"+mIngredient.getName());
    }
}

class JorumCoffee extends Coffee{
    @Override
    public void taste() {
        System.out.println("大杯"+this);
    }
}

class MediumCoffee extends Coffee{
    @Override
    public void taste() {
        System.out.println("中杯"+this);
    }
}

class SmallCoffee extends Coffee{
    @Override
    public void taste() {
        System.out.println("小杯"+this);
    }
}