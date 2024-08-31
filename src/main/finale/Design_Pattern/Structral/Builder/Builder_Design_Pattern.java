package main.finale.Design_Pattern.Structral.Builder;

public class Builder_Design_Pattern {
    public String name;
    public int age;
    public double salary;

    public static Builder_Design_Pattern builder() {
        return new Builder_Design_Pattern();
    }

    public Builder_Design_Pattern withName(String name) {
        this.name = name;
        return this;
    }

    public Builder_Design_Pattern withAge(int age) {
        this.age = age;
        return this;
    }

    public Builder_Design_Pattern withSalary(double sal) {
        this.salary = sal;
        return this;
    }

    public static void main(String[] args) {
        Builder_Design_Pattern bp1 = Builder_Design_Pattern.builder().withName("JB").withAge(26).withSalary(25000.0);
        System.out.println(bp1.toString());

        Builder_Design_Pattern bp2 = Builder_Design_Pattern.builder().withName("Ramu Kaka");
        System.out.println(bp2.toString());
    }

    @Override
    public String toString() {
        return "Builder_Design_Pattern{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
