import java.util.HashMap;
import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,String> replaceMap = new HashMap<>();
        replaceMap.put("i", "you");
        replaceMap.put("me", "you");
        replaceMap.put("my", "your");
        replaceMap.put("am", "are");

        System.out.println("Good day. What is your problem?");
        String response = "";

        do {
            System.out.println("Enter your response here or Q to quit: ");
            response = input.nextLine().toLowerCase();
            if (response.equals("q")) System.exit(1);
            String returnStr = "";
            for (String word : response.split(" ")) {
                if (replaceMap.containsKey(word)) {
                    returnStr += replaceMap.get(word) + " ";
                } else {
                    returnStr += word + " ";
                }
            }
            System.out.println(returnStr);
        } while (!response.equals("i am feeling great"));
    }
}