Algoritmo sin_titulo
	Escribir "Introduzca una nota del 0-10"
	Leer nota
	Si nota<3 Entonces
		Escribir "Muy deficiente"
	SiNo
		Si nota<5 Entonces
			Escribir "Insuficiente"
		SiNo
			SI nota<6 Entonces
				Escribir "Bien"
			SiNo
				Si nota<9 Entonces
					Escribir "Notable"
				SiNo
					Escribir "Sobresaliente"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
