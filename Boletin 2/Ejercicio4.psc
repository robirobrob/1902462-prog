Algoritmo Boletin2Ejercicio4
	Escribir "Introduzca 3 numeros"
	Leer A;
	Leer B;
	Leer C;
	SI A>B Y A>C Entonces
		Escribir "El numero mayor es " A;
	SiNo
		Si A<B y B>C Entonces
			Escribir "El numero mayor es " B;
		SiNo
			si C>A y C>B Entonces
				Escribir "El numero mayor es " C;
			FinSi
		FinSi
	FinSi
FinAlgoritmo
