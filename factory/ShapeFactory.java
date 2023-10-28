import java.util.HashMap;
import java.util.Map;

public class ShapeFactory implements IShapeFactory {

    Map<String, Shape> map = new HashMap<String, Shape>();  

    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
      this.map.getOrDefault(null, null);
      this.map.put("CIRCLE", new Circle());
      this.map.put("RECTANGLE", new Rectangle());
      this.map.put("SQUARE", new Square());

      return this.map.get(shapeType);
    }
}