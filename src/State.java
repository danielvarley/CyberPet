
public class State {

	int hunger;
	int tiredness;
	int boredness;
	
	void  feed(){
		if(hunger >= 5){
			hunger = hunger - 3; 
		}
		printState();
			
		}
	
	void play(){
		if(boredness >= 5){
			boredness = boredness-3;
			tiredness = tiredness +4;
			hunger = hunger +3;
		}
		printState();
	
	}
	
	void sleep(){
		if(tiredness >=5){
			tiredness = tiredness-5;
			boredness = boredness+3;
			hunger = hunger + 6;
		}
		printState();
		
	}
		
	void printState(){
		System.out.println("Current tiredness is " + tiredness);
		System.out.println("Current hunger is " + hunger);
		System.out.println("Current boredness is " + boredness);
		
	}
}
