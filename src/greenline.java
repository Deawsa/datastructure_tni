public class greenline {
    static void main() {
        LinkedList station = new LinkedList();
        station.insert("Mo-chit");
        station.insert("Ari");
        station.insert("Sanam-Pao");
        System.out.println("All Stations : "+station.traversal());
        station.insert(2,"Rachakru");
        System.out.println("All Stations : "+station.traversal());
        System.out.println("Total Station: "+station.length());
        System.out.println("First Station: "+station.get(0));
        station.set(0,"Mo-chit (Central Ladprao)");
        System.out.println("All Stations : "+station.traversal());
        station.remove(2);
        System.out.println("All Stations : "+station.traversal());
        station.removeLastElement();
        System.out.println("All Stations : "+station.traversal());
        station.clear();
        System.out.println("Total Station: "+station.length());
        System.out.println("All Stations : "+station.traversal());


    }
}
