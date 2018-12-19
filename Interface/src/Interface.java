/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham Singh
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Implementation i1 = new Implementation();
        i1.show();
        i1.display();
        i1.sqrt();

        Data d = new Data();

        d.setI(58);
        d.setJ(47);

        int i = d.getI();
        int j = d.getJ();

        i1.add(i,j);
        i1.sub(i,j);

    }

}
