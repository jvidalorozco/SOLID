package com.celeste.myapplication.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.celeste.myapplication.R

/**
* S - Principio de Responsabilidad Unica
* O - Principio de Abierto cerrado
* L - Principio de LisKov
* I - Principio de Segregación de Interfaces
* D - Principio de Inversion de dependencias
*
* Beneficios:
* 1-) Mejora la Cohesion disminuyendo el acoplamiento
* 2-) Mejora la Arquitectura
* 3-) Simplificar el Testing
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}