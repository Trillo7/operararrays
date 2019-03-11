package operaarrays;

public class rellenaarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array10=new int[10];
		array10=rellenaarray(array10);
	}
	
	public static int[] rellenaarray(int[] array10) {
		for(int i=0;i<10;i++) {
			array10[i]=(int) (Math.random() * (20 - 1) + 1);
		}
		return array10;
		
	}

	public static void nuevometodo2() {
		System.out.println("hola esto es una prueba para rama2");
		JOptionPane.showMessageDialog(null, "Nueva modificacion");
	}
	
}
