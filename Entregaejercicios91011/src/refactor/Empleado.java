package refactor;


public class Empleado {
    private String name;
    private String category;
    private int age;

    private Empleado() {
    }

    public Empleado(String name, String category, int age) {
        this.name = name;
        this.category = category;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", age=" + age +
                '}';
    }
}
