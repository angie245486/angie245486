#include <iostream>
using namespace std;
int main ()
{

	float matriz [3][3];
	float matriz1 [3][3];
	float matrizSuma [3][3];
	int m, fila, columna;
	
	for (fila=0; fila<3; fila++)
		for(columna=0; columna<3; columna++)
		{
			cout<< "PRIMERA MATRIZ, Inserte el dato de fila "<<fila+1
			<<"y la columna "<< columna+1<<": ";
			cin>> matriz [fila] [columna];
		
		}
		
		for (fila=0; fila<3; fila++)
		for(columna=0; columna<3; columna++)
		{
			cout<< "SEGUNDA MATRIZ, Inserte el dato de fila "<<fila+1
			<<"y la columna "<< columna+1<<": ";
			cin>> matriz1 [fila] [columna];
		}
		for (fila=0; fila<3; fila++)
		for(columna=0; columna<3; columna++)
			matrizSuma[fila][columna] = matriz [fila][columna]
			+ matriz1[fila][columna];
		
		
		cout <<"LA MATRIZ SUMA (A+B) ES: "<<endl;
		for (fila=0; fila<3 ;fila++)
		{
			for (columna=0;columna<3;columna++)
			cout<< matrizSuma[fila][columna]<<" ";
			cout << endl;
		}
		return 0;
}
