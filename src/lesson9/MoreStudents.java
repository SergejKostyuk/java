package lesson9;

public class MoreStudents {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", "Иванович", "Иванов", "01.01.1998", "38044555667712", "Психология", "1", "123");
        Student st2 = new Student("Петр", "Петрович", "Петров", "12.04.1997", "38044555667713", "Журналистика", "2", "321");
        Student st3 = new Student("Семен", "Семенович", "Семенов", "10.07.1996", "38044555667714", "Юридический", "3", "231");
        Student st4 = new Student("Константин", "Иванович", "Галушко", "04.09.1999", "38044555667715", "Психология", "1", "123");
        Student st5 = new Student("Сергей", "Петрович", "Пивоваров", "03.04.1998", "38044555667716", "Журналистика", "2", "321");
        Student st6 = new Student("Василий", "Николаевич", "Пупкин", "07.01.1998", "38044555667717", "Юридический", "3", "231");
        Student st7 = new Student("Анатолий", "Сергеевич", "Антонов", "03.12.1996", "38044555667718", "Психология", "1", "123");
        Student st8 = new Student("Евгений", "Анатольевич", "Жуков", "15.07.1997", "38044555667719", "Журналистика", "2", "321");
        Student st9 = new Student("Роман", "Семенович", "Решетников", "23.04.1998", "38044555667720", "Юридический", "3", "231");
        Student st10 = new Student("Федор", "Викторович", "Блинов", "05.01.1998", "38044555667721", "Психология", "1", "123");
        Student st11 = new Student("Виктор", "Андреевич", "Сидорченко", "12.05.1997", "38044555667722", "Журналистика", "2", "321");
        Student st12 = new Student("Всеволод", "Богданович", "Ющенко", "14.12.1996", "38044555667723", "Юридический", "3", "231");
        Student st13 = new Student("Геннадий", "Николаевич", "Порошенко", "13.09.1999", "38044555667724", "Психология", "1", "123");
        Student st14 = new Student("Николай", "Петрович", "Соломатин", "11.09.1998", "38044555667725", "Журналистика", "2", "321");

        StudentList newList=new StudentList();
        newList.addStudent(st1);
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);
        newList.addStudent(st11);
        newList.addStudent(st12);
        newList.addStudent(st13);
        newList.addStudent(st14);
        newList.facultyPrint("Психология");//список студентов заданного факультета
        newList.groupPrint("123");//список учебной группы
        newList.yearOfBirthPrint("1997");//список студентов, родившихся после заданного года;
        newList.facultyCoursePrint("Психология","1");//списки студентов для каждого факультета и курса;

    }
}
