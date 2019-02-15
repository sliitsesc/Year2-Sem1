#include "pch.h"
#include <iostream>

using namespace std;

int main(){
    int temp;
    Temperature *temperature = new Temperature();

    cout << Please enter the temperature : << endl;
    cin >> temp;

    delete temperature;
}