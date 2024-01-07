package Class13;

public class Hw4 {
    //Create a method createEmail(). Based on values of
    // users firstName, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String firstname, String lastname,String emailType) {
        String email = firstname + lastname + "@"+emailType+".com";
        return email;
    }

    public static void main(String[] args) {
        Hw4 X = new Hw4();
        String create=X.createEmail("john","snow","gmail");
        System.out.println(create);
    }




}


