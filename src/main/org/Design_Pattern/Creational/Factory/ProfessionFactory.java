package org.Design_Pattern.Creational.Factory;

public class ProfessionFactory {

    public Profession getProfession(String profObject) {
        if (profObject.equals("Doctor")) {
            return new Doctor();
        } else if (profObject.equals("Engineer")) {
            return new Engineer();
        } else if (profObject.equals("Teacher")) {
            return new Teacher();
        } else {
            return null;
        }
    }

}
