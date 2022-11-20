public class Main5OOP {

    public static class Person {
        private final String name;
        private final String lastname;
        private final int age;
        public Person(String name, String lastname, int age) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public String getLastname() {
            return lastname;
        }
        public int getAge() {
            return age;
        }
        public String toString() {
            return "Person " + lastname +
                    " " + name +
                    ", Age: "+ age;
        }
    }
    
    public static class Student extends Person {
        private final int group;
        private final int studentID;
        public Student(String name, String lastname, int age, int group, int studentID) {
            super(name, lastname, age);
            this.group = group;
            this.studentID = studentID;
        }
        @Override
        public String toString() {
            return "Student's group " + group +
                    ", " + getLastname() +
                    " " + getName() +
                    ", age: " + getAge() +
                    ". Number of student ID: "+ studentID;
        }
    }
    
    public static class Lecturer extends Person {
        private final String faculty;
        private final int salary;
        public Lecturer(String name, String lastname, int age, String faculty, int salary) {
            super(name, lastname, age);
            this.faculty = faculty;
            this.salary = salary;
        }
        @Override
        public String toString() {
            return "Lecturer's faculty " + faculty
                    + ", " + getLastname()
                    + " " + getName()
                    + ", age: " + getAge()
                    + ". Salary: " + salary; }
    }

    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("Kurko", "Andrey", 27, "IT", 16000);
        Lecturer l2 = new Lecturer("Maksim", "Medvedev", 22, "legal", 21000);
        Student s1 = new Student("Nikita", "Rodik", 17, 222, 157384);
        Student s2 = new Student("Artem", "Karpov", 16, 221, 817263);
        
        Person[] pArray = new Person[]{l1,s1,l2,s2};
        
        for (Person p: pArray) {
            System.out.println(p.toString());
        }
    }
}
