Algoritmo sin_titulo
	Leer A�o
	si a�o>1900 y a�o<2020 Entonces
		leer mes
		si mes<12 Entonces
			leer dia
			si dia>0 o dia<31 Entonces
				Escribir "Tienes " 2022-a�o "a�os"
			SiNo
				Escribir "Dia no valido"
			FinSi
		SiNo
			Escribir "Mes no valido"
		FinSi
	SiNo
		Escribir "A�o no valido"
	FinSi
FinAlgoritmo
