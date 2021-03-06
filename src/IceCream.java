/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{
    //create private variable
private int cost;

/**
 * Ice cream constructor
 * @param name name of ice cream
 * @param cost cost of ice cream
 */
    public IceCream(String name, int cost)
    {
        //store name of candy in the super class
        super(name);
        //initialize cost variable
        this.cost = cost;
    }

  /**
   * Returns details of ice cream with proper spacing
   * @return name and cost of ice cream
   */
@Override
    public String toString()
    {
     //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //create string storing cost in a string 
        String costLength = Integer.toString(this.getCost());
        //find spacing needed between name and cost in reciept by subtracting 30(total spaces) by 
        //length of name and length of cost
        int spacing = 30- super.getName().length() - costLength.length() - 1;
        //loop through an add a space each time up to "spacing" integer
     for(int i = 0; i < spacing ; i ++){
         output = " " +output ;
     }
     //return name of cookie along with cost
        return  this.getName() + output ;
    }

/**
 * Returns the cost of the ice cream
 * @return the cost of the ice cream
 */
    @Override
    public int getCost() {
        return Math.round(this.cost);
    }
    
}
