/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author junior
 */
public class SideValidator {
    public static void areSidesPositiveValues(double a, double b, double c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
    }
    
    public static void sidesFormTriangle(double a, double b, double c) throws IllegalArgumentException {
        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException("Sides do not form a triangle");
        }
    }
}
