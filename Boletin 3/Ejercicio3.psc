Algoritmo Boletin3Ejercicio3
	Escribir "**** C�LCULO DE TRI�NGULOS****"
	Escribir ".A El valor del �rea de un tri�ngulo, dada la base y la altura.";
	Escribir ".B El valor de la base de un tri�ngulo, dada la altura y el �rea.";
	Escribir ".C El valor de la altura de un tri�ngulo, dada la base y el �rea.";
	Escribir "Elige tu opci�n:";
	Leer a
	Si a="A" o a="a" Entonces
		Escribir "Introduce un valor para la base";
		Leer base;
		Escribir "Introduce un valor para la altura";
		leer h;
		Escribir "El �rea del tri�ngulo es " h*base/2;
	SiNo
		Si a="B" O a="b" Entonces
			Escribir "Introduce un valor para la altura";
			Leer h;
			Escribir "Introduce un balor para el area";
			Leer area;
			Escribir "El valor de la base es " area*2/h;
		SiNo
			si a="C" O a="c" Entonces
				Escribir "Introduce un valor para la base";
				Leer base;
				Escribir "Introduce un valor para el area";
				Leer area;
				Escribir "EL valor de la altura es " area*2/base;
			FinSi
		FinSi
	FinSi
FinAlgoritmo
