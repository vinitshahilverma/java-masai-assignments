package com.masai.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ShapeDrawer {
	
	@Autowired
	@Qualifier("Rectangle")
	private Shapes shape;
	
	
//	public ShapeDrawer(Shapes shape){
//		this.shape = shape;
//	}
//	
	public void invokeDraw() {
		shape.draw();
	}

}
