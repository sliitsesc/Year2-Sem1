package question4;

public class GarageGateOpen implements Command {

	GarageGate garageGate;
	
	public GarageGateOpen(GarageGate garageGate) {
		this.garageGate = garageGate;
	}
	
	@Override
	public void execute() {
		garageGate.Open();
	}

}
