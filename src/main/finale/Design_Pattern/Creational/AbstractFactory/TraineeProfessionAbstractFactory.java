package main.finale.Design_Pattern.Creational.AbstractFactory;


import main.finale.Design_Pattern.Creational.AbstractFactory.AbstractFactory;
import main.finale.Design_Pattern.Creational.AbstractFactory.Profession;
import main.finale.Design_Pattern.Creational.AbstractFactory.TraineeEngineer;
import main.finale.Design_Pattern.Creational.AbstractFactory.TraineeTeacher;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String typeOfProfession){

        if(typeOfProfession == null){
            return null;
        } else if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        } else if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();
        }

        return null;
    }

}