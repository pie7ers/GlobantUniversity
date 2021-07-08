public class Person {
    private String name;
    private String lastName;
    private int age;
    private String gender;

    public Person(){
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetLastName(){
        return lastName;
    }

    public void SetLastName(String lastName){
        this.lastName = lastName;
    }

    public int GetAge(){
        return age;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public String GetGender(){
        return gender;
    }

    public void SetGender(String gender){
        this.gender = gender;
    }

    public int HowOldWillYouBe(){
        int newAge = this.age + 1;
        return newAge;
    }
}