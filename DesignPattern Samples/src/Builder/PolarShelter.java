package Builder;

public class PolarShelter extends ShelterBuilder {

	@Override
	public void buildRoof() {
		shelterProduct.setRoof("Polar Roof");
	}

	@Override
	public void buildStructure() {
		shelterProduct.setStructure("Polar Structure");

	}

	@Override
	public void buildFloor() {
		shelterProduct.setFloor("Polar Floor");

	}

}
