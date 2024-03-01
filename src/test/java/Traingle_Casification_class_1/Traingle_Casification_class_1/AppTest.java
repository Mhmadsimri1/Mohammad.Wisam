package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	

@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
       assertEquals(expected, result.toString());
    }
	@Test
	public void check_Scalene(){
        int a = 2;
        int b = 2;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	 
	    @Test
	    public void check_NotTriangle(){
	        int a = 1;
	        int b = 2;
	        int c = 4;
	        triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.Nottriangle.toString(); // טסט למצב של לא משולש
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result);
	    }

	    @Test
	    public void check_ScaleneValid(){
	        int a = 3;
	        int b = 4;
	        int c = 5;
	        triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.Scalene.toString(); // טסט למשולש שונה צלעות
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result);
	    }
	    @Test
	    public void testNotATriangleWithInequality() {
	        int a = 1;
	        int b = 10;
	        int c = 12;
	        triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.Nottriangle.toString();
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result);
	    }
	    
