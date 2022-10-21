Algoritmo Boletin2Ejercicio8
	Definir Numero3,Numero2,Numero1 Como numerico
	Escribir "Introduzca los valores para los 3 angulos de un triangulo"
	Escribir "*Recuerde que todos los lados de triangulo deben ser igual a 180º*";
	Leer Numero1
	Leer Numero2
	Leer Numero3
	Si Numero1 = Numero2 y Numero2=Numero3 Entonces
		Escribir "El triangulo es equilatero";
	SiNo
		Si Numero1=Numero2 O Numero2=Numero3 O Numero1=Numero3 Entonces
			Escribir "El triangulo es isosceles";
		SiNo
			Si Numero1<>Numero2 y Numero2<>Numero3 Entonces
				Escribir "El triangulo es escaleno";
			FinSi
		FinSi
	FinSi
FinAlgoritmo
