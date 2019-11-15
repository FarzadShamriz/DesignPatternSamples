package Builder;

public class TropicalShelter extends ShelterBuilder {

	@Override
	public void buildRoof() {
		shelterProduct.setRoof("Tropical Roof");
	}

	@Override
	public void buildStructure() {
		shelterProduct.setStructure("Tropical Structure");

	}

	@Override
	public void buildFloor() {
		shelterProduct.setFloor("Tropical Floor");

	}

}
