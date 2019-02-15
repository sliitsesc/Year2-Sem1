#include "pch.h"
#include <iostream>
#include "Temperature.h"

using namespace std;

int main(){
    int temp;
    Temperature *temperature = new Temperature();

    cout << Please enter the temperature : << endl;
    cin >> temp;

    if(temperature->isEthylFreezing()){
        cout << "Ethyl will freeze" << endl;
    }
    if(temperature->isEthylBoiling()){
        cout << "Ethyl will boil" << endl;
    }

    if(temperature->isOxygenFreezing()){
        cout << "Oxygen will freeze" << endl;       
    }

    if(temperature->isOxygenBoiling()){
        cout << "Oxygen will boil" << endl;
    }

    if(temperature->isWaterFreezing()){
        cout << "Water will freeze" << endl;
    }

    if(temperature->isWaterBoiling()){
        cout << "Water will boil" << endl;
    }

    delete temperature;
}