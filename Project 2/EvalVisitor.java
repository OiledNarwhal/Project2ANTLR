import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends Project2BaseVisitor<Double> {
	
	HashMap<String, Double> varMap = new HashMap<>();
	HashMap<String, Function> funcMap = new HashMap<>();
	
	ArrayList<Double> answersArray = new ArrayList<>();
	public ArrayList<String> answersText = new ArrayList<>();

    @Override
    public Double visitExpr(@NotNull Project2Parser.ExprContext ctx) {
    	System.out.println(ctx.getText());
    	//Should check if it's a leaf node and return the value.
    	if(ctx.el == null && ctx.er == null && ctx.e == null)
    	{	
    		System.out.println("Leaf Node");
    		
    		//For statements
    		if(ctx.ef != null)
    		{
    			System.out.println("In For");
    			
    			//Initialize For Loop
    			visit(ctx.e1);
    			
    			//While the second expression is true
    			while(visit(ctx.e2) == 1.0)
    			{
    				//And the expression list is populated
    				if(ctx.ef != null)
    				{
    					//Execute Commands
    					executeCode(ctx.ef);
    				}
    				
    				//Execute 3rd expression for incrementing
    				visit(ctx.e3);
    			}
    			return 0.0;
    		}
    		
    		//Function Definitions and Calling
    		if(ctx.ep != null)
    		{
    			//If it is being defined
    			if(ctx.getText().contains("define"))
    			{
    				//Create a new function
    				Function temp = new Function(ctx.ep, ctx.ec, ctx.ert);
    				
    				//Put it in the function map
    				funcMap.put(ctx.ID().getText(), temp);
    				
    				return 0.0;
    			}
    			
    			//If it's being called
    			//Get the function
    			Function temp = funcMap.get(ctx.ID().getText());
    			
    			//Make sure the function exists 
    			if(temp == null)
    			{
    				//Let them know it doesn't exist
    				System.out.println("Function does not exist");
    				return 0.0;
    			}
    			else
    			{
    				//If it does exist
    				
    				//Create the parameters.
    				for(int i = 0; i < temp.getParameters().topExpr().size(); i++)
    				{
    					String paramID = temp.getParameters().topExpr(i).expr().ID().getText();
    					Double paramValue = visit(ctx.ep.topExpr(i).expr());
    					
    					varMap.put(paramID, paramValue);
    				}
    				
    				//Execute the Code in the called function
    				executeCode(temp.getCode());
    				
    				//Return the designated return value
    				Double returnValue = visit(temp.getReturn());
    				return returnValue;
    			}
    			
    			
    		}
    		
    		//Variables
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
    		
    		//If Statement
    		if(ctx.op != null && ctx.op.getText().equals("if("))
    		{
    			System.out.println("In IF");
    			
    			//Checks if condition statement is true or false
    			//True statements return 1.0;
    			//Could get messed up with other things, but no worries
    			//Do not have to store return value because If statements
    			//do not return anything.
    			if(visit(ctx.e) == 1.0)
    			{
    				System.out.println("In True");
    				//Start true commands if it is not empty
    				if(ctx.et != null)
    				{
    					executeCode(ctx.et);
    				}
    			}
    			else
    			{
    				System.out.println("In False");
    				//Start false commands if it is not empty
    				if(ctx.ef != null)
    				{
    					executeCode(ctx.ef);
    				}
    			}
    			
    			return 0.0;
    		}
    		
    		//While Statements
    		if(ctx.op != null && ctx.op.getText().equals("while("))
    		{
    			System.out.println("In while");
    			//While the condition is true
    			while(visit(ctx.e) == 1.0)
    			{
    				//And the command list is not empty
    				if(ctx.ew != null)
    				{
    					//Execute all commands in block
    					executeCode(ctx.ew);
    				}
    			}
    			
    			return 0.0;
    		}
    		
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
	            case ">": if(left > right) return 1.0; else return 0.0;
	            case ">=": if(left >= right) return 1.0; else return 0.0;
	            case "<": if(left < right) return 1.0; else return 0.0;
	            case "<=": if(left <= right) return 1.0; else return 0.0;
	            default: throw new IllegalArgumentException("Unknown operator " + op);
	        }
    	}
    }
    
    public ArrayList<Double> start(Project2Parser.ExprListContext ctx)
    {
    	for(int i = 0; i < ctx.topExpr().size(); i++)
    	{
    		answersArray.add(visit(ctx.topExpr(i).expr()));
    		answersText.add(ctx.topExpr(i).expr().getText());
    	}
    	
    	return answersArray;
    }
    
    public void executeCode(Project2Parser.ExprListContext ctx)
    {
    	for(int i = 0; i < ctx.topExpr().size(); i++)
    	{
    		visit(ctx.topExpr(i).expr());
    	}
    	
    	//return answersArray;
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