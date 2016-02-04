package Advanced;

/**
 * Created by ramon on 03-02-16.
 */
public class FoodFactory {
    public Food getFood(String order) {
        Food food=null;
        if(order.equalsIgnoreCase("Pizza")){
            food = new Pizza();
        }else{
            food = new Cake();
        }
          return food;
    }
}
