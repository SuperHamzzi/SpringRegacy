package com.fastcampus.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

class Car{
    String color;
    int oil;
    Engine engine;
    Door[] doors;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", oil=" + oil +
                ", engine=" + engine +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}
class Engine{}
class Door{}
public class SpringDiTest {
    public static void main(String[] args) {
        ApplicationContext  ac = new GenericXmlApplicationContext("config.xml");
        Car car = (Car) ac.getBean("car"); //byName
        Car car2 = (Car) ac.getBean(Car.class); //byName
        Engine engine = (Engine)  ac.getBean("engine");
        Door door = (Door) ac.getBean("door");
//
//        car.setColor("red");
//        car.setOil(100);
//        car.setEngine(engine);
//        car.setDoors(new Door[]{(Door)ac.getBean("door"), (Door)ac.getBean("door")});
        System.out.println("car = " + car);
    }
}

