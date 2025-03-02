Public class Animal {
    private String name;
    private String gender;
    private int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {

        return "Animal [Name =" + name + ", Gender =" + gender + "Age =" + age + "]";
    }
}