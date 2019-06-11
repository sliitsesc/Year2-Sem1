package question4;

public class MobileUI {

	Command[] commands;
	
	public MobileUI() {
		commands = new Command[6];
		
		for (int i = 0; i<6 ; i++) {
			commands[i] = null;
		}
	}
	
	public void setCommand(int index,Command cmdObj) {
		commands[index] = cmdObj;
	}
	
	public void commandPressed(int index) {
		commands[index].execute();
	}
	
	
}
