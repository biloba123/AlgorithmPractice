package DP_EX;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/6/4
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class DecoratorTest {
    public static void main(String[] args){
        Sheep s=new HappySheep();
        s=new YellowAppleAteSheep(s);
        s=new RedAppleAteSheep(s);
        s.run();
    }
}

abstract class Sheep{
    private int life=5;

    public abstract void run();

    public void lossLife(){
        if(life>0){
            life--;
        }
    }

    public boolean isDead(){
        return life==0;
    }
}

class HappySheep extends Sheep{

    @Override
    public void run() {
        if (!isDead()) {
            System.out.println("喜羊羊在跑...");
        }else {
            System.out.println("喜羊羊已死。");
        }
    }
}

abstract class AppleAteSheep extends Sheep{
    private Sheep mSheep;
    protected String ability;

    public AppleAteSheep(Sheep sheep, String ability) {
        mSheep = sheep;
        this.ability = ability;
    }

    @Override
    public void run() {
        System.out.print(ability);
        System.out.print(' ');
        mSheep.run();
    }
}

class RedAppleAteSheep extends AppleAteSheep{

    protected RedAppleAteSheep(Sheep sheep) {
        super(sheep, "加上保护罩");
    }
}

class GreenAppleAteSheep extends AppleAteSheep{

    protected GreenAppleAteSheep(Sheep sheep) {
        super(sheep, "奔跑速度快");
    }
}

class YellowAppleAteSheep extends AppleAteSheep{

    protected YellowAppleAteSheep(Sheep sheep) {
        super(sheep, "会趟水");
    }
}



