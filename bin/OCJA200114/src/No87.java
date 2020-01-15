class Animal{
	String type = "Canine";
	int maxSpeed = 60;
	
	Animal(){}
	Animal(String type ,int maxSpeed){
		this.type =type;
		this.maxSpeed=maxSpeed;
	}
}

class WildAnimal extends Animal{
	String bounds;
	
	WildAnimal(String bounds){
		//line n1
	}
	WildAnimal(String type,int maxSpeed,String bounds){
		//line n2
	}
}
public class No87 {
	WildAnimal wolf = new WildAnimal("Long");
	WildAnimal tiger = new WildAnimal("Feline",80,"short");
	
	System.out.println(wolf.type+" "+wolf.maxSpeed+ " ");
	System.out.println(tiger.type+" "+tiger.maxSpeed+ " ");
}
