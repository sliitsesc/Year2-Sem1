package designPatterns;

/**
 * @author chamodshehanka on 6/13/2019
 * @project Demo
 **/

interface Shape{}

class Rectangle implements Shape{}
class Square implements Shape{}
class RoundedRectangle implements Shape{}
class RoundedSquare implements Shape{}

abstract class AbstractFactory{
    abstract Shape getShape(String type);
}

class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }else {
            return null;
        }
    }
}

class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }else if (type.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }else {
            return null;
        }
    }
}

class FactoryProducer{
    public static AbstractFactory getFactory(boolean rounded){
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}


