#pragma once
class Conversion
{	
public:
	Conversion();

	double gramsToOunces(double weight);
	double ounToGrams(double weight);
	double kgToStone(double weight);
	double stoneToKg(double weight);
	double poundToGram(double weight);
	double gramToPound(double weight);

	~Conversion();
};

