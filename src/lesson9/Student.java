package lesson9;

public class Student {
    private int id;
    private static int nextId=0;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String surname;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;
    public Student( String name, String middleName, String surname,String dateOfBirth,  String phoneNumber, String faculty, String course, String group) {

        this.name=name;
        this.middleName=middleName;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
        id=nextId++;
        setName(name);
        setMiddleName(middleName);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setPhoneNumber(phoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




    public String toString() {
        return "Student{"+" id " +id+
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public String fullName(){
        return surname+" "+middleName+" "+name;
    }
}
