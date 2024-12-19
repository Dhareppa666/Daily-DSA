package main.intvs.int2023_24.mock;

public class R1 {
}

// Given a string render it into a google Doc

//int a = driver()
//int b = driver()
//
//spacefora = a/(a+b)
//spaceforb= b/(a+b)
//
//a:b = 3:7
//
//
//class GoogleDoc {
//    private String s;
//    private int fontWidth;
//    private int Pw;
//
//    GoogleDoc (String s, int fontWidth, int Pw) {
//        this.s = s;
//        this.fontWidth = fontWidth;
//        this.Pw = Pw;
//    }
//
//    public int driver () {
//        int currRow = 1;
//        int currColIndex = 1;
//        String[] words = s.split(" ");
//        for(String word: words) {
//            if(word.equals("\n")) {
//                currRow++;
//                continue;
//            }
//
//            //
//            if(currColIndex + (word.length() * fontWidth) == Pw) {
//                render(word, currRow, currColIndex);
//                currRow++;
//                currCol = 0;
//                continue;
//            }
//
//            //
//            if(currColIndex + (word.length() * fontWidth) > Pw) {
//                currRow++;
//                currCol = 0;
//                String temp = word;
//                while(temp.length() != 0 && word.length() * fontWidth > Pw) {
//                    currRow = render(temp.substring(0, Pw/fontWidth), currRow, 0);
//                    temp = word.length() * fontWidth
//                }
//                currRow = render(word, currRow, 0);
//                continue;
//            }
//
//            //
//            if(currColIndex + (word.length() * fontWidth) < Pw) {
//                currCol = render(word+" ", currRow, currColIndex); // One extra cond needs to check..
//                currColIndex = newColIdx;
//            }
//
//            // if(currColIndex + (word.length() * fontWidth) > Pw) {
//            //   currRow++;
//            // } else if(currColIndex + (word.length() * fontWidth) < Pw) {
//            //   word = word + " ";
//            // }
//            // int newColIdx = render(word, currRow, currColIndex); // One extra cond needs to check..
//            // currColIndex = newColIdx;
//        }
//    }
//
//
//    private int render(String word, row, col) {
//
//    }
//}
//
//GoogleDoc gd= new GoogleDoc("This is a      random sentence. Hello there! \n Great stuff.", );
//
//gd.driver()
