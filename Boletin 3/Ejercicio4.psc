Algoritmo Boletin3Ejercicio4
	Escribir "**** MI NOTA ****";
	Escribir "Introduce la nota del primer examen:";
	Leer a;
	Escribir "¿Que nota quieres sacar en el trimestre?";
	leer b;
	notaA= a*0.4;
	notaB= b-notaA;
	C= notaB/0.6;
	Si C>10 Entonces
		Escribir "Es imposible porque tendriás que sacar más que un 10";
	SiNo
		Escribir "Para sacar " b " debes sacar un " c " en el segundo examen";
	FinSi
FinAlgoritmo
