public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmil = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmil.getName() + " is " + bmil.getBMI() + " " + bmil.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("the BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
