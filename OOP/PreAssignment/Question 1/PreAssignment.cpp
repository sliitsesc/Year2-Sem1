
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
