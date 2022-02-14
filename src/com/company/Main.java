package com.company;

public class Main {

    public static void main(String[] args) {
        Team []teams={ new Team("Sergey Kostsyk","Bezdelnik", 123, 80, 185, 32),
                new Team("Anton Ivanov", "Shef", 500, 150,195,45),
                new Team ("Xoxol Kit", "Zam. dir", 250, 69, 165, 41),
                new Team("Fatima Gulnar", "Buhgalter", 100, 103, 169,39)};
        for (Team team: teams){
            System.out.println(team);
        }
        Course []c = {new Course(240, 79, 180, 35)};
        for(Course pr: c){
            System.out.println(pr);
        }
    }
}
class Team{
    private String fio;
    private String position;
    private int strong;
    private int iq;
    private int rost;
    private int age;

    Team(String fio, String position, int strong, int iq, int rost, int age) {
        this.fio = fio;
        this.position = position;
        this.strong = strong;
        this.iq = iq;
        this.rost = rost;
        this.age = age;
    }

    @Override
    public String toString(){
        return "ФИО: " + fio + "   "+ "Должность: " + position +"   "+ "Сила: " + strong +"   "+ "Iq: " + iq + "   "+"Рост: " + rost + "см   " + "Возраст: " + age;
    }
}
class Course{
    private int urStrong;
    private int urIq;
    private int urRost;
    private int vozr;

    Course(int urStrong, int urIq, int urRost, int vozr){
        this.urStrong=urStrong;
        this.urIq=urIq;
        this.urRost=urRost;
        this.vozr=vozr;
    }
    @Override
    public String toString(){
        return "Поднять штангу: "+ urStrong+ "кг   "+ "Уровень IQ: "+urIq+"   "+"Минималльный рост: "+ urRost+"см   "+"Возростная категория: "+vozr;
    }

}

