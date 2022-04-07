public class App {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the Closet class
        Closet closet = new Closet("Ëscuter", "Wood", "Brown", 5, 2, 10);
        // Print the name of the closet
        System.out.println(closet.getName());
        // Print the material of the closet
        System.out.println(closet.getMaterial());
        // Print the color of the closet
        System.out.println(closet.getColor());
        // Print the length of the closet
        System.out.println(closet.getLength());
        // Print the width of the closet
        System.out.println(closet.getWidth());
        // Print the height of the closet
        System.out.println(closet.getHeight());

        // Create a new instance of the Stool class
        Stool stool = new Stool("Sïllant", "Wood", "White", 4, true);
        // Print the name of the stool
        System.out.println(stool.getName());
        // Print the material of the stool
        System.out.println(stool.getMaterial());
        // Print the color of the stool
        System.out.println(stool.getColor());
        // Print the number of legs of the stool
        System.out.println(stool.getNumberOfLegs());
        // Print the foldable of the stool
        System.out.println(stool.getFoldable());

        // Create a new instance of the Table class
        Table table = new Table("Toublë", "Steel", "Grey", 5, 1, 1, 4, true);






        
    }
}
