package Builder;

public class BuilderMain {

	public static void main(String[] args) {

		Explorer explorer;
		Shelter hut, igloo;

		ShelterBuilder tropicalShelter = new TropicalShelter();
		ShelterBuilder polarShelter = new PolarShelter();

		explorer = new Explorer();

		explorer.setBuilder(tropicalShelter);
		explorer.constructShelter();
		hut = explorer.getShelter();
		System.out.print(hut.toStringShelter());
	}

}
