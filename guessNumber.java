import java.util.Random;
public class guessNumber {
    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();

    }

    public int modChoose(String input, int min, int max) {
        //input in android studio is a button
        int result = 0;
        if (input == "Easy mode") {
            min = 1;
            max = 10;
            result = getRandomNumberUsingNextInt(min, max);
        } else if (input == "Normal mode") {
            min = 1;
            max = 25;
            result = getRandomNumberUsingNextInt(min, max);
        } else if (input == "Hard mode") {
            min = 1;
            max = 50;
            result = getRandomNumberUsingNextInt(min, max);
        } else if (input == "customize") {
            result = getRandomNumberUsingNextInt(min, max);
        }
        return result;
    }

    public static void theme(String color){
        // color in android studio is a button
        if (color.equals("ocean")){
            // change color to blue
        }else if (color.equals("forest")){
            // change color to green
        }else if (color.equals("dessert")){
            // change color to yellow
        }if (color.equals("default")){
            // change color to default color white
        }
    }


    public String guess(String mod,int input){
        //in Android Studio it should only need to consider the matching of user input numbers and random numbers.
        input = 0;
        int min = 0;
        int max = 0;
        if (mod.equals("Easy mode")){
            min = 1;
            max = 10;
            int guessTime = 8;
        }else if (mod.equals("Normal mode")){
            min = 1;
            max = 25;
            int guessTime = 8;
        }else if (mod.equals("Hard mode")){
            min = 1;
            max = 50;
            int guessTime = 5;            
        for (int t = 0;t<=guessTime;t++){
            if (input == modChoose(mod,min,max)){
                System.out.println("You win");
            }else {
                System.out.println("You lose");
            }
        }
        }
        return null;
    }
    
    public String continueorStop(String input){
        if (input.equals("continue")){
            //The game should Start over but record the score
        }else if (input.equals("Stop")){
            //The game will end immediately and the score will be displayed.
        }
        return null;//return null just for now, there will have result when connect to Android Studio
    }

}
