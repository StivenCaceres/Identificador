package identificator;
import javax.swing.*;
public class validarSecuencia {
	public static final String Parar = "stop";
	public static final String VALID = "Identif Valido";
	public static final String INVALID = "Identif Invalido";
	public static void main (String[] args)
	{
		
		int seleccion = JOptionPane.showOptionDialog(null,"Verifi", 
				   		"what do you wnat verify: ",JOptionPane.YES_NO_CANCEL_OPTION,
				   		JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
				   		new Object[] { "Number Plate", "Date", "Home Code" },"opcion 1");
		
		switch(seleccion) {
			case 0:
				numberPlate();
			break;
			case 1:
				date();
			break;
			case 2:
				homeCode();
			break;
		}
	}
	
	public static void numberPlate() 
	{
		String PATRON_VALIDO = "[a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9][0-9]";
		String str, resp; 
	    while (true)
	    {
	    	str = JOptionPane.showInputDialog(null, "Enter Placa del carro: ");
	            
	    	if (str.equalsIgnoreCase(Parar)) break;
	    
	    	if (str.matches(PATRON_VALIDO))
	    	{
	    		resp = VALID;
	    	}else resp = INVALID;
	    		JOptionPane.showMessageDialog(null, str + ":\n " + resp);
	    }
	}
	
	public static void date()
	{
		String PATRON_VALIDO_Day1 = "[0-9]";
		String PATRON_VALIDO_Day2 = "[0-2][0-9]";
		String PATRON_VALIDO_Day3 = "[3-3][0-1]";
		String PATRON_VALIDO_Month1 = "[0-9]";
		String PATRON_VALIDO_Month2 = "[1-1][0-2]";
		String PATRON_VALIDO_Year = "[0-9][0-9][0-9][0-9]";
		String str, resp;
		String VALIDday = "Day Valido";
		String VALIDmonth = "Month Valido";
		String VALIDyear = "Year Valido";
	    while (true)
	    {
	    	
	    	str = JOptionPane.showInputDialog(null, "Enter day of date: ");
	            
	    	if (str.equalsIgnoreCase(Parar)) break;
	    
	    	if (str.matches(PATRON_VALIDO_Day1) 
	    	  ||str.matches(PATRON_VALIDO_Day2)
	    	  ||str.matches(PATRON_VALIDO_Day3))
	    	{
	    		resp = VALIDday;
	    	}else 
	    		JOptionPane.showMessageDialog(null, str + ":\n " + "Day Invalido");
	    	if(str.matches(PATRON_VALIDO_Month1) 
	  	     ||str.matches(PATRON_VALIDO_Month2))
	    	{
	    		resp = VALIDmonth;
	    	}else
	    		JOptionPane.showMessageDialog(null, str + ":\n " + "Month Invalido");
	    	if(str.matches(PATRON_VALIDO_Year))
	   	    {
	   	   		resp = VALIDyear;
	   	   	}else
	   	   		JOptionPane.showMessageDialog(null, str + ":\n " + "Year Invalido");
	    }
	}
	
	public static void homeCode()
	{
		String PATRON_VALIDO = "[a-zA-Z][a-zA-Z][0-9][0-9][0-9]"
				+ "[a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9][0-9][0-9]";
		String str, resp; 
	    while (true)
	    {
	    	str = JOptionPane.showInputDialog(null, "Enter home code: ");
	            
	    	if (str.equalsIgnoreCase(Parar)) break;
	    
	    	if (str.matches(PATRON_VALIDO))
	    	{
	    		resp = VALID;
	    	}else resp = INVALID;
	    		JOptionPane.showMessageDialog(null, str + ":\n " + resp);
	    }
	}
}
