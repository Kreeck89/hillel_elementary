package lesson5;

public class Main {
    public static void main(String[] args) {

        //OBJECT methods
//        int i = 5;
//        Object obj = new Object();
//        Class aClass = obj.getClass();
//        Client client = new Client();
//        System.out.println(aClass.getName());
//        System.out.println(client.getClass().getName());
//
//        System.out.println(client.hashCode());
//        Client client1 = new Client();
//        System.out.println(client1.hashCode());
//
//        boolean equals = client.equals(client1);
//        System.out.println("client.equals(client1): " + equals);
//        boolean wrongEquals = client == client1;
//        System.out.println("client == client1: " + wrongEquals);
//
//        System.out.println("client.toString(): " + client.toString());
//
//        client.setName("Bob");
//        client.setAge(20);
//        client1.setName("Bob");
//        client1.setAge(20);
//        System.out.println("Bob equals Alex: " + client.equals(client1));

        //PRIMITIVES send to method
        int var = 10;
        System.out.println("var before method call: " + var);

        incrementVariable(var);
        System.out.println("var after method call: " + var);

        var = incrementVariable(var);
        System.out.println("var after method call: " + var);

        //OBJECTS send to method
        Client client = new Client();
        client.setName("Bob");
        System.out.println(client.toString());

        changeName(client);
        System.out.println(client.toString());

        //REFERENCE rewrite example
        Client client1 = new Client();
        Client client2 = new Client();
        client1 = client2;

    }

    private static int incrementVariable(int var) {
        var += 100;
        System.out.println("incrementVariable. var: " + var);
        return var;
    }

    private static void changeName(Client client) {
        client.setName("Vasya");
    }
}
