package io.smart.library.entities;

import java.util.List;
import java.util.Objects;

public class Section
{

    private String id;
    private String name;
    private int shelfNumber;
    private List<Book> bookList;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Section [id=" + id + ", name=" + name + ", shelfNumber=" + shelfNumber + ", bookList=" + bookList + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(bookList, id, name, shelfNumber);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Section other = (Section) obj;
        return Objects.equals(bookList, other.bookList) && Objects.equals(id, other.id)
                && Objects.equals(name, other.name) && shelfNumber == other.shelfNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Book> getBookList()
    {
        return bookList;
    }

    public void setBookList(List<Book> bookList)
    {
        this.bookList = bookList;
    }

    public int getShelfNumber()
    {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber)
    {
        this.shelfNumber = shelfNumber;
    }

}
