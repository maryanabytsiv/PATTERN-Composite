package main;

import group.GroupComponent;

public class Main {
	
	public static void main(String[] args) {
		
		IGroupComponent mainGroup = new GroupComponent("IT Academy");
		
		IGroupComponent dev = new GroupComponent("Develop");
		mainGroup.addComponent(dev);
		IGroupComponent QC = new GroupComponent("QC");
		mainGroup.addComponent(QC);
		IGroupComponent UIX = new GroupComponent("UIX");
		mainGroup.addComponent(UIX);
		
//		System.out.println(mainGroup.gatherData());
		
		IGroupComponent java = new GroupComponent("java");
		dev.addComponent(java);
		
		IGroupComponent lv159 = new LeafGroup("lv159");
		java.addComponent(lv159);
		
		IGroupComponent andr = new GroupComponent("Andr");
		dev.addComponent(andr);
		IGroupComponent net = new GroupComponent("net");
		dev.addComponent(net);
		
//		System.out.println(dev.gatherData());
		
		IGroupComponent mqc = new GroupComponent("mqc");
		QC.addComponent(mqc);
		
		IGroupComponent atqc = new GroupComponent("atqc");
		QC.addComponent(atqc);
		
//		System.out.println(QC.gatherData());
		
		IGroupComponent leafUIX = new LeafGroup("lv150");
		UIX.addComponent(leafUIX);
		System.out.println(mainGroup.gatherData());
		
		leafUIX.addComponent(new GroupComponent("new"));
		
	}

}
