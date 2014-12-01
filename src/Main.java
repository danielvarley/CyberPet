import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){


		System.out.println("Welcome to CyberPet, name your fish!");
		String name = sc.nextLine();


		Pet fish = new Pet(name);
		System.out.println("Your fish is called " + name);

		fish.state.hunger = 5;
		fish.state.boredness = 5;
		fish.state.tiredness = 5;
		fish.state.printState();


		doRound(fish);

	}

	static void doRound(Pet f){
		System.out.println("To feed " + f.name + " type '1'");
		System.out.println("To play with " + f.name + " type '2'");
		System.out.println("To put " + f.name + " to sleep type '3'");

		String action = sc.nextLine();
		if(action.equals("1")){
			f.state.feed();
		}
		if(action.equals("2")){
			f.state.play();
		}
		if(action.equals("3")){
			f.state.sleep();
		}

		doRound(f);
	}
}
