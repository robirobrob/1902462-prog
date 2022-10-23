Algoritmo Boletin1Ejercicio8
	Escribir "Introduzca 3 Numeros"
	Leer N1
	Leer N2
	Leer N3
	Si (N1>N2) Entonces
		Si (N2>N3) Entonces
			Escribir "Los numeros ordenados son; " N1 ", " N2 " Y " N3 ".";
		SiNo
			Si (N3>N1)
				Escribir "Los numeros ordenados son; " N3 ", " N1 " Y " N2 ".";
			SiNo
				Escribir "Los numeros ordenados son; " N1 ", " N3 " Y " N2 ".";
			FinSi
		FinSi
	SiNo
		Si (N1>N3) Entonces
			Escribir "Los numeros ordenados son; " N2 ", " N1 " Y " N3 ".";
		SiNo
			si	(N3>N2) Entonces
				Escribir "Los numeros ordenados son; " N3 ", " N2 " Y " N1 ".";
			SiNo
				Escribir "Los numeros ordenados son; " N2 ", " N3 " Y " N1 ".";
			FinSi
		FinSi
	FinSi
FinAlgoritmo
