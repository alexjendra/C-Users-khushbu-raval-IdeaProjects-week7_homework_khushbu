package week_3java_homework;

public class Programme14 {
        public static class Person {
            //New class is created
            String FirstName;
            String LastName;
            int age;

            public static void main(String[] args) {
                Person person = new Person();
                person.setFirstName("");
                person.setLastName("");
                person.setAge(10);
                System.out.println("FullName= " + person.getFullName());
                System.out.println("teen= " + person.isTeen());
                person.setFirstName("Kait"); //first name set to Kait
                person.setAge(18);
                System.out.println("FullName= " + person.getFullName());
                System.out.println("teen= " + person.isTeen());
                person.setLastName("Sen"); // lastName is set to Sen
                System.out.println("FullName= " + person.getFullName());
            }

            public String getFirstName() {
                return FirstName;
            }

            public String getLastName() {
                return LastName;
            }

            public int getAge() {
                return age;
            }

            public void setFirstName(String FirstName) {
                this.FirstName = FirstName;
            }

            public void setLastName(String LastName) {
                this.LastName = LastName;
            }

            public void setAge(int age) {
                if (age > 0 && age <= 100) {
                    this.age = age;
                } else {
                    this.age = 0;
                }
            }

            public boolean isTeen() {
                if (age > 12 && age < 20) {
                    return true;
                }
                return false;
            }

            public String getFullName() {
                if (FirstName.isEmpty()) {
                    return LastName;
                }
                if (LastName.isEmpty()) {
                    return FirstName;
                }
                if (FirstName.isEmpty() && LastName.isEmpty()) {
                    return " ";
                } else {
                    return FirstName + " " + LastName;
                }

            }
        }
    }


