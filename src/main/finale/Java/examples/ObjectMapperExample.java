package main.finale.Java.examples;

//import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperExample {
    public static void main(String[] args) {
//        String json = "{ \"name\": \"John\", \"age\": 30 }";
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            // Deserializing JSON to a Java object
//            Person person = mapper.readValue(json, Person.class);
//            System.out.println(person.getName() + " " + person.getAge()); // Output: John 30
//
//            // Serializing a Java object to JSON
//            Person anotherPerson = new Person("Jane", 25);
//            String jsonOutput = mapper.writeValueAsString(anotherPerson);
//            System.out.println(jsonOutput); // Output: {"name":"Jane","age":25}
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    static class Person {
        private String name;
        private int age;

        public Person() {} // Default constructor

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}