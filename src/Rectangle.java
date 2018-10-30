//Lauren Griffith
//CISC181-11 Midterm Fall2018

public class Rectangle extends Shape implements Comparable<Object> {
    int iWidth, iLength; //sides

 
    public Rectangle(int iWidth, int iLength) {
        this.iWidth =iWidth;
        this.iLength = iLength;
    }

    @Override
    public double area() {
        // A = w * l
        return this.iWidth * this.iLength;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (this.iWidth + this.iLength);
    }

   public int getWidth() {
	return iWidth;
   }
   
   public void setWidth(int iWidth) {
	   this.iWidth= iWidth;
   }
   
   public int getLength()
   {
	   return iLength;
   }
    
   public void setLength(int iLength) {
	   this.iLength=iLength;
   }

@Override
public int compareTo(Object o) {
	if( this.area() > ((Rectangle)o).area()) {
		return 1;
	}
		else if (this.area()<((Rectangle)o).area())
			return -1;
	else 
		return 0;
	}
}

	
    
    
    
    
