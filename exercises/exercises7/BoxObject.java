package exercises7;

public class BoxObject {

	
		//has a height  int
		//has a width  int
		//has a name   String
		//has a length  int
		//has a color String
		
	public String name;
	public int height;
	public int weight;
	public boolean isOpen;
	public int length;
	public BoxObject(String name, int height, int weight, boolean isOpen, int length) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.isOpen = isOpen;
		this.length = length;
	}
	public boolean isOpen() {
		return isOpen;
	}
	
	public int volume() {
		return this.height*this.length *this.weight;
	}

	
	}

