Algoritmo Boletin3Ejercicio2
	Escribir "****CÁLCULO DEL SEGURO DE AUTOMOVIL****";
	Escribir "Escribe tu edad";
	Leer Edad
	Escribir "Escribe tu género (F/M)"; 
	Leer Genero
	Si Genero="M" o Genero="m" Entonces
		Si Edad<30 Entonces
			Escribir "El precio de tu seguro es 450 euros";
		SiNo
			Si Edad<=50 Y Edad>=31 Entonces
				Escribir "El precio de tu seguro es 400 euros";
			SiNo
				Si Edad>50 Entonces
					Escribir "El precio de tu seguro es 350 euros";
				FinSi
			FinSi
		FinSi
	SiNo
		Si Genero="F" o Genero="f" Entonces;
			Si Edad<25 Entonces
				Escribir "El precio de tu seguro es de 400 euros";
			SiNo
				Si Edad>=25 Entonces
					Escribir "El precio de tu seguro es de 350 euros";
				FinSi
			FinSi
		FinSi
		
	FinSi
FinAlgoritmo
