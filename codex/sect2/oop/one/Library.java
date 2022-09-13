public class Library{
    String bookName = "Zero to One";
    String authorName = "Peter Theil";
    int quantity = 2;

    public void bookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }
    public int updateQuantity(int newQuantity){
        quantity = newQuantity;
        return quantity;
    }
    public static void main(String[] args){
        Library qwertyLibbary = new Library();
        qwertyLibbary.bookDetails();
        qwertyLibbary.updateQuantity(4);
        System.out.println("Book count for " + qwertyLibbary.bookName + " is " + qwertyLibbary.quantity);
    }   
}