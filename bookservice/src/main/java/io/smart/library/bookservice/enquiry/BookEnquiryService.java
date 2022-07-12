/**
 * 
 */
package io.smart.library.bookservice.enquiry;

import java.util.List;

import io.smart.library.entities.Book;

/**
 * @author sauravchandela95
 *
 */
public interface BookEnquiryService
{
    Book getBookById(String id);
    
    List<Book> getBooksByTitle(String title);
    
    List<Book> getBooksByAuthor(String authorName);
    
    List<Book> getBooksByCategory(String category);
    
    int getBookVolumes(String title, String edition);
    
    Book getBookWithEditionAndVolume(String title,  String edition, int volume);
    
    Book getBookByEdition(String title, String edition);
    
    List<String> getBookEditions(String title);  

}
