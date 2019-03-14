public class Function 
{
	public Project2Parser.ExprListContext parameters;
	public Project2Parser.ExprListContext code;
	public Project2Parser.ExprContext ret;
	
	public Function (Project2Parser.ExprListContext params, Project2Parser.ExprListContext c, Project2Parser.ExprContext r)
	{
		parameters = params;
		code = c;
		ret = r;
	}
	
	public Project2Parser.ExprListContext getParameters()
	{
		return parameters;
	}
	
	public Project2Parser.ExprListContext getCode()
	{
		return code;
	}
	
	public Project2Parser.ExprContext getReturn()
	{
		return ret;
	}
}
