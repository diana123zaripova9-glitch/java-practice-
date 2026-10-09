public class Phone {
    private final String number, model; private final double weight;
    public Phone(String number,String model,double weight){this.number=number;this.model=model;this.weight=weight;}
    public String getNumber(){return number;} public String getModel(){return model;} public double getWeight(){return weight;}
    public void receiveCall(String name){System.out.println("Звонит "+name);}
    public void receiveCall(String name,String callerNumber){System.out.println("Звонит "+name+" ("+callerNumber+")");}
    public void sendMessage(String... numbers){System.out.println("Сообщение отправлено: "+String.join(", ",numbers));}
    @Override public String toString(){return model+"; номер="+number+"; вес="+weight;}
}
