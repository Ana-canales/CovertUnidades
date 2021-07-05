package com.example.convertuni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var cantidadConvertir: Double = 0.00;
    var resultadoConversion: Double = 0.00;
    val MilemetrosACemtimetros: String = "Centimetros";
    val MilemetrosAMetros: String = "Metros";
    val MilemetrosAkilometros: String = "Kilometros";
    val conversionAMilimetros: String = "Milimetros";
    var comentarioSalida = "";
    fun Calcular(view: View) {
        var cantidad = findViewById<EditText>(R.id.etOpcionDeConversion).text.toString()
        cantidadConvertir = cantidad!!.toDouble();

        var radio1 = findViewById<RadioButton>(R.id.idMilemetrosACemtimetros)
        var radio2 = findViewById<RadioButton>(R.id.idMilemetrosAMetros)
        var radio3 = findViewById<RadioButton>(R.id.idMilemetrosAkilometros)
        var radio4 = findViewById<RadioButton>(R.id.idcentimetrosAMilimetros)
        var radio5 = findViewById<RadioButton>(R.id.idmetrosAMilimetros)
        var radio6 = findViewById<RadioButton>(R.id.idkilometrosAMilimetros)
        if (radio1.isChecked == true) {
            comentarioSalida = MilemetrosACemtimetros;
            resultadoConversion = cantidadConvertir / 10;
            mostraReultados();
        } else if (radio2.isChecked == true) {
            comentarioSalida = MilemetrosAMetros;
            resultadoConversion = cantidadConvertir / 1000;
            mostraReultados();
        } else if (radio3.isChecked == true) {
            comentarioSalida = MilemetrosAkilometros;
            resultadoConversion = cantidadConvertir / 1000000;
            mostraReultados();
        } else if (radio4.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            resultadoConversion = cantidadConvertir * 10;
            mostraReultados();
        } else if (radio5.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            resultadoConversion = cantidadConvertir * 1000;
            mostraReultados();
        } else if (radio6.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            resultadoConversion = cantidadConvertir * 1000000;
            mostraReultados();
        }

    }

    fun mostraReultados() {

        var Result = findViewById<EditText>(R.id.etResult)
        Result.setText(resultadoConversion.toString() + "  $comentarioSalida");
    }
}