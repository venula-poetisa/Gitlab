public class CalculatorTest {
    public static void main (String []args){
        Calculator cal = new Calculator ();
        if (cal.add(2,3)==5){
            System.out.println("Test passed");
        } else{
            System.out.println("Test failed");
        }
    }
    
}
