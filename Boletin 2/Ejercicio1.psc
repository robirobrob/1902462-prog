Algoritmo Boletin2Ejercicio1
	Escribir "***Edad***";
	Escribir "Introduce el a�o de tu nacimiento:";
	Leer A�o
	si a�o>1900 y a�o<2020 Entonces
		Escribir "Introduce el mes de tu nacimeento:";
		leer mes
		si mes<=12 Entonces
			escribir "Introduce el dia de tu nacimiento:";
			leer dia
			si dia>0 o dia<=31 Entonces
				Escribir "        ";
			SiNo
				Escribir "Dia no valido";
			FinSi
		SiNo
			Escribir "Mes no valido";
		FinSi
	SiNo
		Escribir "A�o no valido";
	FinSi
	Si mes>10 Entonces
		Escribir "Hoy es 8-10-2022, por lo tanto tienes " 2022-a�o-1;
	SiNo
		Si dia>8 Entonces
			Escribir "Hoy es 8-10-2022, por lo tanto tienes " 2022-a�o;
		SiNo
			Escribir "Hoy es 8-10-2022, por lo tanto tienes " 2022-a�o-1;
		FinSi
	FinSi
FinAlgoritmo