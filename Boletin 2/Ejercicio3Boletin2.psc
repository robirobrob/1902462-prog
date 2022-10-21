Algoritmo sin_titulo
	Definir horas Como Numerica
	Escribir "Introduzca Nombre";
	Leer nombre;
	Escribir "introduzca horas trabajadas esta semana";
	Leer horas;
	Salario=20
	SI horas>35 Entonces
		Escribir "Hola, " nombre " esta semana has trabajado 35 horas a 20$ y " horas-35 " horas a 30$";
	SiNo
		Escribir "Hola, " nombre " esta semana has trabajado " horas " horas a 20$ la hora";
	FinSi		
	SI horas>35 Entonces
		Escribir "Tu salario bruto es de " 35*20 + (horas-35)*(1.5*Salario);
	SIno
		Escribir "Tu salario bruto es de " horas*20;
	FinSi
	Si horas<17.5 Entonces
		Escribir "Tu salario no lleva impuestos al ser demasiado bajo";
		Escribir "Tu salario neto es de " horas*20;
		Escribir "Total de impuestos es 0";
	SiNo
		SI Horas>35 Entonces
			Escribir "Parte del Salario sin impuestos es 350$";
			Escribir "Parte del Salario con 25% de impuestos es 350$";
			Escribir "Parte del Salario al 45% es de " ((Horas-35)*20)*0.55 "$";
			Escribir "Total de impuestos es " 87.5+((horas-35)*20)*0.45 "$";
			Escribir "Tu sueldo neto es de " 350+262.5+((horas-35)*20)*0.55 "$";
			
		SiNo
			Escribir "Parte del Salario sin impuestos es 350$";
			Escribir "Parte del Salario con 25% de impuestos es " ((Horas-17.5)*20)*0.75 "$";
			Escribir "Total de impuestos es " 0.25*((horas-17.5)*20) "$";
			Escribir "Tu sueldo neto es de " 350+((horas-17.5)*20)*0.75 "$";
		FinSi
	FinSi
FinAlgoritmo
