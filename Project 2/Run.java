public class Run
{
    public static void main(String[] args) 
    {
        String expression = "2 * (3 + 4)";
        Project2Lexer lexer = new Project2Lexer(new ANTLRInputStream(expression));
        Project2Parser parser = new Project2Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        Integer answer = new EvalVisitor().visit(tree);
        System.out.printf("%s = %s\n", expression, answer);
    }
}