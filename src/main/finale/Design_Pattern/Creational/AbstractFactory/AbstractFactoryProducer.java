package main.finale.Design_Pattern.Creational.AbstractFactory;

import main.finale.aa.Design_Pattern.Creational.AbstractFactory.AbstractFactory;
import main.finale.aa.Design_Pattern.Creational.AbstractFactory.ProfessionAbstractFactory;
import main.finale.aa.Design_Pattern.Creational.AbstractFactory.TraineeProfessionAbstractFactory;

// this is factory of factory , gives u factory instance which wil in turn give u required class object
public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee) {
        if(isTrainee) {
            return new TraineeProfessionAbstractFactory();
        }
        else {
            return new ProfessionAbstractFactory();
        }
    }

}
