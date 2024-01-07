package Class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr={new Apple("APPLE",250,100),
                new HP("HP",300,50),
                new Dell("DELL",400,75),
                new Lenovo("LENOVO",100,50)};
        for (Computer computer : arr) {
            computer.printInfo();
            computer.playVideo();
            computer.browseInternet();



        }
    }
}
