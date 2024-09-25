package mediatheque;

public class CDPrinter implements MediaVisitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
