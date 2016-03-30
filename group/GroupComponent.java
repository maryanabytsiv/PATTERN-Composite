package group;

import java.util.ArrayList;
import java.util.List;

import main.IGroupComponent;

public class GroupComponent implements IGroupComponent{

	public String name;
	public List<IGroupComponent> groupComponents = new ArrayList<IGroupComponent>();
	
	public GroupComponent(String name) {
		this.name = name;
	}
	
	@Override
	public String gatherData() {

		String out = "";
		out = out + name + " > ";
		for (IGroupComponent groupComponent : groupComponents) {
			out = out + groupComponent.gatherData();
		}
		return  out + "\n            ";
	}

	@Override
	public void addComponent(IGroupComponent group) {
		this.groupComponents.add(group);
		
	}

}
