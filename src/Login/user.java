package Login;

public class user {
    String id;
    String name;
    String pwd;
    String phone;
    String school;
    String email;
    String gender;
    String hobits;
    String clazz;

    public user(String id, String name, String pwd, String phone, String school, String email, String gender, String hobits, String clazz) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.school = school;
        this.email = email;
        this.gender = gender;
        this.hobits = hobits;
        this.clazz = clazz;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchool() {
        return school;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobits() {
        return hobits;
    }

    public String getClazz() {
        return clazz;
    }
}
