package tp09.Ex1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Implement the “Student” class. It’s necessary to save in
 * the attributes the following data:
 * name, date of birth, telephone number, city, country, the group (A, B, …).
 * Do the following tasks:
 * 1. Implement the methods for a data input (read from keyboard and fill in the fields), for a data output,
 * 2. implement the accessors (ex: getName() is accessor of name field) to access the separate attributes,
 * 3. Implement the mutator (ex: setName(String name) is mutators of name field).
 */
public class Student {
    private String name, city, country;
    private Date dob;//Date of Birth
    private int tel;
    private Group group;

    private Student() { }

    public Student(String name, String city, String country, Date dob, Integer tel)
            throws BirthDateException {
        setName(name);
        setCity(city);
        setCountry(country);
        setDob(dob);
        setTel(tel);
    }

    public static Student dataInput(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Input name: ");
        student.setName(sc.nextLine());
        System.out.print("Input city: ");
        student.setCity(sc.nextLine());
        System.out.print("Input Country: ");
        student.setCountry(sc.nextLine());
        System.out.print("Input Date of Birth: ");


        return student;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", dob=" + dob +'\''+
                ", tel=" + tel +'\''+
                ", group=" + group +
                '}';
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName(){return name;}
    public void setName(String name){
        FieldUtil.checkNullOrEmptyOrBlank(name,"Name");
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        FieldUtil.checkNullOrEmptyOrBlank(city, "City");
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        FieldUtil.checkNullOrEmptyOrBlank(country, "Country");
        this.country = country;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) throws BirthDateException {
        Calendar cal = Calendar.getInstance();//current date and time
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - 12);
        Date twelveYearsOld = cal.getTime();
        if(dob.compareTo(twelveYearsOld) <= 0) {
            this.dob = dob;
        }else
            throw new BirthDateException();
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
