package lt.techin.evelinaC;

import lt.techin.library.BookCatalog;
import lt.techin.library.test.AbstractLibraryTest;

public class testTest extends AbstractLibraryTest {
    @Override
    protected BookCatalog createBookCatalog() {
        return new MyLibrary();
    }
}
