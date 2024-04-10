#include <iostream>
using namespace std;

int main()
{
	int notas [2][10]=
{
		


	{1,2,3,4,5,6,7,8,9,10},
	{11,12,13,14,15,16,17,18,19,20}
	
};
	cout <<"la nota correpondiente al tercer alumno del grupo 1 es:\n ";
	cout<< notas [0][2];
	
	cout <<"la nota correpondiente al ccuarto alumno del grupo 2 es:\n ";
	cout<< notas [0][3];
	
	cout <<"la nota correpondiente al primer alumno del grupo 2 es: ";
	cout<< notas [1][0];
	
	cout <<"la nota correpondiente al primer alumno del grupo 1 es: ";
	cout<< notas [0][0];
	
	cout <<"la nota correpondiente al cuarto alumno del grupo 4 es: ";
	cout<< notas [3][3];
	
	cout <<"la nota correpondiente al cuarto alumno del grupo 2 es: ";
	cout<< notas [1][3];
	return 0;
}
	
	

