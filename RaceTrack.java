class RaceTrack{
	public static void main(String[] args){
		Car c1=new Car(2016,"Porsche",40.0);
		System.out.println("Car's year model is :"+c1.getYear());
		System.out.println("Make of the car : "+c1.getMake());
		System.out.println("Speed :"+c1.getSpeed());
		
		c1.accelerate();
		System.out.println(c1.getSpeed());
		
	}
}