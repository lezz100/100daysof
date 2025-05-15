/* public class FindDuplicates {
    public static void main(String[] args){
        String sentence = "How many duplicates are there?";

        String characters = "";
        String duplicates = "";
        for (int i = 0; i < sentence.length(); i++) {
            // Check if the character is already in the string
            String current = Character.toString(sentence.charAt(i));
            if(characters.contains(current)){
                if(!duplicates.contains(current)){
                    duplicates += current + " , ";  
                }
            }
            characters += current;
            System.out.println(duplicates);
        }
    }
}

 */
//More cleaner code
public class FindDuplicates {
    public static void main(String[] args) {
        String sentence = "How many duplicates are there?";

        String characters = "";
        String duplicates = "";

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));

            if (characters.contains(current)) {
                if (!duplicates.contains(current)) {
                    duplicates += current + ", ";
                }
            }

            characters += current;
        }

        // Remove the last comma and space if duplicates string is not empty
        if (!duplicates.isEmpty()) {
            duplicates = duplicates.substring(0, duplicates.length() - 2);
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}
