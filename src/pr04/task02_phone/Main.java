public class Main {
    public static void main(String[] args) {
        Phone[] phones={new Phone("+1001","Model A",0.18),new Phone("+1002","Model B",0.20),new Phone("+1003","Model C",0.16)};
        for(Phone p:phones) System.out.println(p);
        phones[0].receiveCall("Анна"); phones[1].receiveCall("Иван","+1009");
        phones[2].sendMessage("+1001","+1002");
    }
}
