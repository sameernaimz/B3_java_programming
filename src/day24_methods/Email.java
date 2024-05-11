package day24_methods;

public class Email {
    public static void main(String[] args) {
        buildEmail("Micky Mouse","Gmail");

    }
        public static void buildEmail(String fulName, String domain) { // non-parameterized method

        String email = fulName.toString().charAt(0) + ""  + fulName.toLowerCase().substring(fulName.indexOf("") + 1)
                +"@"
                + domain.toLowerCase();
            System.out.println(email);

    }
    }
