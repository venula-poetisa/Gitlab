public class CalculatorTest {
    public static void main (String []args){
        Calculator cal = new Calculator ();
        if (cal.div(6,2)==3){
            System.out.println("Test passed");
        } else{
            System.out.println("Test failed");
        }
    }
    
}
