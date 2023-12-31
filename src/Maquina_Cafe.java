import java.util.Scanner;
public class Maquina_Cafe {


	static Vaso vasosPequeño;
	static Vaso vasoMediano;
	static Vaso vasoGrande;
	static Cafetera cafetera;
	static Azuquero azuquero;

	
public void setCafetera(Cafetera cafe) {
	cafetera = cafe;
}




public void setVasosPequeño(Vaso vp) {
	 vasosPequeño = vp;
}

public void setVasosMediano(Vaso vm) {
	 vasoMediano = vm;
}

public void setVasosGrande(Vaso vg) {
	 vasoGrande = vg;
}

public void setAzuquero(Azuquero az) {
	azuquero = az;
}

	public static void main(String[] args) {
		
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setAzuquero(azucar);
		
		 Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("------ENHORABUENA------");
		System.out.println("-----------------------");
		
		System.out.println("INSERTE EL TIPO DE VASO QUE DESEA");
		String tipoVaso = scan.nextLine();
		Vaso va= getTipoVaso(tipoVaso);
		System.out.println("------------------------------");
		System.out.println("INSERTE  LA CANTIDAD DE VASOS QUE DECEA");
		int canva = Integer.parseInt(scan.nextLine());
		System.out.println("------------------------------");
		System.out.println("INSERTE  LA CANTIDAD DE AZUCAR QUE DECEA");
		int cana = Integer.parseInt(scan.nextLine());
		String out = getVasoDeCafe(va,canva,cana);
		System.out.println(out);
		
	
		
	}

	public static Vaso getTipoVaso(String tipoDeVaso) {
		
		if (tipoDeVaso == "peque�o") {
			return vasosPequeño;
		}else if (tipoDeVaso == "mediano") {
			return vasoMediano;
		}else {
			return vasoGrande;
		}
		
	}
	
	public static String getVasoDeCafe(Vaso tipoDevaso,int cantidadDeVasos, int cantidadDeAzucar) {
		
		
		
		if (tipoDevaso.getCantidadVasos()<cantidadDeVasos) {
			return "No hay Vasos";	
		}
		
		else if (tipoDevaso.getContenido() > cafetera.getCantidadDeCafe()) {
			return "No hay Cafe";
		}
		
		else if (cantidadDeAzucar > azuquero.getCantidadDeAzucar()) {
			return "No hay Azucar";
		}else {
			tipoDevaso.giveVasos(cantidadDeVasos);
			System.out.println(""+cantidadDeVasos);
			int contenido = tipoDevaso.getContenido();
			int cantidad = cantidadDeVasos;
			int cantidadCafe = contenido * cantidad;
			System.out.println(contenido+","+cantidad);
			cafetera.giveCafe(cantidadCafe);
			azuquero.giveAzucar(cantidadDeAzucar);
			System.out.println(""+cantidadDeAzucar);
			System.out.println(""+cantidadCafe);
			
			
			
			return "Felicitaciones";
		}
		
		
		
	}
	
	public int getCafetera() {
		return cafetera.getCantidadDeCafe();
	}
	
	public int getAzuquero() {
		return azuquero.getCantidadDeAzucar();
	}
	
	
	
}
