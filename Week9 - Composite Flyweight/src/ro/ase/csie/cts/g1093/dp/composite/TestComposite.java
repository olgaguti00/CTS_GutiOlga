package ro.ase.csie.cts.g1093.dp.composite;

public class TestComposite {

	public static void main(String[] args) {

		Group group1 = new Group("Red team");
		group1.addNode(new NPC("Solider1", 100));
		group1.addNode(new NPC("Solider2", 100));

		AbstractNode group2 = new Group("Blue team");
		group2.addNode(new NPC("Solider3", 150));
		group2.addNode(new NPC("Tank", 300));

		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("Level BOSS", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);

		levelGroup.attack("Superman");
		levelGroup.retreat();
		//move level boss to a new location
		levelGroup.getNode(0).move();

	}

}
