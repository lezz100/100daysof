public class Encyption {
    public static void main(String[] args) {
        String text = "Hey let the grind continue";

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                // Shift the character by 1
                chars[i] = (char) (chars[i] + 1);

                // Check if the character goes beyond 'z' or 'Z'
                System.out.print(chars[i]);
            }
        }

        System.out.println(text);
    }
}
