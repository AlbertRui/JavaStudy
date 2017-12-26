package me.pattern.adapter;
/**
 * 笔记本类
 * @author Administrator
 */
public class NoteBook {

	private ThreePlugIf plug;

	public NoteBook(ThreePlugIf plug) {
		super();
		this.plug = plug;
	}
	
	/**
	 * 使用插座充电
	 */
	public void charge() {
		plug.powerWithThree();
	}
	
}
