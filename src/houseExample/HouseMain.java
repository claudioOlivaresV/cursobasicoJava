package houseExample;

public class HouseMain {
    static void main(String[] args) {
        House myHouse = new House();


        House myHouse2 = new House(4,6, 20 );

        System.out.println("La cantidad de puerta de la cas es " + myHouse2.getDoors());
        myHouse.openDoor();
        double area = myHouse.calcularArea();
        System.out.println("area" + area);
    }
}
