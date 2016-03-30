package main;

import java.util.List;

public class LeafGroup implements IGroupComponent{

	public String name;
	public List<IGroupComponent> groupComponents;
	
	public LeafGroup(String name) {
		this.name = name;
	}
	
	@Override
	public String gatherData() {
		
		return name + " | ";
	}

	@Override
	public void addComponent(IGroupComponent group) {
		System.out.println("can not add to leaf");
		
	}

}
