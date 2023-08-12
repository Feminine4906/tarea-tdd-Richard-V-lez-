import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;

import org.junit.jupiter.api.Test;

class TestMaquinaDeCafe {
	
	
	@Test
	void deberiaDevolverUnVasoPequeno() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		assertEquals(maquinaDeCafe.vasosPequeño, vaso);
	}
	
	@Test
	void deberiaDevolverUnVasoMediano() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
		assertEquals(maquinaDeCafe.vasoMediano, vaso);
	}
	
	@Test
	void deberiaDevolverUnVasoGrande() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
		assertEquals(maquinaDeCafe.vasoGrande, vaso);
	}
	
	@Test
	void deberiaDevolverNoHayVasos() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);
		assertEquals("No hay Vasos", result);
	}
	
	@Test
	void deberiaDevolverNoHayCafe() {
		Cafetera cafetera = new Cafetera(5);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 2);
		assertEquals("No hay Cafe", result);
	}
	
	@Test
	void deberiaDevolverNoHayAzucar() {
		Cafetera cafetera = new Cafetera(15);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 8);
		assertEquals("No hay Azucar", result);
	}
	
	@Test
	void deberiaRestarCafe() {
		Cafetera cafetera1 = new Cafetera(60);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera1);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		maquinaDeCafe.getVasoDeCafe(vaso, 5, 2);
		int result = maquinaDeCafe.getCafetera();
		assertEquals(10, result);
	}
	
	@Test
	void deberiaRestarAzucar() {
		Cafetera cafetera1 = new Cafetera(60);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(10);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera1);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("peque�o");
		maquinaDeCafe.getVasoDeCafe(vaso, 5, 5);
		int result = maquinaDeCafe.getAzuquero();
		assertEquals(5, result);
	}
	
	@Test
	void deberiaDevolverFelicitaciones() {
		Cafetera cafetera1 = new Cafetera(60);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera1);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 5);
		assertEquals("Felicitaciones", result);
	}
	
	

}
