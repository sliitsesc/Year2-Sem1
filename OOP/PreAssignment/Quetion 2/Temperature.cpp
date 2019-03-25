#include "pch.h"
#include "Temerature.h"
#include "Temperature.h"

Temperature::Temperature()
{
}

boolean Temperature::isEthlyFreezing(int temp)
{
	return temp < -173;
}

boolean Temperature::isEthlyBoiling(int temp)
{
	return temp > 172;
}

boolean Temperature::isOxygenFreezing(int temp)
{
	return temp < -362;
}

boolean Temperature::isOxygenBoiling(int temp)
{
	return temp > -306;
}

boolean Temperature::isWaterFreezing(int temp)
{
	return temp < 32;
}

boolean Temperature::isWaterBoiling(int temp)
{
	return temp > 212;
}

Temperature::~Temperature()
{
}
