package Design_pattern.Creational;



abstract class Garden {
	public abstract Plant getCenter();
	public abstract Plant getBorder();
	public abstract Plant getShade();
 }


class Plant {
	String name;
	public Plant(String pname) {
		name = pname; //save name
	}
	public String getName() {
		return name;
	}
}

class VegieGarden extends Garden {
	@Override
	public Plant getShade() {
		return new Plant("Broccoli");
	}
	@Override
	public Plant getCenter() {
		return new Plant("Corn");
	}
	@Override
	public Plant getBorder() {
		return new Plant("Peas");
	}
}
class AnnualGarden extends Garden {
	@Override
	public Plant getShade() {
		return new Plant("SunFlower");
	}
	@Override
	public Plant getCenter() {
		return new Plant("Jasmine");
	}
	@Override
	public Plant getBorder() {
		return new Plant("Tulsi");
	}
}
class PerennialGarden extends Garden {
	@Override
	public Plant getShade() {
		return new Plant("Neem");
	}
	@Override
	public Plant getCenter() {
		return new Plant("Rose");
	}
	@Override
	public Plant getBorder() {
		return new Plant("Cactus");
	}
}

//create subclass PerennialGarden
//create subclass  AnnualGarden 
class GardenMaker { 
    //Abstract Factory which returns one of three gardens
	private Garden gd;
	public Garden getGarden(String gtype) {
		 //default
		if(gtype.equals("Perennial"))
			gd = new PerennialGarden();
		if(gtype.equals("Annual"))
			gd = new AnnualGarden();
		else
			gd = new VegieGarden();
		return gd;
	}
}


class AbstractFactoryExample{
	public static void main(String args[]){
		GardenMaker gardenmaker=new GardenMaker();
		Garden gd=gardenmaker.getGarden("Annual");
		Plant plant=gd.getBorder();
		System.out.println(plant.getName());		
	}
}
