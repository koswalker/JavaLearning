package Exercise30;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100){
            this.age = age;

        } else age = 0;
    }

    public boolean isTeen(){
        boolean res = false;
        if(this.age>12 && this.age<20){
            res = true;
        } else res = false;
        return res;
    }

    public String getFullName (){
        String fullName;
        if(firstName.isEmpty()){
            fullName = lastName;
        } else if(lastName.isEmpty()){
            fullName = firstName;
        } else if(firstName.isEmpty() && lastName.isEmpty()){
            fullName = " ";
        } else fullName = firstName + " " + lastName;
        return  fullName;
    }
}
