package com.darck.tempcalc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GradeController {
    @GetMapping("grade/celsiusToFahrenheit/{value}")
    public ResponseEntity<Double> celsiusToFahrenheit(@PathVariable Double value) {
        double res = Math.round((value * 9 / 5 + 32) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }

    @GetMapping("grade/celsiusToKelvin/{value}")
    public ResponseEntity<Double> celsiusToKelvin(@PathVariable Double value) {
        double res =  Math.round((value + 273.15) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }

    @GetMapping("grade/fahrenheitToCelcius/{value}")
    public ResponseEntity<Double> fahrenheitToCelcius(@PathVariable Double value) {
        double res =  Math.round(((value - 32) * (5f / 9f)) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }

    @GetMapping("grade/farenheitToKelvin/{value}")
    public ResponseEntity<Double> farenheitToKelvin(@PathVariable Double value) {
        double res =  Math.round(((value - 32) * 5/9 + 273.15) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }

    @GetMapping("grade/kelvinToCelsius/{value}")
    public ResponseEntity<Double> kelvinToCelsius(@PathVariable Double value) {
        double res =  Math.round((value - 273.15) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }

    @GetMapping("grade/kelvinToFarenheit/{value}")
    public ResponseEntity<Double> kelvinToFarenheit(@PathVariable Double value) {
        double res =  Math.round(((value -273.15) * 9/5 + 32) * 100.0) / 100.0;
        return ResponseEntity.ok(res);
    }
}
