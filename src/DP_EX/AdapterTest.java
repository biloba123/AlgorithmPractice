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
public class AdapterTest {
    public static void main(String[] args){
        Shape shape=new AngelAdapter(new Angel());
        shape.draw();
    }
}

interface Shape{
    void draw();
}

class  Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle");
    }
}

class  Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}

class  Line implements Shape{
    @Override
    public void draw() {
        System.out.println("line");
    }
}

class Angel{
    public void drawAngle(){
        System.out.println("angle");
    }
}

class AngelAdapter implements Shape{
    private Angel mAngel;

    public AngelAdapter(Angel angel) {
        mAngel = angel;
    }


    @Override
    public void draw() {
        mAngel.drawAngle();
    }
}
