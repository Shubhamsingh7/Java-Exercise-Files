package inheritence;



public class Inheritence {

    public static void main(String[] args) {

        Data d = new Data();
        d.setI(45);
        d.setJ(457);

        int a = d.getI();
        int b = d.getJ();

        Div d1 = new Div();
        d1.div(a, b);
        d1.mul(a, b);
        d1.sub(a, b);
        d1.add(a, b);

    }

}
