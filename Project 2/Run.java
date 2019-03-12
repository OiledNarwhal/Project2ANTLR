import java.util.ArrayList;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run
{
    public static void main(String[] args) 
    {
        String expression = "a=5; 5+a;";
        //CharStreams user;
        Project2Lexer lexer = new Project2Lexer(CharStreams.fromString(expression));
        TokenStream jimmyDean = new CommonTokenStream(lexer);
        Project2Parser parser = new Project2Parser(jimmyDean);
        //ParseTree tree = parser.exprList();
        ArrayList<Double> answerList = new EvalVisitor().start(parser.exprList());
        
        for(int i = 0; i < answerList.size(); i++)
        {
        	Double answer = answerList.get(i);
        	System.out.printf("%s = %s\n", expression, answer);
        }     
    }
}