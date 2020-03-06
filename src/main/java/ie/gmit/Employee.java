/*
 * Name: Armen Petrosyan
 * ID no: G00343137
 * group c
 * lab exam - building an employee payroll system
 * Email: g00343137@gmit.ie
 * */
package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String ppsNumber;
    private String phone;
    private String employmentType;
    private int age;

    public Employee() {
        this.title = "";
        this.name = "";
        this.ppsNumber = "";
        this.phone = "";
        this.employmentType = "";
        this.age = 0;
    }

    public Employee(String title, String name, String ppsNumber, String phone, String employmentType, int age) {
        if (title.toLowerCase().equals("mr") || title.toLowerCase().equals("mrs") || title.toLowerCase().equals("miss")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invaild Title");
        }
        if (name.length() >= 5 && name.length() <= 22) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("name does not meet requirement");
        }
        if (ppsNumber.length() <= 6) {
            this.ppsNumber = ppsNumber;
        } else {
            throw new IllegalArgumentException("invalid ppsNumber");
        }
        if (phone.length() == 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("invaild phone");
        }
        if (employmentType.equalsIgnoreCase("FullTime") || employmentType.equalsIgnoreCase("PartTime")) {
            this.employmentType = employmentType;
        } else {
            throw new IllegalArgumentException("not an Employment type");
        }
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("you're too young");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.toLowerCase().equals("mr") || title.toLowerCase().equals("mrs") || title.toLowerCase().equals("miss")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invaild Title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5 && name.length() <= 22) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("name does not meet requirement");
        }
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public void setPpsNumber(String ppsNumber) {
        if (ppsNumber.length() <= 6) {
            this.ppsNumber = ppsNumber;
        } else {
            throw new IllegalArgumentException("invalid ppsNumber");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("invaild phone");
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if (employmentType.equalsIgnoreCase("FullTime") || employmentType.equalsIgnoreCase("PartTime")) {
            this.employmentType = employmentType;
        } else {
            throw new IllegalArgumentException("not an Employment type");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("you're too young");
        }
    }


}
