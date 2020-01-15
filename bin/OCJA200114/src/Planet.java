

public class Planet {
	public String name;
	public int moons;
	
	 Planet(String name, int moons) {
		this.name = name;
		this.moons=moons;
	}
	 public static void main(String []args) {
			Planet [] planets = { new Planet("mercury",0),new Planet("venus",0),new Planet("Earth",1),new Planet("mars",2)};
					
			System.out.println(planets);
			System.out.println(planets[2]);
			System.out.println(planets[2].moons);
		}
}
