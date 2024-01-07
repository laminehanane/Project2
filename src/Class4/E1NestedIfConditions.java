package Class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {
boolean IsMaindooropened=true;
boolean isRoom1Opened=false;
boolean isRoom2Opened=true;
if (IsMaindooropened){
    if (isRoom1Opened){
        System.out.println(" we are in room 1");
    }else {
        System.out.println("room 1 is closed");
    }
    if (isRoom2Opened){
        System.out.println("we are in room 2");
    }else {
        System.out.println("room 2 is closed");
    }

    }else {
    System.out.println(" can't enter the house main door is closed");
    }
}}
