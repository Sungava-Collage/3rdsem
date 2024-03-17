class Outer {
    int x = 5;
    
    private class Inner {
        void display() {
            System.out.println("Value of x  = " + x);
        }
        
        void show() {
            Inner obj = new Inner();
            obj.display();
        }
    }
    
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Inner innerObj = outerObj.new Inner(); // Create Inner object using Outer instance
        innerObj.display(); // Display the value of x
    }
}
