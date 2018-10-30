
import java.util.Comparator; 


public class Cuboid extends Rectangle implements Comparable<Object>{

	 int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
        super(iWidth,iLength);
		this.iDepth = iDepth;
    }
	
	
	
	public int getDepth() {
		return iDepth;
	   }
	
	public void setDepth(int iDepth) {
		   this.iDepth= iDepth;
	   }
	
	public double volume() {
        // A = w * l
        return this.iWidth * this.iLength * this.iDepth;
    }
	
	@Override
    public double area() {
        // A = w * l
        return 2*iDepth*(this.iWidth + this.iLength);
    }
	
	///THROW EXCEPTION IF PERIMETER CALLED
	@Override
    public double perimeter() throws UnsupportedOperationException{
	throw new UnsupportedOperationException("Unsupported Operation for Cuboid");
	}

	
	//compare to 
	@Override
	public int compareTo(Object o) {
		if( this.area() > ((Cuboid)o).area()) {
			return 1;
		}
			else if (this.area()<((Cuboid)o).area())
				return -1;
		else 
			return 0;
		}
	
	
	public class SortByArea implements Comparator<Cuboid>{

		SortByArea() {
			
		}
		@Override
		public int compare(Cuboid cube1, Cuboid cube2) {
			if (cube1.area() > cube2.area()) {
				return 1;
			} else if(cube1.area() < cube2.area()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
		
		
		public class SortByVolume implements Comparator<Cuboid>{

			SortByVolume() {
				
			}
			@Override
			public int compare(Cuboid cube1, Cuboid cube2) {
				if (cube1.volume() > cube2.volume()) {
					return 1;
				} else if(cube1.volume() < cube2.volume()) {
					return -1;
				} else {
					return 0;
				}
			}
	}
		
		
	}

	
	

