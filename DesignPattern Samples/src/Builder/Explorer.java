package Builder;

public class Explorer {

	private ShelterBuilder builder;

	public void setBuilder(ShelterBuilder newBuilder) {
		this.builder = newBuilder;
	}

	public void constructShelter() {
		builder.buildShelter();
		builder.buildFloor();
		builder.buildRoof();
		builder.buildStructure();
	}

	public Shelter getShelter() {
		return builder.getShelter();
	}
}
