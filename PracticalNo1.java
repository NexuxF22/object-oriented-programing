/*
Aim: Practical No.1
Author: Harish Shettiyar
Date:02,Mar,2024
*/
class PracticalNo1 {
    public static void main(String[] argv) {
        CompanyData SBJIT = new CompanyData("Harish Shettiyar", 19, "Male", 37);
        SBJIT.display();
    }
}

class CompanyData {
    String name;
    int age;
    String gender;
    int empid;

    CompanyData() {
        System.out.println("Inside Default Constructor");
    }

    CompanyData(String name, int age, String gender, int empid) {
        System.out.println("Inside Parameterized Constructor");
        this.name = name;
        this.age = age;
        this.gender = gender; 
        this.empid = empid;
    }

    public void display() {
        System.out.println("Name -" + this.name + " Age -" + this.age + " Gender -" + this.gender + " Emp ID-" + this.empid);  
    }
}