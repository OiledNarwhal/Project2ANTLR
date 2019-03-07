public class EvalVisitor extends Project2BaseVisitor<Integer> {

    @Override
    public Integer visitOpExpr(@NotNull Project2Parser.OpExprContext ctx) {
        int left = visit(ctx.left);
        int right = visit(ctx.right);
        String op = ctx.op.getText();
        switch (op.charAt(0)) {
            case '*': return left * right;
            case '/': return left / right;
            case '+': return left + right;
            case '-': return left - right;
            default: throw new IllegalArgumentException("Unknown operator " + op);
        }
    }

    @Override
    public Integer visitStart(@NotNull Project2Parser.StartContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Integer visitAtomExpr(@NotNull Project2Parser.AtomExprContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitParenExpr(@NotNull Project2Parser.ParenExprContext ctx) {
        return this.visit(ctx.expr());
    }

    public static void main(String[] args) {
        String expression = "2 * (3 + 4)";
        Project2Lexer lexer = new Project2Lexer(new ANTLRInputStream(expression));
        Project2Parser parser = new Project2Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        Integer answer = new EvalVisitor().visit(tree);
        System.out.printf("%s = %s\n", expression, answer);
    }
}