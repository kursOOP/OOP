package geometry;

public class Line {

	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private boolean selected;
	
	public double length() {
		int dX = this.startX-this.endX;
		int dY = this.startY-this.endY;
		return Math.sqrt(dX*dX+dY*dY);		
	}
	
	public int getStartX() {
		return startX;
	}
	
	public void setStartX(int startX) {
		this.startX = startX;
	}
	
	public int getStartY() {
		return startY;
	}
	
	public void setStartY(int startY) {
		this.startY = startY;
	}
	
	public int getEndX() {
		return endX;
	}
	
	public void setEndX(int endX) {
		this.endX = endX;
	}
	
	public int getEndY() {
		return endY;
	}
	
	public void setEndY(int endY) {
		this.endY = endY;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
