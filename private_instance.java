package programs;
class Rectangles{
	private int length;
	private int width;
	public void setlength(int length){
		this.length = length;
	}
	public int getlength() {
		return length;
	}
	public void setwidth(int width){
		this.width = width;
	}
	public int getwidth() {
		return width;
	}
}
public class private_instance {
	public static void main(String[] args) {
		Rectangles r = new Rectangles();
		r.setlength(40);
		System.out.println("Length is "+r.getlength());
		r.setwidth(20);
		System.out.println("Width is "+r.getwidth());
	}
}
