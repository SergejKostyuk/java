package com.company;

public class Main {

    public static void main(String[] args) {
        Team []teams={ new Team("Sergey Kostsyk","Bezdelnik", 123, 80, 185, 32),
                new Team("Anton Ivanov", "Shef", 500, 150,195,45),
                new Team ("Xoxol Kit", "Zam. dir", 250, 69, 165, 41),
                new Team("Fatima Gulnar", "Buhgalter", 100, 103, 169,39)};
        Course []c = {new Course(240, 79, 180, 35)};
        for (Team team: teams){
            for(Course pr: c){
                if(team.getStrong() >= pr.getUrStrong() && team.getIq()>= pr.getUrIq() && team.getRost()>= pr.getUrRost() && team.getAge()>= pr.getVozr()){
                    System.out.println("Препятствия прошел: "+(team.getFio()) + "   Должность: " + (team.getPosition()));
                }
            }
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

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public int getStrong() {
        return strong;
    }

    public int getIq() {
        return iq;
    }

    public int getRost() {
        return rost;
    }

    public int getAge() {
        return age;
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

    public int getUrStrong() {
        return urStrong;
    }

    public int getUrIq() {
        return urIq;
    }

    public int getUrRost() {
        return urRost;
    }

    public int getVozr() {
        return vozr;
    }

    @Override
    public String toString(){
        return "Поднять штангу: "+ urStrong+ "кг   "+ "Уровень IQ: "+urIq+"   "+"Минималльный рост: "+ urRost+"см   "+"Возростная категория: "+vozr;
    }

}

