public class Function 
{
	public Project2Parser.ExprListContext parameters;
	public Project2Parser.ExprListContext code;
	
	public Function (Project2Parser.ExprListContext params, Project2Parser.ExprListContext c)
	{
		parameters = params;
		code = c;
	}
	
	public Project2Parser.ExprListContext getParameters()
	{
		return parameters;
	}
	
	public Project2Parser.ExprListContext getCode()
	{
		return code;
	}
}
