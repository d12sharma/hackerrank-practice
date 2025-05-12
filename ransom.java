import java.util.List;

public class ransom {
    class Result {

        /*
         * Complete the 'checkMagazine' function below.
         *
         * The function accepts following parameters:
         *  1. STRING_ARRAY magazine
         *  2. STRING_ARRAY note
         */

        public static void checkMagazine(List<String> magazine, List<String> note) {
            // Write your code here
            if(magazine.size()<note.size()){
                System.out.println("No");
                return;

            }
            for(String word : note){
                if(!magazine.contains(word)){
                    System.out.println("No");
                    return;
                }
                else{
                    magazine.remove(word);
                }
            }
            System.out.println("Yes");
        }

    }
}
