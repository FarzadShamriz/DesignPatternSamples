package Builder;

public abstract class ShelterBuilder {

	protected Shelter shelterProduct;

	public Shelter getShelter() {
		return shelterProduct;
	}

	public void buildShelter() {
		shelterProduct = new Shelter();
	}

	public abstract void buildRoof();

	public abstract void buildStructure();

	public abstract void buildFloor();
}
