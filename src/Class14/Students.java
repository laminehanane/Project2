package Class14;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/
    String name;
    int ID;
    static int numberOfSt;

    public static void main(String[] args) {
        Students St1= new Students();
        St1.ID=12;
        St1.name="hanane";
        St1.name="yannis";
        Students.numberOfSt++;

        Students St2= new Students();
        St2.ID=123;
        St2.name="souf";
        St2.name="janna";
        Students.numberOfSt++;

        Students St3= new Students();
        St3.ID=1234;
        St3.name="fatima";
        St3.name="israa";
        Students.numberOfSt++;

        System.out.println("Number students is "+numberOfSt);

    }










}
