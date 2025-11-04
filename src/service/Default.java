import model.constructor.Car;
import model.inheritance.SoftwareWorker;

public class Default {
    public static void main(String[] args) {
        Car car4 = new Car();
        car4.setModel("Toyotta");

        SoftwareWorker softwareWorker=new SoftwareWorker();
        softwareWorker.setId(1);
        softwareWorker.setName("Edip İSMAİL");
        softwareWorker.setProgramLanguage("JAVA");

    }
}