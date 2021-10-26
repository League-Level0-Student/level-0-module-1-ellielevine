package _05_for_loops._2_badgers;

public class Badger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int verse = 0; verse < 2; verse += 1) {
			String badger = "badger";
			for (int count = 0; count < 12; count += 1) {
				System.out.print(badger + ", ");
			}
			System.out.println();
			String mushroom = "Mushroom";
			for (int count = 0; count < 2; count += 1) {
				System.out.print(mushroom + ", ");
			}
			System.out.println();
		}
		System.out.println("A snake!!!");
	}

}
