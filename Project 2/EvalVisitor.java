import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends Project2BaseVisitor<Double> {
	
	Stack<HashMap<String, Double>> scopeStack = new Stack<>();
	
	HashMap<String, Double> varMap = new HashMap<>();
	
	HashMap<String, Function> funcMap = new HashMap<>();
	
	ArrayList<Double> answersArray = new ArrayList<>();
	public ArrayList<String> answersText = new ArrayList<>();
	
	boolean activeReturn = false;
	Double returnValue = 0.0;

    @Override
    public Double visitExpr(@NotNull Project2Parser.ExprContext ctx) {
    	
    	//Should check if it's a leaf node and return the value.
    	if(!activeReturn)
    	{
    	
    	if(ctx.el == null && ctx.er == null && ctx.e == null)
    	{	
    		
    		//For statements
    		if(ctx.ef != null)
    		{
    			
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
    			return returnValue;
    		}
    		
    		//Function Definitions and Calling
    		if(ctx.ep != null)
    		{
    			//If it is being defined
    			if(ctx.getText().contains("define"))
    			{
    				//Create a new function
    				Function temp = new Function(ctx.ep, ctx.ec);
    				
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
    				//Update ReturnValue
    				returnValue = 0.0;
    				
    				//Create the new scope
    				HashMap<String, Double> tempScope = new HashMap<>();
    				scopeStack.push(tempScope);
    				
    				//Create the parameters.
    				for(int i = 0; i < temp.getParameters().topExpr().size(); i++)
    				{
    					String paramID = temp.getParameters().topExpr(i).expr().ID().getText();
    					Double paramValue = visit(ctx.ep.topExpr(i).expr());
    					
    					scopeStack.peek().put(paramID, paramValue);
    				}
    				
    				//Execute the Code in the called function
    				executeCode(temp.getCode());
    				
    				//Pop the scope before returning
    				scopeStack.pop();
    				
    				activeReturn = false;
    				
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
        				//Search the scopes for the variable.
            			for(int i = scopeStack.size() - 1; i >= 0; i--)
        				{
            				//If it is in the scope
        					if(scopeStack.elementAt(i).get(ctx.ID().getText()) != null)
        					{
        						//Add one to it and return it.
        						scopeStack.elementAt(i).put(ctx.ID().getText(), scopeStack.elementAt(i).getOrDefault(ctx.ID().getText(), 0.0) + 1.0);
        						return scopeStack.elementAt(i).get(ctx.ID().getText());
        					}
        				}
            			
            			//If it isn't found at all
            			//Create it, and make the value 1.
            			scopeStack.peek().put(ctx.ID().getText(), 1.0);
            			
            			//And return it
            			return 1.0;
        			}
        			else if(ctx.op != null && ctx.op.getText().equals("--"))
        			{
        				//Search the scopes for the variable.
            			for(int i = scopeStack.size() - 1; i >= 0; i--)
        				{
            				//If it is in the scope
        					if(scopeStack.elementAt(i).get(ctx.ID().getText()) != null)
        					{
        						//Add one to it and return it.
        						scopeStack.elementAt(i).put(ctx.ID().getText(), scopeStack.elementAt(i).getOrDefault(ctx.ID().getText(), 0.0) - 1.0);
        						return scopeStack.elementAt(i).get(ctx.ID().getText());
        					}
        				}
            			
            			//If it isn't found at all
            			//Create it, and make the value -1.
            			scopeStack.peek().put(ctx.ID().getText(), -1.0);
            			
            			//And return it
            			return -1.0;
        			}
        		}
    			
    			
    			//Search the scopes for the variable.
    			for(int i = scopeStack.size() - 1; i >= 0; i--)
				{
    				//If it is in the scope
					if(scopeStack.elementAt(i).get(ctx.ID().getText()) != null)
					{
						//Return it
						return scopeStack.elementAt(i).get(ctx.ID().getText());
					}
				}
				
    			//If it isn't, return 0.
				return 0.0;
    		}
    		
    		if(ctx.COMMENT() != null)
    		{
    			return 0.0;
    		}
    			
    		return Double.parseDouble(ctx.getText());
    	}
    	else if(ctx.el == null && ctx.er == null && ctx.e != null)
    	{
    		
    		//Return Statements
    		if(ctx.op != null && ctx.op.getText().equals("return"))
    		{
    			returnValue = returnValue + visit(ctx.e);
    			activeReturn = true;
    			return visit(ctx.e);
    		}
    		
    		//If Statement
    		if(ctx.op != null && ctx.op.getText().equals("if("))
    		{
    			
    			//Checks if condition statement is true or false
    			//True statements return 1.0;
    			//Could get messed up with other things, but no worries
    			//Do not have to store return value because If statements
    			//do not return anything.
    			if(visit(ctx.e) == 1.0)
    			{
    				//Start true commands if it is not empty
    				if(ctx.et != null)
    				{
    					executeCode(ctx.et);
    				}
    			}
    			else
    			{
    				//Start false commands if it is not empty
    				if(ctx.ef != null)
    				{
    					executeCode(ctx.ef);
    				}
    			}
    			
    			return returnValue;
    		}
    		
    		//While Statements
    		if(ctx.op != null && ctx.op.getText().equals("while("))
    		{
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
    			
    			return returnValue;
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
    			String variable = ctx.getText().substring(0, ctx.getText().indexOf("="));
    			Double value = visit(ctx.e);
    			
    			scopeStack.peek().put(variable, value);
    			return 0.0;
    		}
    		
    		//Parentheses
    		if(ctx.getText().substring(0,1).equals("("))
    		{
    			return visit(ctx.e);
    		}
    		
    		//Math Library Functions
    		else if(ctx.getText().substring(0,2).equals("s("))
    		{
    			return Math.sin(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("c("))
    		{
    			return Math.cos(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("l("))
    		{
    			return Math.log(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,2).equals("e("))
    		{
    			return Math.exp(visit(ctx.e));
    		}
    		
    		//Read
    		
    		//Sqrt and Print
    		else if(ctx.getText().substring(0,5).equals("sqrt("))
    		{
    			return Math.sqrt(visit(ctx.e));
    		}
    		else if(ctx.getText().substring(0,6).equals("print("))
    		{
    			
    			answersArray.add(visit(ctx.e));
    			answersText.add("Printing: " + ctx.e.getText());
    			//System.out.println(visit(ctx.e));
    			return (visit(ctx.e));
    		}
    		return visit(ctx.e);
    	}
    	else
    	{
    	
	        Double left = visit(ctx.el);
	        
	        Double right = visit(ctx.er);
	        
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
    	}//End of active return
    	else
    	{
    		return returnValue;
    	}
    }
    
    public ArrayList<Double> start(Project2Parser.ExprListContext ctx)
    {
    	scopeStack.push(varMap);
    	for(int i = 0; i < ctx.topExpr().size(); i++)
    	{
    		answersArray.add(visit(ctx.topExpr(i).expr()));
    		answersText.add(ctx.topExpr(i).expr().getText());
    		returnValue = 0.0;
    	}
    	
    	return answersArray;
    }
    
    public void executeCode(Project2Parser.ExprListContext ctx)
    {
    	if(!activeReturn)
    	{
	    	for(int i = 0; i < ctx.topExpr().size(); i++)
	    	{
	    		if(!activeReturn)
	    		{
	    			visit(ctx.topExpr(i).expr());
	    		}
	    		else
	    		{
	    			
	    		}
	    	}
    	}
    	else
    	{
    		
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