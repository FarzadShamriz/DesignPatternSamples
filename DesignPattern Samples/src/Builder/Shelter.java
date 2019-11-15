package Builder;

public class Shelter {

	private String roof, structure, floor;

	public void setRoof(String roofShelter) {
		this.roof = roofShelter;
	}

	public void setStructure(String structureShelter) {
		this.structure = structureShelter;
	}

	public void setFloor(String floorShelter) {
		this.floor = floorShelter;
	}

	public String toStringShelter() {
		return ("Roof= " + this.roof + "\nStructure= " + this.structure + "\nFloor=" + this.floor);
	}

}
