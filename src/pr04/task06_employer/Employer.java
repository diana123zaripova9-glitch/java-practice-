public class Employer {
    protected final String firstName,lastName; protected final double income;
    public Employer(String firstName,String lastName,double income){this.firstName=firstName;this.lastName=lastName;this.income=income;}
    public double getIncome(){return income;}
    @Override public String toString(){return firstName+" "+lastName+": "+getIncome();}
}
