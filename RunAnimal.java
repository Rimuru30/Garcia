import java.util.Scanner;
public class RunAnimal{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String b = new String("B");
		String c = new String("C");
		String d = new String("D");

		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String input = sc.nextLine();

		if(input.equalsIgnoreCase(b)){
			Bird bird = new Bird();
			bird.eat();
			bird.sleep();
			bird.makeSound();
		
		}else if(input.equalsIgnoreCase(c)){
			Cat cat = new Cat();
			cat.eat();
			cat.sleep();
			cat.makeSound();
		
		}else if(input.equalsIgnoreCase(d)){
			Dog dog = new Dog();
			dog.eat();
			dog.sleep();
			dog.makeSound();
		
		}else
		{
			System.out.println("Invalid Input!");
		}
	}
}
