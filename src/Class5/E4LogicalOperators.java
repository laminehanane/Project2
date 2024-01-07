package Class5;

public class E4LogicalOperators {
    public static void main(String[] args) {
        boolean bringFlower=false;
        boolean bringChocolates=false;
        boolean allMyMistake=false;
        // true much stronger false.
        // if one condition is true the overall result is true .

        if (bringFlower||bringChocolates||allMyMistake){
            System.out.println("HomeMinister is Happy");
        }else {
            System.out.println("HomeMinister is angry");
        }
    }
}