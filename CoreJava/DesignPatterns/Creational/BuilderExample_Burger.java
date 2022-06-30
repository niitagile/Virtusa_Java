package Design_pattern.Creational;

class Cake{
	String bread;
	String fruit;
	String flavour;
	boolean morecreamy=false;
	public boolean isMorecreamy() {
		return morecreamy;
	}
	public void setMorecreamy(boolean morecreamy) {
		this.morecreamy = morecreamy;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	@Override
	public String toString() {
		return "Cake [bread=" + bread + ", fruit=" + fruit + ", flavour="
				+ flavour + ", morecreamy=" + morecreamy + "]";
	}
	
	
	
}

class Baker{
	Cake cake=null;
	Baker(){
		this.cake=new Cake();
	}
	void addBread(String bread){
		cake.setBread(bread);
	}
	void addFruit(String fruit){
		cake.setFruit(fruit);
	}
	void addFlavour(String flavour){
		cake.setFlavour(flavour);
	}
	void addMoreCream(boolean morecreamy){
		cake.setMorecreamy(morecreamy);
	}
	
	Cake build(){
		return cake;
	}
	
}

public class BuilderExample_Burger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Baker baker=new Baker();
			baker.addBread("White");
			baker.addFruit("pineapple");
			baker.addMoreCream(true);
			Cake cake=baker.build();
			System.out.println(cake);
			
			
			
	}

}
