package com.masai;

public class ShapeDrawer {
	
	Shapes shape;
	
	ShapeDrawer(Shapes shape){
		this.shape = shape;
	}
	
	void invokeDraw() {
		shape.draw();
	}

}
