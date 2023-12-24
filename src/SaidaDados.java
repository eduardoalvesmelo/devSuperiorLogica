import java.util.Locale;

public class SaidaDados {
    private String product1;
    private String product2;
    private int age;
    private int code;
    private char gender;
    private double price1;
    private double price2;
    private double measure;

    public SaidaDados() { }

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public void saidaConsole(){
        System.out.println("Products:");
        System.out.printf(product1 + " which price is $ %.2f\n", price1);
        System.out.printf(product2 + " which price is $ %.2f\n\n", price2);
        System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
        System.out.printf("Mesue with eight decimal place: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }


}
