import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends Project2BaseVisitor<Double> {
	
	HashMap<String, Double> varMap = new HashMap<>();
	ArrayList<Double> answersArray = new ArrayList<>();

    @Override
    public Double visitExpr(@NotNull Project2Parser.ExprContext ctx) {
    	System.out.println(ctx.getText());
    	//Should check if it's a leaf node and return the value.
    	if(ctx.el == null && ctx.er == null && ctx.e == null)
    	{	
    		System.out.println("Leaf Node");
    		
    		if(ctx.ID() != null)
    		{
    			//Variable Incrementing
        		if(ctx.ID() != null)
        		{
        			if(ctx.op != null && ctx.op.getText().equals("++"))
        			{
        				varMap.put(ctx.ID().getText(), varMap.getOrDefault(ctx.ID().getText(), 0.0) + 1.0);
        				return varMap.getOrDefault(ctx.ID().getText(), 0.0);
        			}
        			else if(ctx.op != null && ctx.op.getText().equals("--"))
        			{
        				varMap.put(ctx.ID().getText(), varMap.getOrDefault(ctx.ID().getText(), 0.0) - 1.0);
        				return varMap.getOrDefault(ctx.ID().getText(), 0.0);
        			}
        		}
    			
    			System.out.println("Getting Variable");
    			return varMap.getOrDefault(ctx.ID().getText(), 0.0);
    		}
    		
    		if(ctx.COMMENT() != null)
    		{
    			System.out.println("Comment");
    			return 0.0;
    		}
    			
    		return Double.parseDouble(ctx.getText());
    	}
    	else if(ctx.el == null && ctx.er == null && ctx.e != null)
    	{
    		System.out.println("Using E");
    		
    		//Not Operator
    		//Has to be here because of e in Grammar
    		if(ctx.op != null && ctx.op.getText().equals("!"))
    		{
    			if(visit(ctx.e) != 0.0)
    			{
    				return 0.0;
    			}
    			else
    			{
    				return 1.0;
    			}
    		}
    		
    		//Checking for Variable Assignment
    		if(ctx.getText().contains("="))
    		{
    			System.out.println("Assignment");
    			String variable = ctx.getText().substring(0, ctx.getText().indexOf("="));
    			Double value = visit(ctx.e);
    			
    			varMap.put(variable, value);
    			return 0.0;
    		}
    		
    		//Parentheses
    		if(ctx.getText().substring(0,1).equals("("))
    		{
    			System.out.println("Found Open Paren");
    			return visit(ctx.e);
    		}
    		
    		//Math Library Functions
    		else if(ctx.getText().substring(0,2).equals("s("))
    		{
    			System.out.println("Found sine");
    			return Math.sin(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("c("))
    		{
    			System.out.println("Found cosine");
    			return Math.cos(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("l("))
    		{
    			System.out.println("Found log");
    			return Math.log(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("e("))
    		{
    			System.out.println("Found e(");
    			return Math.exp(visit(ctx.e));
    		}
    		
    		//Read
    		
    		//Sqrt and Print
    		else if(ctx.getText().substring(0,5).equals("sqrt("))
    		{
    			System.out.println("Found sqrt");
    			return Math.sqrt(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,6).equals("print("))
    		{
    			System.out.println("Found Print");
    			System.out.println(visit(ctx.e));
    			return (visit(ctx.e));
    		}
    		return visit(ctx.e);
    	}
    	else
    	{
    	
	    	System.out.println("Going Left");
	        Double left = visit(ctx.el);
	        
	        System.out.println("Going Right");
	        Double right = visit(ctx.er);
	        
	        System.out.println("Getting Operator");
	        String op = ctx.op.getText();
	        switch (op) 
	        {
	            case "*": return left * right;
	            case "/": return left / right;
	            case "+": return left + right;
	            case "-": return left - right;
	            case "^": return Math.pow(left, right);
	            case "&&": if(left != 0.0 && right != 0.0) return 1.0; else return 0.0;
	            case "||": if(left != 0.0 || right != 0.0) return 1.0; else return 0.0;
	            default: throw new IllegalArgumentException("Unknown operator " + op);
	        }
    	}
    }
    
    public ArrayList<Double> start(Project2Parser.ExprListContext ctx)
    {
    	for(int i = 0; i < ctx.topExpr().size(); i++)
    	{
    		answersArray.add(visit(ctx.topExpr(i).expr()));
    	}
    	
    	return answersArray;
    }

    /*
    @Override
    public Double visitExprList(@NotNull Project2Parser.ExprListContext ctx) {
        
    	
    	
    	for(int i = 0; i < ctx.topExpr().size(); i++)
        {
        	
        }
    	
    	//return this.visit(ctx.topExpr());
    }

    @Override
    public Double visitAtomExpr(@NotNull Project2Parser.AtomExprContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Double visitParenExpr(@NotNull Project2Parser.ParenExprContext ctx) {
        return this.visit(ctx.expr());
    }
    */
}