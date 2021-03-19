
class Person{
	
	
	private int age;
	private String name;
	private double distanceWalking;
	private boolean isAwake;
	private boolean isSleeping;
	private double walkingCapability;
	private boolean tired;
	private boolean hungry;
	private String friend;
	
	//Constructors
	public Person(int age){
		this.age = age;
		this.name = "Default";
		this.distanceWalking = 0;
		if (this.age > 59){
			this.walkingCapability = 4/(2*((this.age-55)/5));
			
		}
		else{
			this.walkingCapability = 4;
			
		}
		this.tired = false;
		this.hungry = false;
		this.isAwake = true;
		this.isSleeping = false;
	}
	public Person(int age,String name){
		this.age = age;
		this.name = name;
		this.distanceWalking = 0;
		if (this.age > 59){
			this.walkingCapability = 4/(2*((this.age-55)/5));
		}
		else{
			this.walkingCapability = 4;
		}
		this.tired = false;
		this.hungry = false;
		this.isAwake = true;
		this.isSleeping = false;
	}
	
	
	public void talk(String sentence){
		if (this.age>=2){
			System.out.println(sentence);
		}
	}
	
	public void eat(){
		if (this.hungry == true){
			this.hungry = false;
		}
		else{
			System.out.printf("No more room for food, %s is already full \n",this.name);
		}
	}
	
	public void needFood(){
		if (this.hungry == false){
			this.hungry = true;
			System.out.printf("%s is hungry \n",this.name);
		}
		else{
			System.out.printf("%s is already hungry \n",this.name);
		}
	}
	
	
	public void walk(double distance){
		if (this.tired == false && this.isSleeping == false){
			this.distanceWalking = distance;
			this.walkingCapability -= distance;
			System.out.printf("You walked %.2f kilometers \n", this.distanceWalking);
		}
		else{
			System.out.println("Cannot walk while tired or sleeping");
		}
		if (this.walkingCapability <= 0){
			this.tired = true;
		} 
	}
	
	
	public void sleep(){
		if (this.isAwake == true){
			this.isAwake = false;
			this.isSleeping = true;
			this.tired = false;
			this.distanceWalking = 0;
			if (this.age > 59){
				this.walkingCapability = 4/(2*((this.age-55)/5));
			}
			else{
				this.walkingCapability = 4;
			}
			
		}
		else {
			System.out.println("Already sleeping");
		}
	}
	
	
	public void awake(){
		if (this.isAwake == false){
			this.isAwake = true;
			this.isSleeping = false;
		}
		else{
			System.out.println("Already awake");
		}
	}
	
	
	public void grow(){
		this.age++;
		if (age>55 && age%5==0){
			this.walkingCapability = this.walkingCapability/2;
		}
	}
	
	
	public int getAge(){
		return this.age;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	
	public double getDistanceWalking(){
		return this.distanceWalking;
	}
	
	
	public double getWalkingCapability(){
		return this.walkingCapability;
	}
	
	
	public void getTired(){
		if (this.tired == true){
			System.out.printf("%s is tired \n", this.name);
		}
		else{
			System.out.printf("%s is not tired \n", this.name);
		}
	}
	
	 
	public void getHunger(){
		if (this.hungry == true){
			System.out.printf("%s is hungry \n", this.name);
		}
		else{
			System.out.printf("%s is full \n", this.name);
		}
	} 
		
	public void getAwakeorSleep(){
		if (this.isAwake == true && this.isSleeping == false){
			System.out.printf("%s is awake \n",this.name);
		}
		else if (this.isAwake == false && this.isSleeping == true){
			System.out.printf("%s is sleeping. Be queit! \n",this.name);
		}
	}	
	
	
	public void changeFriend(String friend){
		this.friend = friend;
	}
	
	
	public String getFriend(){
		return this.friend;
	}
	
	
	
}