Algoritmo Boletin3Ejercicio1
	Escribir "¿Cuantos teclados quiere comprar?";
	leer A;
	Si A>=8 Entonces
		Escribir "Cada teclado cuesta 20 euros";
		Escribir "El precio final será de " A*20 " euros";
	SiNo
		Si A>=4 Y A<=8 Entonces
			Escribir "Cada teclado cuesta 26 euros";
			Escribir "El precio final será de " A*26 " Euros"
		SiNo
			Si A<=4 Entonces
				Escribir "Cada teclado cuesta 30 euros";
				Escribir "El precio final será de " A*30 " euros";
			FinSi
		FinSi
	FinSi
FinAlgoritmo