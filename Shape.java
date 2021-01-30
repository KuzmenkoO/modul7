package dz7;

abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    public Circle() {
        super("Коло");
    }
}

class Oval extends Shape {
    public Oval() {
        super("Овал");
    }
}

class Cylinder extends Shape {
    public Cylinder() {
        super("Циліндр");
    }
}

class Triangle extends Shape {
    public Triangle() {
        super("Трикутник");
    }
}

class Quad extends Shape {
    public Quad() {
        super("Квадрат");
    }
}

class NameShape {
    public String nameShape(Shape shape) {
        return shape.getName();
    }
}

class Main {
    public static void main(String[] args) {
        Shape oval = new Oval();
        Shape circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Shape triangle = new Triangle();
        Quad quad = new Quad();
        NameShape name = new NameShape();
        System.out.println(name.nameShape(oval));
        System.out.println(name.nameShape(circle));
        System.out.println(name.nameShape(cylinder));
        System.out.println(name.nameShape(triangle));
        System.out.println(name.nameShape(quad));
    }


}
