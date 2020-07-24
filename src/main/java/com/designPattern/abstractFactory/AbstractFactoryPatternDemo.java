package com.designPattern.abstractFactory;

/**
 * 使用FactoryProducer来获取AbstractFactory,
 * 通过传递类型信息来获取实体类的对象
 * */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
	//	获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
	//	获取形状为circle的对象
		Shape shape1 = shapeFactory.getShape("circle");
	//	调用circle的draw方法
		shape1.draw();

	//	获取Rectangle的对象
		Shape shape2 = shapeFactory.getShape("rectangle");
	//	调用rectangle的draw方法
		shape2.draw();

	//	获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

	}
}
