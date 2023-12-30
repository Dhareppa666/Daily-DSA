package main.finale.Design_Pattern.Creational.Factory;

import main.finale.aa.Design_Pattern.Creational.Factory.Doctor;
import main.finale.aa.Design_Pattern.Creational.Factory.Engineer;
import main.finale.aa.Design_Pattern.Creational.Factory.Profession;
import main.finale.aa.Design_Pattern.Creational.Factory.Teacher;

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
