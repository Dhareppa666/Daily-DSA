package main.finale.Design_Pattern.Creational.Prototype;

import main.finale.Design_Pattern.Creational.Prototype.Profession;
import main.finale.Design_Pattern.Creational.Prototype.ProfessionCache;

public class ProtoTypePatternMainClass {

    public static void main(String[] args) {
        ProfessionCache.loadProffesionCache();

        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teachProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teachProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);

    }

}
