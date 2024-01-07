package HomeWork;

public class User {
    //Write program: User that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass/child class  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.

String name;
String mobilenum;

    public User(String name, String mobilenum) {
        this.name = name;
        this.mobilenum = mobilenum;
    }
}
class userInfo extends User {
    String address;

    public userInfo(String name, String mobilenum, String address) {
        super(name, mobilenum);
        this.address = address;
    }


public void UserDetails(){
    System.out.println("UserDetails:");
    System.out.println(name);
    System.out.println(mobilenum);
    System.out.println(address);
}
}
