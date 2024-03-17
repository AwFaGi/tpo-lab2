package org.example;

import org.example.trig.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigFunctionTest {
    private final Sin sin = new Sin();
    private final Cos cos = new Cos();
    private final Tan tan = new Tan();
    private final Cot cot = new Cot();
    private final Sec sec = new Sec();
    private final Csc csc = new Csc();
    private final TrigonometricFunctionCalculator tfc = new TrigonometricFunctionCalculator(sin, cos, tan, cot, sec, csc);
    private final double accuracy = 1e-6;
    private final double eps = 1e-9;

    @BeforeAll
    public static void prepareEnv() {
        String directoryPath = "src/test/resources/logs/trig/";
        File directory = new File(directoryPath);
        directory.mkdirs();
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Sin.csv")
    @DisplayName("sin(x) test")
    void sinTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/sin.csv");
            double result = sin.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Cos.csv")
    @DisplayName("cos(x) test")
    void cosTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/cos.csv");
            double result = cos.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Tan.csv")
    @DisplayName("tan(x) test")
    void tanTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/tan.csv");
            double result = tan.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Cot.csv")
    @DisplayName("cot(x) test")
    void cotTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/cot.csv");
            double result = cot.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Sec.csv")
    @DisplayName("sec(x) test")
    void secTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/sec.csv");
            double result = sec.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/Csc.csv")
    @DisplayName("csc(x) test")
    void cscTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/csc.csv");
            double result = csc.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e){
            assertEquals("probably zero division", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigCsv/TrigPart.csv")
    @DisplayName("trig part test")
    void trigFuncTest(Double x, Double expected) {
        try {
            CsvFilePrinter csvLogger = new CsvFilePrinter("src/test/resources/logs/trig/trigPart.csv");
            double result = tfc.checkAndCalculate(x, eps);
            csvLogger.log(x, result);
            assertEquals(expected, result, accuracy);
        } catch (ArithmeticException e) {
            assertEquals("x should be <= 0", e.getMessage());
        } catch (IllegalArgumentException e) {
            assertEquals("ODZ exception!", e.getMessage());

        }
    }
}