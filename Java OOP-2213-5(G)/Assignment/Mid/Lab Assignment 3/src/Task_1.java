class SmartPhone {
	String name;
	int ram;
	double price;
	
	SmartPhone(){
		name = "Redmi 8";
        ram = 4;
        price = 12999.0;	
	}
	SmartPhone(String name, int ram, double price){
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    void display(){
        System.out.println("Smartphone Name: "+name);
        System.out.println("Smartphone Ram: "+ram+" GB");
        System.out.println("Smartphone Price: "+price);
        System.out.println();
    }

}

public class Task_1 {

    public static void main(String[] args) {

        SmartPhone phoneOne = new SmartPhone();
        phoneOne.display();

        SmartPhone phoneTwo = new SmartPhone("Redmi 9",6,14999.90);
        phoneTwo.display();

        SmartPhone phoneThree = new SmartPhone("Redmi 10",8,19999.49);
        phoneThree.display();
        
    }

}




































