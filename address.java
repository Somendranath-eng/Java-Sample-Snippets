public class address{
 public static void main(String[] args)
{

String address="Delhi, India";

if(address.endsWith("India"))
{
if(address.contains("Meerut")){
System.out.println("You are in Meerut");
}
if(address.contains("Kolkata")){
System.out.println("You are in Kolkata");
}
else{
System.out.println("You are in "+address.split(",")[0]);
}
}
else{
System.out.println("You are not living in India");
} 

}
}