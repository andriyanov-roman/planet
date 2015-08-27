package planet.metamodel;

import planet.entities.Book;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Book.class)
public class Book_ {
    public static volatile SingularAttribute<Book, String> book_title;
    public static volatile SingularAttribute<Book, Float> price;
    public static volatile SingularAttribute<Book, String> description;
    public static volatile SingularAttribute<Book, String> isbn;
}
