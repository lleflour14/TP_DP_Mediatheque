package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new Book("St-Exupery", "Le petit prince"));
        mediatheque.addItem( new CD(16, "Ce monde est cruel"));
        mediatheque.addItem( new CD(14, "Hit Sale"));
        MediaVisitor cdVisitor = new CDPrinter();
        MediaVisitor bookVisitor = new BookPrinter();
        MediaVisitor catVisitor = new CatalogPrinter();
        mediatheque.accept(cdVisitor);
        mediatheque.accept(bookVisitor);
        mediatheque.accept(catVisitor);
    }
}
