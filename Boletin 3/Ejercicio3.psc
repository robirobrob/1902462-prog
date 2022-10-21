Algoritmo Boletin3Ejercicio3
	Escribir "**** CÁLCULO DE TRIÁNGULOS****"
	Escribir ".A El valor del área de un triángulo, dada la base y la altura.";
	Escribir ".B El valor de la base de un triángulo, dada la altura y el área.";
	Escribir ".C El valor de la altura de un triángulo, dada la base y el área.";
	Escribir "Elige tu opción:";
	Leer a
	Si a="A" o a="a" Entonces
		Escribir "Introduce un valor para la base";
		Leer base;
		Escribir "Introduce un valor para la altura";
		leer h;
		Escribir "El área del triángulo es " h*base/2;
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
