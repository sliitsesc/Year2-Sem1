package question4;

public class MainApp4b {

	public static void main(String[] args) {
	
		MobileUI mobileUI = new MobileUI();
		
		Oven mainOven = new Oven("Main Oven");
		GarageGate garageGate = new GarageGate("Garage Gate");
		
		OvenOn onMainOven = new OvenOn(mainOven);
		OvenOff offMainOven = new OvenOff(mainOven);
		
		GarageGateOpen openGarageGate = new GarageGateOpen(garageGate);
		GarageGateClose closeGarageGate = new GarageGateClose(garageGate);
		
		mobileUI.setCommand(0, onMainOven);
		mobileUI.setCommand(1, offMainOven);
		mobileUI.setCommand(2, openGarageGate);
		mobileUI.setCommand(3, closeGarageGate);
		
		
		mobileUI.commandPressed(2);
		mobileUI.commandPressed(3);
		mobileUI.commandPressed(0);
		mobileUI.commandPressed(1);
	}

}
