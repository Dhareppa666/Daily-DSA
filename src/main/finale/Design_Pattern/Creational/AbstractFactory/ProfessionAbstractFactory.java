package main.finale.Design_Pattern.Creational.AbstractFactory;

import main.finale.Design_Pattern.Creational.AbstractFactory.AbstractFactory;
import main.finale.Design_Pattern.Creational.AbstractFactory.Engineer;
import main.finale.Design_Pattern.Creational.AbstractFactory.Profession;
import main.finale.Design_Pattern.Creational.AbstractFactory.Teacher;

public class ProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String typeOfProfession) {

        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();

        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }

        return null;
    }
}