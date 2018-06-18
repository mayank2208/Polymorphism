
package javaapplication29;
import static java.lang.System.*;

public class JavaApplication29 {
    
    abstract class Animal
{
	public abstract void sound();
}

class Cat extends Animal
{
	public void sound()
	{
		out.println("Meow..");
	}
	public void jump()
	{
		out.println("Cat is Jumping");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		out.println("Woof..");
	}
	public void run()
	{
		out.println("Dog is Running");
	}
}
class Snake extends Animal
{
	public void sound()
	{
		out.println("Hissss..");
	}
	public void crawl()
	{
		out.println("Snake is Crawling");
	}
}

abstract class RoundShape
{
	protected double radius;

	public abstract void area();
}

class Circle extends RoundShape
{
	public Circle(double r)
	{
		radius = r;
	}
	public void area()
	{
		out.printf("Area of Circle : %.2f\n",Math.PI*radius*radius);
	}
}

class Sphere extends RoundShape
{
	public Sphere(double r)
	{
		radius = r;
	}
	public void area()
	{
		out.printf("Area of Sphere : %.2f\n",4*Math.PI*radius*radius);
	}
}


    
    public static void main(String[] args) {
        
        Animal a;
		a = new Cat();

		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.sound();
		}
        
        
        
        
            }
    
}
