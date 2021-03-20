package com.prashant;

public class DecoratorTest {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		circle.description();
		circle.isHide();
		circle.resize();
		System.out.println("==============================================");
		Shape fill = new FillColorDecorator(circle, Color.RED);
		Shape circle1 = new LineStyleDecorator(fill, LineStyle.DASH);
		circle1.draw();
		circle1.description();
		circle1.isHide();
		circle1.resize();
		
		
		Shape circle2 = new LineStyleDecorator(circle, LineStyle.DOT);
		circle2.description();
	}

}


interface Shape{
	void draw();
	String description();
	void resize();
	boolean isHide();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle : Draw()");
	}

	@Override
	public String description() {
		System.out.println("Recatngle : description");
		return "Rectangle Desciption";
	}

	@Override
	public void resize() {
		System.out.println("Recatngle : resize() ");		
	}

	@Override
	public boolean isHide() {
		System.out.println("Recatngle : isHide() ");
		return false;
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circel draw()");		
	}

	@Override
	public String description() {
		System.out.println("Circel description()");
		return "Circle Description";
	}

	@Override
	public void resize() {
		System.out.println("Circel resize()");		
	}

	@Override
	public boolean isHide() {
		System.out.println("Circel isHide()");
		return false;
	}
}

abstract class ShapeDecorator implements Shape{
	protected Shape shapeDecorated;
	
	ShapeDecorator(Shape deShape){
		super();
		System.out.println("ShapeDecorator constructor() ");
		this.shapeDecorated = deShape;
	}
}

enum Color {RED, GREEN, YELLOW, BLUE}

enum LineStyle {SOLID, DASH, DOT }

class FillColorDecorator extends ShapeDecorator {
	protected Color color;
	FillColorDecorator(Shape deShape, Color color) {
		super(deShape);
		System.out.println("FillCOlorDecorator constructor");
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("FillColorDecorator : ");
	}

	@Override
	public String description() {
		System.out.println("FillColorDecorator : description() : Color is : " + color.name());
		return "FillColorDecorator Description";
	}

	@Override
	public void resize() {
		System.out.println("FillColorDecorator : resize()");		
	}

	@Override
	public boolean isHide() {
		System.out.println("FillColorDecorator : isHIde() ");
		return false;
	}
}

class LineStyleDecorator extends ShapeDecorator{
	protected LineStyle lineStyle;
	
	LineStyleDecorator(Shape decoratedShape, LineStyle lineStyle){
		super(decoratedShape);
		System.out.println("LineStyleDecorator constructor");
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
		System.out.println("LineStyleDecorator : draw() ");
	}

	@Override
	public String description() {
		System.out.println("LineStyleDecorator : description() : Line style is : " + lineStyle.name());
		return "LineSTyleDecorator Description";
	}

	@Override
	public void resize() {
		System.out.println("LineStyleDecorator : resize() ");		
	}

	@Override
	public boolean isHide() {
		System.out.println("LineStyleDecorator : isHide() ");
		return false;
	}
}