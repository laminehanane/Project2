package Class11;

public class T1 {
    public static void main(String[] args) {
        /*
Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”

 */
        String password="pass1234";
        String confirmPass="pass1234";
        String username="hanane";
       if (username.isEmpty() || password.isEmpty()){
           System.out.println("username or password cannot be empty");
       } else if (password.length()<8) {
           System.out.println("password too short");
       } else if (password.contains(username)) {
           System.out.println("password cannot contain username");
       } else if (!password.equals(confirmPass)) {
           System.out.println("password not match");
       }else {
           System.out.println("your username and password has been created");
       }
    }
}
