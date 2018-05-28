package DP_EX;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		FastFoodShop shop=new McDonalds();
		
		Hamburg hamburg=shop.sellHamburg();
		hamburg.taste();
		
		Cola cola=shop.sellCola();
		cola.drink();

	}

}

//Hamburg
abstract class Hamburg {
	private String name;

	protected Hamburg(String name) {
		this.name = name;
	}

	public void taste() {
		System.out.println(name + " tastes good!");
	}

	public String getName() {
		return name;
	}
}

class MDHamburg extends Hamburg{
	public MDHamburg() {
		super("McDonalds Hamburg");
	}
}

class KFCHamburg extends Hamburg{
	public KFCHamburg() {
		super("KFC Hamburg");
	}
}


//Cola
abstract class Cola {
	private String name;

	protected Cola(String name) {
		this.name = name;
	}

	public void drink() {
		System.out.println(name + " drinks good!");
	}

	public String getName() {
		return name;
	}
}

class MDCola extends Cola{
	public MDCola() {
		super("McDonalds Cola");
	}
}

class KFCCola extends Cola{
	public KFCCola() {
		super("KFC Cola");
	}
}


//Shop
interface FastFoodShop {
	Hamburg sellHamburg();
	Cola sellCola();
}

class McDonalds implements FastFoodShop{

	@Override
	public Hamburg sellHamburg() {
		return new MDHamburg();
	}

	@Override
	public Cola sellCola() {
		return new MDCola();
	}
	
}

class KFC implements FastFoodShop{

	@Override
	public Hamburg sellHamburg() {
		return new KFCHamburg();
	}

	@Override
	public Cola sellCola() {
		return new KFCCola();
	}
	
}
