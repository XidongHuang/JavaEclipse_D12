package tony.java.exe2;

public class EcmDef {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]); //被除数
		int j = Integer.parseInt(args[1]);//除数
	
		try{
		ecm(i, j);
		} catch (NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		} catch(ArithmeticException e){
			System.out.println(e.getMessage());
		} catch (EcDef e){
			System.out.println(e.getMessage());
		}
	
	}
	
	
	public static void ecm(int i, int j) throws EcDef{
		if(i <0|| j<0){
			throw new EcDef("Input negative numbers");
		}
		
		System.out.println(j/j);

		
	
	}
}


class EcDef extends Exception{
	static final long serialVersionUID = -33873124229948L;
	
	public EcDef(){
		
	}
	public EcDef(String msg){
		super(msg);
	}
	
}