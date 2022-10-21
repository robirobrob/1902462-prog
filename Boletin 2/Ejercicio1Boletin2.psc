Algoritmo sin_titulo
	Leer Año
	si año>1900 y año<2020 Entonces
		leer mes
		si mes<12 Entonces
			leer dia
			si dia>0 o dia<31 Entonces
				Escribir "Tienes " 2022-año "años"
			SiNo
				Escribir "Dia no valido"
			FinSi
		SiNo
			Escribir "Mes no valido"
		FinSi
	SiNo
		Escribir "Año no valido"
	FinSi
FinAlgoritmo
