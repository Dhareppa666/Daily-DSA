package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign;

import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign.FileSystem;

public class File implements FileSystem {
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}
