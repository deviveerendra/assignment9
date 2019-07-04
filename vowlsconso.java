public class vowlsconso {
        public static void main(String[] args) {
            int vowls = 0, cons = 0;
            String str = "what are you doing";

            str = str.toLowerCase();

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowls++;
                }
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                    cons++;
                }
            }
            System.out.println("Number of vowels: " + vowls);
            System.out.println("Number of consonants: " + cons);
        }
    }

