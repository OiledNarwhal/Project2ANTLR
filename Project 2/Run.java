import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run
{
    public static void main(String[] args) throws IOException 
    {
        String expression = "x = 5; x; define dog(a) {x = a; print(x); return 0.0;}; dog(7); x;";
        //CharStreams user;
        String fileName = "/Project2Antlr/test";
        File file = new File(System.getProperty("home.dir"), "src/input.txt");
        
        Project2Lexer lexer = new Project2Lexer(CharStreams.fromFileName(file.getAbsolutePath()));
        TokenStream jimmyDean = new CommonTokenStream(lexer);
        Project2Parser parser = new Project2Parser(jimmyDean);
        //ParseTree tree = parser.exprList();
        EvalVisitor visitor = new EvalVisitor();
        ArrayList<Double> answerList = visitor.start(parser.exprList());
        
        
        System.out.println(expression);
        for(int i = 0; i < answerList.size(); i++)
        {
        	Double answer = answerList.get(i);
        	String text = visitor.answersText.get(i);
        	
        	System.out.println(text + " = " + answer);
        	//System.out.printf("%s = %s\n", expression, answer);
        }     
    }
}