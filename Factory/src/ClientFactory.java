public class ClientFactory {
    public static void main( String a[] ) {
/**
 * con la factory si nascondono i dettagli relativi alla costruzione
 * degli oggetti e soprattutto quelli relativi al tipo reale utilizzato
 */
        PolygonFactory theFactory = new PolygonFactory();
        Polygon p = theFactory.createPolygon( 4);
        System.out.format( "Factory.Polygon: %s", p.getType() );
    }
}