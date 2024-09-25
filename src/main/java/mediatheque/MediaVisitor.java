package mediatheque;

public interface MediaVisitor {

    void visit(Book book);

    void visit(CD cd);


}
