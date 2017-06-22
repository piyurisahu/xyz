package com.piyuri.immutableClass;




interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
interface Drawable1{  
void draw();  
default void msg(){System.out.println("default method drable 1");}  
}  


class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");
}


   
}  
  
 
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle d=new Rectangle();  
		d.draw();  
		d.msg();

	}
	

}
