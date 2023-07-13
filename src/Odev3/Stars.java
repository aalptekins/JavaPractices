package Odev3;

public class Stars {
	
	public static String convertToStringWithStars(String text) {
        String result = "";
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            result += currentChar;

            if (i < length - 1) {
                char nextChar = text.charAt(i + 1);
                if (isValidCharacter(currentChar) && isValidCharacter(nextChar)) 
                    result += "*";               
            }
        }

        return result;
    }

    private static boolean isValidCharacter(char c) {
        return c != ' ' && c != '.' && c != ',';
    }

    public static void main(String[] args) {
        String input = "I love Java, a lot.";
        String output = convertToStringWithStars(input);
        System.out.println(output);
    }
}
