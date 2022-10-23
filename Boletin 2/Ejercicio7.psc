Algoritmo Boletin2Ejercicio7
	Escribir "Introduzca cantidad de dinero";
	Leer Dinero;
	Escribir "Inserte la letra B para cambiar a euros";
	Escribir "Inserte la letra A para cambiar a libras";
	Leer B;
	Si B=a Entonces
		Escribir Dinero "libras son " Dinero*1.14 " euros";
	Sino 
		Si B=b Entonces
			Escribir Dinero "Euros son " Dinero*0.86 " Libras";
		FinSi
	FinSi
FinAlgoritmo
