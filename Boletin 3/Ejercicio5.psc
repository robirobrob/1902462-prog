Algoritmo Boletin3Ejercicio5
	cont <- 0;
	Escribir "*** Test de Geografia ***";
	Escribir "Guatemala es:";
	Escribir "A) Un pais.";
	Escribir "B) Una ciudad";
	Escribir "C) Ambas son ciertas.";
    Leer A;
	Si A="A" o A="a" Entonces
		Escribir "Correcto";
		cont <- cont + 1;
	SiNo
		Si A="B" O A="b" O A="C" O A="c" Entonces;
			Escribir "INCORRECTO";
		FinSi
	FinSi
	Escribir "�D�nde se encuentra el Museo del Prado?";
	Escribir "A) Mil�n, Italia.";
	Escribir "B) Madrid, Espa�a.";
	Escribir "C) Par�s, Francia.";
	Leer B;
	Si B="B" o B="b" Entonces
		Escribir "Correcto"
		cont <- cont + 1;
	SiNo
		Si B="A" O B="a" O B="C" O B="c" Entonces
			Escribir "INCORRECTO"
		FinSi
	FinSi
	Escribir "El T�mesis es un r�o de:";
	Escribir "A) Grecia.";
	Escribir "B) Reino Unido.";
	Escribir "C) Portugal.";
	Leer C
	Si C="B" O C="b" Entonces
		Escribir "Correcto"
		cont <- cont + 1;
	SiNo
		Escribir "INCORRECTO";
	FinSi
	Escribir "Has tenido " cont " aciertos"
FinAlgoritmo
