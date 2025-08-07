package com.athuiru.exer.extendsexer;

public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    @Override
    public void employed() {
        super.employed();
        System.out.println("kid should study and no job");
    }
}
