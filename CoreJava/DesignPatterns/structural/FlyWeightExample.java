package Design_pattern.structural;

import java.util.HashMap;
// Flyweight means reuse existing objects and create new object when  object requirement  is not exising 
interface Pen 
{   
    public void setColor(String color);
    public void draw(String content); 
}
enum BrushSize {
    THIN, MEDIUM, THICK
}
class ThickPen implements Pen {
    
    final BrushSize brushSize = BrushSize.THICK;    //intrinsic state - shareable
    private String color = null;                    //extrinsic state - supplied by client
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing THICK content in color : " + color+ "  "+content);
    }
}
class ThinPen implements Pen {
    
    final BrushSize brushSize = BrushSize.THIN;
    private String color = null; 
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing THIN content in color : " + color);
    }
}
class MediumPen implements Pen {
    
    final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null; 
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
// Pen Factory to create different pen
class PenFactory 
{
    private static final HashMap<String, Pen> pensMap = new HashMap<>();
 
    public static Pen getThickPen(String color) 
    {
        String key = color + "-THICK";
         
        Pen pen = pensMap.get(key);
         
        if(pen != null) {
            return pen;
        } else {
            pen = new ThickPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
         
        return pen;
    }
    public static Pen getThinPen(String color) 
    {
        String key = color + "-THIN";
         
        Pen pen = pensMap.get(key);
         
        if(pen != null) {
            return pen;
        } else {
            pen = new ThinPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
         
        return pen;
    }
     
    public static Pen getMediumPen(String color) 
    {
        String key = color + "-MEDIUM";
         
        Pen pen = pensMap.get(key);
         
        if(pen != null) {
            return pen;
        } else {
            pen = new MediumPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
         
        return pen;
    }
}

public class FlyWeightExample {
public static void main(String[] args) {
	Pen yellowThickPen1 = PenFactory.getThickPen("YELLOW");  //created new pen
    yellowThickPen1.draw("Hello World !!");
     
    Pen yellowThickPen2 = PenFactory.getThickPen("GREEN");  //pen is shared
    yellowThickPen2.draw("Hello World !!");
     
    Pen blueThinPen = PenFactory.getThinPen("BLUE");       //created new pen
    blueThinPen.draw("Hello World !!");
     
    System.out.println(yellowThickPen1.hashCode());
    System.out.println(yellowThickPen2.hashCode());
     
    System.out.println(blueThinPen.hashCode());
}
}
