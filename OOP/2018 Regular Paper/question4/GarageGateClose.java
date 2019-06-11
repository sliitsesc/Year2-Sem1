package question4;

public class GarageGateClose implements Command {

	GarageGate garageGate;
	
	public GarageGateClose(GarageGate garageGate) {
		this.garageGate = garageGate;
	}
	
	@Override
	public void execute() {
		garageGate.Close();

	}

}
