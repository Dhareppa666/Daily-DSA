package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.ProblemStatement;

import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.ProblemStatement.Directory;
import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.ProblemStatement.File;

public class Main {

    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
