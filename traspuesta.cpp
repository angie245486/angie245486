#include <iostream>
using namespace std;
int main ()

{

	float matriz [2][2];
	float matriz1 [2][2];
	int traspuesta [2][2];
	int m, fila, columna;
	
	for (fila=0; fila<2; fila++)
		for(columna=0; columna<2; columna++)
		{
			cout<< "PRIMERA MATRIZ, Inserte el dato de fila "<<fila+1
			<<"y la columna "<< columna+1<<": ";
			cin>> matriz [fila] [columna];
		
		}
		
		for (fila=0; fila<2; fila++)
		for(columna=0; columna<2; columna++)
		{
			cout<< "SEGUNDA MATRIZ, Inserte el dato de fila "<<fila+1
			<<"y la columna "<< columna+1<<": ";
			cin>> matriz1 [fila] [columna];
		}
		for (fila=0; fila<2; fila++)
		for(columna=0; columna<2; columna++)
		traspuesta[fila][columna] = matriz [fila][columna]
			+ matriz1[columna][fila];
		
		
		cout <<"\nLA MATRIZ ORIGINAL ES: "<<endl;
		for (fila=0; fila<2 ;fila++)
		{
			for (columna=0;columna<2;columna++)
			cout<< matriz[fila][columna]<<" ";
			cout << endl;
		}
		cout << "LA MATRIZ TRASPUESTA ES: \n";
		for (columna =0; columna)
		return 0;
}
