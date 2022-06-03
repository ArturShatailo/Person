public class Person
{

    private final String name;
    private final String surname;
    private final int age;
    private double weight;
    private double height;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setWeight() {
        this.weight = age <= 10
                ? Tech.getRandomDouble(20.0, 40.0)
                : age < 19 ? Tech.getRandomDouble(40.0, 80.0) : Tech.getRandomDouble(50.0, 130.0);
    }

    public void setHeight() {
        this.height = age <= 10
                ? Tech.getRandomDouble(1.0, 1.5)
                : age < 19 ? Tech.getRandomDouble(1.5, 1.8) : Tech.getRandomDouble(1.6, 2.2);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return name+" "+surname+" (age: "+age+", weight: "+weight+", height: "+height+")";
    }

}
