package me.pattern.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		GBTwoPlug gbTwoPlug = new GBTwoPlug();
		ThreePlugIf three = new TwoPlugAdapter(gbTwoPlug);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		
		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();
	}
}
