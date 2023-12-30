package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.ProblemStatement;

public class File {

    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}
