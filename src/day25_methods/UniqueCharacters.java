package day25_methods;


import my_utilities.StringUtil;

/*
        Unique Characters

        create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

        Hint: use your frequency method to do some of the work

        Ex:
        Input:
            aaaaabcccdeeff

        Output:
            bd
     */
    public class UniqueCharacters {
        public static void main(String[] args) {

            System.out.println(uniqueCharacters("hello"));  // heo

            System.out.println(StringUtil.uniqueCharacters("Loopcamp"));

        }


        public static String uniqueCharacters (String str) {


            String unique = "";

            for (int i = 0; i < str.length(); i++) { // hello

                char eachLetter = str.charAt(i);


                if (StringUtil.frequencyOfCharacters(str, eachLetter) == 1) {
                    unique += eachLetter;
                }

            }

            return unique;
        }


    }

