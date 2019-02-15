// PreAssignment.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "Menu.h"
#include "Conversion.h"
using namespace std;

int main()
{
	Menu *menu = new Menu();
	Conversion *conversion = new Conversion();
	int option = 1;
	double weight;

	do {
		menu->displayMainMenu();
		cout << "Your Option : ";
		cin >> option;

		switch (option)
		{
		case 1: 
			cout << "Enter weight(Grams) : ";
			cin >> weight;
			cout << "Ounces : " << conversion->gramsToOunces(weight) << endl;
			break;
		case 2:
			cout << "Enter weight(Ounces) : ";
			cin >> weight;
			cout << "Grams : " << conversion->ounToGrams(weight) << endl;
			break;
		case 3:
			cout << "Enter weight(Kilograms) : ";
			cin >> weight;
			cout << "Stones : " << conversion->kgToStone(weight) << endl;
			break;
		case 4:
			cout << "Enter weight(Stones) : ";
			cin >> weight;
			cout << "Kilograms : " << conversion->stoneToKg(weight) << endl;
			break;
		case 5:
			cout << "Enter weight(Pounds) : ";
			cin >> weight;
			cout << "Grams : " << conversion->poundToGram(weight) << endl;
			break;
		case 6:
			cout << "Enter weight(Grams) : ";
			cin >> weight;
			cout << "Pounds : " << conversion->gramToPound(weight);
			break;
		case 0:
			cout << "Exiting................" << endl;
			break;
		default:
			cout << "Invalid option" << endl;
			break;
		}

		cout << "\n" << endl;
	} while (option != 0);

	delete menu, conversion;
 }

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
