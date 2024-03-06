

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //2D array = an array of arrays
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverdo";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        cars[2][0] = "Allion";
        cars[2][1] = "Premio";
        cars[2][2] = "Fielder";

        for (int i =0; i<cars.length; i++){
            System.out.println();
            for(int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j]);

            }
        }



        //ANOTHER METHOD

        String myCars[][] = { {"Camaro", "Corvette", "Silverdo"},
                              {"Mustang", "Ranger", "F-150"},
                              {"Allion", "Premio", "Fielder"}};




        for (int i =0; i<myCars.length; i++){
            System.out.println();
            for(int j = 0; j<myCars[i].length; j++){
                System.out.print(myCars[i][j]);

            }
        }






    }
}