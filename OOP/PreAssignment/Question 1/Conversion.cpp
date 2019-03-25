#include "pch.h"
#include "Conversion.h"


Conversion::Conversion()
{
}

double Conversion::gramsToOunces(double weight)
{
	return weight * 0.035;
}

double Conversion::ounToGrams(double weight)
{
	return weight * 28.349;
}

double Conversion::kgToStone(double weight)
{
	return weight * 0.157;
}

double Conversion::stoneToKg(double weight)
{
	return weight * 6.350;
}

double Conversion::poundToGram(double weight)
{
	return weight * 453.592;
}

double Conversion::gramToPound(double weight)
{
	return weight * 0.002;
}


Conversion::~Conversion()
{
}
