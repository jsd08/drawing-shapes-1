public class Shapes {
    public static void main(String[] args) {
    
        Turtle turtle = new Turtle();
    
        // Task 1: Draw a regular shape
        for(int i = 0 ; i < 4 ; i++ )
        {
         turtle.forward(50);  
         turtle.left(90);
        }

        // Task 2: Draw a regular shape many times
        for(int x = 0; x < 3; x++)
        {
            for(int i = 0 ; i < 4 ; i++ )
            {
                turtle.forward(40);
                turtle.left(90);
            }
            turtle.left(30);
        } 

        // Task 3: How many times does Turtle turn!
        int turns = 0;
        for(int i = 0; i < 6; i++)
        {
            turtle.left(60);
            turns = turns + 1; 
        }
        System.out.println("It turned: " + turns + " times");

        // Extension 1:


        // Extension 2:

    }
}
