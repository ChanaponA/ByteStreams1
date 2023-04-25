/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams1;

/**
 *
 * @author potae
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
        circleDecorator.draw();
    
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle);
        rectangleDecorator.draw();
      }          
}
