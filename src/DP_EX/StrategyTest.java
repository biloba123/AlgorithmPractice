package DP_EX;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/6/11
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class StrategyTest {
    public static void main(String[] args) {
        Salesclerk salesclerk=new Salesclerk(new ComputerDiscount());
        salesclerk.settleAccount(99);
    }
}

interface Discount{
    float calculate(float price);
}

class ComputerDiscount implements Discount{

    @Override
    public float calculate(float price) {
        return price*0.7f;
    }
}

class EnglishDiscount implements Discount{

    @Override
    public float calculate(float price) {
        return price*0.6f;
    }
}

class Salesclerk{
    private Discount mDiscount;

    public Salesclerk(Discount discount) {
        mDiscount = discount;
    }

    public void settleAccount(float price){
        System.out.println("需要支付"+mDiscount.calculate(price));
    }
}