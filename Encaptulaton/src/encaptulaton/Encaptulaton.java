/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encaptulaton;

public class Encaptulaton {

    public static void main(String[] args) {

        EncaptulationDemo e1 = new EncaptulationDemo();
        e1.setAge(20);
        e1.setName("Shubham singh");
        e1.setSalary(100000);
        e1.setCity("Delhi");

        System.out.println("Name=" + e1.getName());
        System.out.println("Age=" + e1.getAge());
        System.out.println("Salary=" + e1.getSalary());
        System.out.println("city=" + e1.getCity());
        

    }

}
