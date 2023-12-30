package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign;

import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign.Directory;
import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign.File;
import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution1WithCompositeDesign.FileSystem;

public class Main {
    public static void main(String args[]){

       Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

       Directory comedyMovieDirectory = new Directory("ComedyMovie");
       File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
