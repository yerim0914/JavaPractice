package Test;

public interface Drawable { //abstract method만 가능 
	
	//int name = 1; // 자동으로 final 처리됨
	public abstract void draw(); 
	
}
interface Colorable {
	void drawColor();
	
}