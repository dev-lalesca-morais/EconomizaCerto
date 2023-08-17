package com.example.economizacerto.view.applicattion

import com.example.economizacerto.view.domain.model.FuelCalculator

class FuelCalculatorUseCase(private val fuelCalculator: FuelCalculator) {
    fun calculateTotalValue(distance: Float, price: Float, autonomy: Float): Float {
        return fuelCalculator.calculateTotalValue(distance, price, autonomy)
    }
}