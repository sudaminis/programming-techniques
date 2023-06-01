package mathbased;

public class Product {
    public  static void main(String...args) {
        int x = 2;
        int y = 5;

        System.out.println(product(x,y));
        System.out.println(productRecursive(x,y));
    }

    private static int productRecursive(int x, int y) {
        if( x == 0) {
            return 0;
        }

        return y + productRecursive(x-1,y);
    }

    private static int product(int x, int y) {
        if( x == 0) {
            return 0;
        }
        int product = 0;

        for( int i = 1; i <= x; i++ ) {
            product += y;
        }
        return product;

    }


}
