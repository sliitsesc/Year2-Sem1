#include "pch.h"
#include "Menu.h"
#include <iostream>

using namespace std;


Menu::Menu()
{
}

void Menu::displayMainMenu()
{
	cout << "Calulation Menu \n" << endl;

	cout << "1. Grams to ounces" << endl;
	cout << "2. Ounces to Grams" << endl;
	cout << "3. Kilograms to Stone" << endl;
	cout << "4. Stone to Kilograms" << endl;
	cout << "5. Pounds to Grams" << endl;
	cout << "6. Grams to pounds" << endl;
	cout << "0. Exit" << endl;
}

void Menu::displayConversionSubMenu()
{
}

void Menu::displayMy1DArraySubMenu()
{
}


Menu::~Menu()
{
}
