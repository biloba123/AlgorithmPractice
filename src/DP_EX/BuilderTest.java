package DP_EX;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car {
	private String name;
	private String wheel;
	private float oilbox;
	private float body;

	protected Car(String name) {
		this.name = name;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public float getOilbox() {
		return oilbox;
	}

	public void setOilbox(float oilbox) {
		this.oilbox = oilbox;
	}

	public float getBody() {
		return body;
	}

	public void setBody(float body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + ", oilbox=" + oilbox + ", body=" + body + "]";
	}
}

abstract class Builder{
	protected Car mCar;

	public abstract void buildWheel();
	public abstract void buildOilbox();
	public abstract void buildBody();

	public Car getCar(){
		return mCar;
	}
}

class BMWBuilder extends Builder{

	public BMWBuilder() {
		mCar=new Car("BMW");
	}

	@Override
	public void buildWheel() {
		mCar.setWheel("xx wheel");
	}

	@Override
	public void buildOilbox() {
		mCar.setOilbox(45.0f);
	}

	@Override
	public void buildBody() {
		mCar.setBody(5.2f);
	}
}

class BenZBuilder extends Builder{

	public BenZBuilder() {
		mCar=new Car("BenZ");
	}

	@Override
	public void buildWheel() {
		mCar.setWheel("xxx wheel");
	}

	@Override
	public void buildOilbox() {
		mCar.setOilbox(48.0f);
	}

	@Override
	public void buildBody() {
		mCar.setBody(6.2f);
	}
}

class Director{
	private Builder mBuilder;

	public Director(Builder builder) {
		mBuilder = builder;
	}

	public void setBuilder(Builder builder) {
		mBuilder = builder;
	}

	public void productCar(){
		mBuilder.buildWheel();
		mBuilder.buildOilbox();
		mBuilder.buildBody();
	}
}

