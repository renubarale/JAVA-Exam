class Car{
	private int year;
	private String make;
	private double speed;
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public double accelerate(){
		System.out.println("accelerate called!!");
		speed=1+speed;
		return speed;
	}
}

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