import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

import org.junit.Test;


public class Tests {

	@Test //constructor
	public void Rectangle_Test() {
		Rectangle rect1 = new Rectangle(4,5);
		assertTrue(rect1 instanceof Rectangle);
	}
	
	@Test //getLength
	public void getLength_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		assertTrue(rect1.getLength() == 4);
	}
	
	@Test//setLength
	public void setLength_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		rect1.setLength(5);
		assertTrue(rect1.getLength() == 5);
	}

	@Test//getWidth
	public void getWidth_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		assertTrue(rect1.getWidth() == 5);
	}
    
	@Test//setWidth
	public void setWidth_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		rect1.setWidth(6);
		assertTrue(rect1.getWidth() == 6);
	}
	
	@Test//area
	public void area_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		assertTrue(rect1.area() == 20.0);
	}
	
	@Test //perimeter
	public void perimeter_Test() {
		Rectangle rect1 = new Rectangle(5, 6);
		assertTrue(rect1.perimeter() == 22.0);
	}
	
	
	@Test //compareTo
	public void RectangleCompareTo_Test() {
		Rectangle rect1 = new Rectangle(4, 5);
		Rectangle rect2 = new Rectangle(3, 4);
		Rectangle rect3 = new Rectangle(5, 6);
		ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
		rectList.add(rect1);
		rectList.add(rect2);
		rectList.add(rect3);
		Collections.sort(rectList);
		assertTrue(rectList.get(0).area() == 12);
		assertTrue(rectList.get(1).area() == 20);
		assertTrue(rectList.get(2).area() == 30);
	}
    
    
	
	//Cuboid Tests
	
	@Test//constructor
	public void Cuboid_Test() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1 instanceof Cuboid);
	}
    
	@Test//getLength
	public void getLength_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.getLength() == 3);
	}
	
	@Test//setLength
	public void setLength_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		cube1.setLength(6);
		assertTrue(cube1.getLength() == 6);
	}
	
	@Test//getWidth
	public void getWidth_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.getWidth() == 4);
	}
	
	@Test//setWidth
	public void CuboidsetiWidth_Test1() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		cube1.setWidth(2);
		assertTrue(cube1.getWidth() == 2);
	}
	
	@Test//getDepth
	public void getDepth_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.getDepth() == 5);
	}
	
	@Test//setDepth
	public void setDepth_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		cube1.setDepth(10);
		assertTrue(cube1.getDepth() == 10);
	}
	
	@Test//area of Cube
	public void area_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.area() == 94.0);
	}
	
	@Test//perimeter exception thrown
	public void CubePerimeter_Test() {
		boolean exc = false;
		try {
			Cuboid cube1 = new Cuboid(3, 4, 5);
			cube1.perimeter();
		} catch(UnsupportedOperationException unsupportedOperationException) {
			exc = true;
		}
		assertTrue(exc);
	}
	

	@Test//volume
	public void Volume_TestCube() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.volume() == 60.0);
	}
	
	@Test//compareTo Cuboids
	public void CompareTo_TestCube() {
			Cuboid cube1 = new Cuboid(3, 4, 5);
			Cuboid cube2 = new Cuboid(4, 5, 6);
			Cuboid cube3 = new Cuboid(1, 3, 12);
			ArrayList<Cuboid> cubeList = new ArrayList<Cuboid>();
			cubeList.add(cube1);
			cubeList.add(cube2);
			cubeList.add(cube3);
			Collections.sort(cubeList);
			assertTrue(cubeList.get(0).area() == 94.0);
			assertTrue(cubeList.get(1).area() == 102.0);
			assertTrue(cubeList.get(2).area() == 148.0);

		}
	
	
	
	
}